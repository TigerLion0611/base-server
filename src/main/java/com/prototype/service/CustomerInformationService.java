package com.prototype.service;

import com.prototype.model.dto.CustomerInformation;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Collection;
import java.util.List;

public interface CustomerInformationService {
    List<CustomerInformation> convertFromExcel (Workbook workbook);
}
