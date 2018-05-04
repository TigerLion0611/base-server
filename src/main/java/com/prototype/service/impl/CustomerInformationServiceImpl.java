package com.prototype.service.impl;

import com.prototype.model.dto.CustomerInformation;
import com.prototype.model.enums.CustomerInformationMapping;
import com.prototype.service.CustomerInformationService;
import com.prototype.util.ExcelUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;


@Service
public class CustomerInformationServiceImpl implements CustomerInformationService {
    @Override
    public List<CustomerInformation> convertFromExcel(Workbook workbook) {
        List<Map<String,String>> mapList = ExcelUtil.getObjectListFromExcel(workbook, 1);
        return covertToCustomerInformationByEnum(mapList);
    }


    private List<CustomerInformation> covertToCustomerInformationByEnum(List<Map<String,String>> mapList){
        List<CustomerInformation> customerInformationList = new ArrayList<>();
        Field[] fields = CustomerInformation.class.getDeclaredFields();
        List<Field> fieldList = Arrays.asList(fields);
        mapList.forEach(map -> {
            CustomerInformation customerInformation = new CustomerInformation();
            map.forEach((k, v) -> {
                CustomerInformationMapping cim = CustomerInformationMapping.getSourceByExcelName(k);
                if (cim != null) {
                    Field matchField = fieldList.stream().filter(field -> field.getName().equals(cim.name())).findFirst().get();
                    try {
                        matchField.setAccessible(true);
                        String type = cim.getType();
                        if("Integer".equals(type) && v.contains(".")) {
                            matchField.set(customerInformation, v.substring(0, v.indexOf(".")));
                        } else {
                            matchField.set(customerInformation, v);
                        }
                        matchField.setAccessible(false);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
            customerInformationList.add(customerInformation);
        });
        return customerInformationList;
    }
}
