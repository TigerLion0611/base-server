package com.prototype.model.request;

public class CusInfoReqParams extends PageParam {
    private String code;
    private String customerName;
    private String credentialsNumber;
    private String repaymentDebitCardAccountNumber;
    private String contactPhone;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    public String getRepaymentDebitCardAccountNumber() {
        return repaymentDebitCardAccountNumber;
    }

    public void setRepaymentDebitCardAccountNumber(String repaymentDebitCardAccountNumber) {
        this.repaymentDebitCardAccountNumber = repaymentDebitCardAccountNumber;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
