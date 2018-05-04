package com.prototype.controller;


import com.prototype.dao.CustomerInformationDao;
import com.prototype.model.dto.CustomerInformation;
import com.prototype.model.request.CusInfoReqParams;
import com.prototype.service.CustomerInformationService;
import com.prototype.util.ExcelUtil;
import com.prototype.util.GsonUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.*;
import java.util.List;

@RestController
@RequestMapping("/customerInformation")
public class CustomerInformationController {

    @Autowired
    private CustomerInformationService service;

    @Autowired
    private CustomerInformationDao dao;

    @RequestMapping("/addByExcel")
    public String addByExcel (MultipartFile file) {
        if (!file.isEmpty()) {
            Workbook workbook = ExcelUtil.readExcel(file);
            if (workbook != null) {
                List<CustomerInformation> customerInformationList = service.convertFromExcel(workbook);
                dao.save(customerInformationList);
            }

        }
        return "";
    }

    @RequestMapping("/list")
    public String list (CusInfoReqParams reqParams) {
        Pageable pageable = new PageRequest(reqParams.getPageNumber() - 1, reqParams.getPageSize());
        Page<CustomerInformation> customerInformationList = dao.findAll((root, query, builder) -> {
            Predicate predicate = builder.conjunction();
            if (!StringUtils.isEmpty(reqParams.getCode())) {
                predicate.getExpressions().add(builder.like(root.<String>get("code"), "%" + reqParams.getCode() + "%"));
            }
            if (!StringUtils.isEmpty(reqParams.getContactPhone())) {
                predicate.getExpressions().add(builder.like(root.<String>get("contactPhone"), "%" + reqParams.getContactPhone() + "%"));
            }
            if (!StringUtils.isEmpty(reqParams.getCredentialsNumber())) {
                predicate.getExpressions().add(builder.like(root.<String>get("credentialsNumber"), "%" +reqParams.getCredentialsNumber() + "%"));
            }
            if (!StringUtils.isEmpty(reqParams.getCustomerName())) {
                predicate.getExpressions().add(builder.like(root.<String>get("customerName"), "%" + reqParams.getCustomerName() + "%"));
            }
            if (!StringUtils.isEmpty(reqParams.getRepaymentDebitCardAccountNumber())) {
                predicate.getExpressions().add(builder.like(root.<String>get("repaymentDebitCardAccountNumber"), "%" + reqParams.getRepaymentDebitCardAccountNumber() + "%"));
            }
            return predicate;
        }, pageable);
        return GsonUtil.buildPage(customerInformationList);
    }

}
