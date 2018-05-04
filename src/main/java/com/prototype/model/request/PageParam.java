package com.prototype.model.request;

import javax.validation.constraints.Min;

public class PageParam {
    @Min(1)
    private Integer pageSize;
    @Min(1)
    private Integer pageNumber;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
