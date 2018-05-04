package com.prototype.dao;

import com.prototype.model.dto.CustomerInformation;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerInformationDao extends JpaSpecificationExecutor,PagingAndSortingRepository<CustomerInformation, String> {
}
