package com.prototype.model.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerInformation {
    @Id
    @Column(name="id", columnDefinition="varchar(32)")
    @GeneratedValue(generator="idGenerator")
    @GenericGenerator(name="idGenerator", strategy="uuid")
    private String id;
    private String reasonOfWithholding; // 扣款失败原因
    private String collector; // 催收人员
    private String code; // 申请编号
    private String contractNumber; // 合同号码
    private String credentialsType; // 证件类型
    private String credentialsNumber; // 证件号码
    private String customerName; //客户姓名
    private String overdueLevel; // 逾期级别
    private String productSolutionName; // 产品方案名称
    private String area; // 区域
    private String branchCompanyName; // 分公司名称
    private String dealerName; // 经销商名称
    private String channelPartner; // 合作渠道
    private String store; // 店面
    private String businessOwnership; // 业务归属
    private String businessType;
    private String currentResidualRent; // 当前剩余租金
    private String entrustmentAmount;// 委托金额
    private String cumulativeOverdueTimes; // 累计逾期次数
    private String principalLenderPhone; // 主贷人电话
    private String mateName; // 配偶姓名
    private String matePhone; // 配偶电话
    private String sponsorName; // 担保人姓名
    private String sponsorPhone; // 担保人电话
    private String contactName; // 联系人姓名
    private String contactPhone; // 联系人电话
    private String provinceOfCustomer; // 客户所在省份
    private String cityOfCustomer; // 客户所在城市
    private String detailedAddress; // 现居住详细地址
    private String homePlacePhone; // 现居住地电话
    private String profession; // 职业
    private String age; // 年龄
    private String downPaymentRatio; // 首付比例
    private String gpsCardNumber; // gps 卡号
    private String applicationType; // 申请类型
    private String methodOfWithholding; // 扣款方式
    private String realRepaymentDay; // 实际还款日
    private String vehicleIsRecovered; // 车辆是否回收
    private String latestOverdueDays; // 最新逾期天数
    private String maxOverdueDays; // 历史最高逾期天数
    private String latestOverdueIssues; // 最新逾期期数
    private String latestOverdueAmount; // 最新逾期金额
    private String latestRepaymentIssues; // 最新还款期数
    private String financingMaturity; // 融资期限
    private String totalFinancingAmount; // 总融资金额
    private String financialCaliberSurplusPrincipal; // 财务口径剩余本金
    private String residualPrincipalOfSales; //销售口径剩余本金
    private String exemptions; // 豁免天数
    private String collectorPinyin; // 催收人员拼音
    private String isOverdue; // 是否逾期
    private String bankOfDepositNameOfRepaymentDebitCard; // 还款借记卡开户行名称
    private String repaymentDebitCardAccountName; // 还款借记卡开户名
    private String repaymentDebitCardAccountNumber; // 还款借记卡账号
    private String brand; // 品牌
    private String audi; // 车系
    private String motorcycleType; // 车型
    private String vehicleColor; // 车辆颜色
    private String engineNumber; // 发动机号
    private String dateOfEntryIntoForceOfContract; // 合同生效日
    private String firstMonthlyPayment; // 首期月供金额
    private String vehicleConfiguration; // 车辆配置
    private String licensePlate; // 车牌号
    private String vinNo; // 车架号
    private String largeAreaCode; // 大区代码
    private String largeAreaName; // 大区名称
    private String vehicleType; // 车辆类型
    private String companyProperty; // 公司属性
    private String rateType; // 利率类型
    private String overdueState; // 逾期状态
    private String riskLevel; // 风险等级
    private String fiveLevelClassification; // 五级分类
    private String stateOfLitigation; // 诉讼状态
    private String litigationPerson; // 诉讼任务人员
    private String homeVisit; // 家访状态
    private String visitingStaff; // 家访任务人员
    private String carCollector; // 收车任务人员
    private String stateOfNonPerformingAssets; // 不良资产状态
    private String nonPerformingAssetsTaskPersonnel; // 不良资产任务人员
    private String overdueDate; // 逾期日期
    private String contractAddedAddress; // 合同添加地
    private String positioningState; // 定位状态


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReasonOfWithholding() {
        return reasonOfWithholding;
    }

    public void setReasonOfWithholding(String reasonOfWithholding) {
        this.reasonOfWithholding = reasonOfWithholding;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOverdueLevel() {
        return overdueLevel;
    }

    public void setOverdueLevel(String overdueLevel) {
        this.overdueLevel = overdueLevel;
    }

    public String getProductSolutionName() {
        return productSolutionName;
    }

    public void setProductSolutionName(String productSolutionName) {
        this.productSolutionName = productSolutionName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBranchCompanyName() {
        return branchCompanyName;
    }

    public void setBranchCompanyName(String branchCompanyName) {
        this.branchCompanyName = branchCompanyName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getChannelPartner() {
        return channelPartner;
    }

    public void setChannelPartner(String channelPartner) {
        this.channelPartner = channelPartner;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getBusinessOwnership() {
        return businessOwnership;
    }

    public void setBusinessOwnership(String businessOwnership) {
        this.businessOwnership = businessOwnership;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCurrentResidualRent() {
        return currentResidualRent;
    }

    public void setCurrentResidualRent(String currentResidualRent) {
        this.currentResidualRent = currentResidualRent;
    }

    public String getEntrustmentAmount() {
        return entrustmentAmount;
    }

    public void setEntrustmentAmount(String entrustmentAmount) {
        this.entrustmentAmount = entrustmentAmount;
    }

    public String getCumulativeOverdueTimes() {
        return cumulativeOverdueTimes;
    }

    public void setCumulativeOverdueTimes(String cumulativeOverdueTimes) {
        this.cumulativeOverdueTimes = cumulativeOverdueTimes;
    }

    public String getPrincipalLenderPhone() {
        return principalLenderPhone;
    }

    public void setPrincipalLenderPhone(String principalLenderPhone) {
        this.principalLenderPhone = principalLenderPhone;
    }

    public String getMateName() {
        return mateName;
    }

    public void setMateName(String mateName) {
        this.mateName = mateName;
    }

    public String getMatePhone() {
        return matePhone;
    }

    public void setMatePhone(String matePhone) {
        this.matePhone = matePhone;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getSponsorPhone() {
        return sponsorPhone;
    }

    public void setSponsorPhone(String sponsorPhone) {
        this.sponsorPhone = sponsorPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getProvinceOfCustomer() {
        return provinceOfCustomer;
    }

    public void setProvinceOfCustomer(String provinceOfCustomer) {
        this.provinceOfCustomer = provinceOfCustomer;
    }

    public String getCityOfCustomer() {
        return cityOfCustomer;
    }

    public void setCityOfCustomer(String cityOfCustomer) {
        this.cityOfCustomer = cityOfCustomer;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getHomePlacePhone() {
        return homePlacePhone;
    }

    public void setHomePlacePhone(String homePlacePhone) {
        this.homePlacePhone = homePlacePhone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(String downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getGpsCardNumber() {
        return gpsCardNumber;
    }

    public void setGpsCardNumber(String gpsCardNumber) {
        this.gpsCardNumber = gpsCardNumber;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getMethodOfWithholding() {
        return methodOfWithholding;
    }

    public void setMethodOfWithholding(String methodOfWithholding) {
        this.methodOfWithholding = methodOfWithholding;
    }

    public String getRealRepaymentDay() {
        return realRepaymentDay;
    }

    public void setRealRepaymentDay(String realRepaymentDay) {
        this.realRepaymentDay = realRepaymentDay;
    }

    public String getVehicleIsRecovered() {
        return vehicleIsRecovered;
    }

    public void setVehicleIsRecovered(String vehicleIsRecovered) {
        this.vehicleIsRecovered = vehicleIsRecovered;
    }

    public String getLatestOverdueDays() {
        return latestOverdueDays;
    }

    public void setLatestOverdueDays(String latestOverdueDays) {
        this.latestOverdueDays = latestOverdueDays;
    }

    public String getMaxOverdueDays() {
        return maxOverdueDays;
    }

    public void setMaxOverdueDays(String maxOverdueDays) {
        this.maxOverdueDays = maxOverdueDays;
    }

    public String getLatestOverdueIssues() {
        return latestOverdueIssues;
    }

    public void setLatestOverdueIssues(String latestOverdueIssues) {
        this.latestOverdueIssues = latestOverdueIssues;
    }

    public String getLatestOverdueAmount() {
        return latestOverdueAmount;
    }

    public void setLatestOverdueAmount(String latestOverdueAmount) {
        this.latestOverdueAmount = latestOverdueAmount;
    }

    public String getLatestRepaymentIssues() {
        return latestRepaymentIssues;
    }

    public void setLatestRepaymentIssues(String latestRepaymentIssues) {
        this.latestRepaymentIssues = latestRepaymentIssues;
    }

    public String getFinancingMaturity() {
        return financingMaturity;
    }

    public void setFinancingMaturity(String financingMaturity) {
        this.financingMaturity = financingMaturity;
    }

    public String getTotalFinancingAmount() {
        return totalFinancingAmount;
    }

    public void setTotalFinancingAmount(String totalFinancingAmount) {
        this.totalFinancingAmount = totalFinancingAmount;
    }

    public String getFinancialCaliberSurplusPrincipal() {
        return financialCaliberSurplusPrincipal;
    }

    public void setFinancialCaliberSurplusPrincipal(String financialCaliberSurplusPrincipal) {
        this.financialCaliberSurplusPrincipal = financialCaliberSurplusPrincipal;
    }

    public String getResidualPrincipalOfSales() {
        return residualPrincipalOfSales;
    }

    public void setResidualPrincipalOfSales(String residualPrincipalOfSales) {
        this.residualPrincipalOfSales = residualPrincipalOfSales;
    }

    public String getExemptions() {
        return exemptions;
    }

    public void setExemptions(String exemptions) {
        this.exemptions = exemptions;
    }

    public String getCollectorPinyin() {
        return collectorPinyin;
    }

    public void setCollectorPinyin(String collectorPinyin) {
        this.collectorPinyin = collectorPinyin;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    public String getBankOfDepositNameOfRepaymentDebitCard() {
        return bankOfDepositNameOfRepaymentDebitCard;
    }

    public void setBankOfDepositNameOfRepaymentDebitCard(String bankOfDepositNameOfRepaymentDebitCard) {
        this.bankOfDepositNameOfRepaymentDebitCard = bankOfDepositNameOfRepaymentDebitCard;
    }

    public String getRepaymentDebitCardAccountName() {
        return repaymentDebitCardAccountName;
    }

    public void setRepaymentDebitCardAccountName(String repaymentDebitCardAccountName) {
        this.repaymentDebitCardAccountName = repaymentDebitCardAccountName;
    }

    public String getRepaymentDebitCardAccountNumber() {
        return repaymentDebitCardAccountNumber;
    }

    public void setRepaymentDebitCardAccountNumber(String repaymentDebitCardAccountNumber) {
        this.repaymentDebitCardAccountNumber = repaymentDebitCardAccountNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAudi() {
        return audi;
    }

    public void setAudi(String audi) {
        this.audi = audi;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getDateOfEntryIntoForceOfContract() {
        return dateOfEntryIntoForceOfContract;
    }

    public void setDateOfEntryIntoForceOfContract(String dateOfEntryIntoForceOfContract) {
        this.dateOfEntryIntoForceOfContract = dateOfEntryIntoForceOfContract;
    }

    public String getFirstMonthlyPayment() {
        return firstMonthlyPayment;
    }

    public void setFirstMonthlyPayment(String firstMonthlyPayment) {
        this.firstMonthlyPayment = firstMonthlyPayment;
    }

    public String getVehicleConfiguration() {
        return vehicleConfiguration;
    }

    public void setVehicleConfiguration(String vehicleConfiguration) {
        this.vehicleConfiguration = vehicleConfiguration;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }

    public String getLargeAreaCode() {
        return largeAreaCode;
    }

    public void setLargeAreaCode(String largeAreaCode) {
        this.largeAreaCode = largeAreaCode;
    }

    public String getLargeAreaName() {
        return largeAreaName;
    }

    public void setLargeAreaName(String largeAreaName) {
        this.largeAreaName = largeAreaName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCompanyProperty() {
        return companyProperty;
    }

    public void setCompanyProperty(String companyProperty) {
        this.companyProperty = companyProperty;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getOverdueState() {
        return overdueState;
    }

    public void setOverdueState(String overdueState) {
        this.overdueState = overdueState;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getFiveLevelClassification() {
        return fiveLevelClassification;
    }

    public void setFiveLevelClassification(String fiveLevelClassification) {
        this.fiveLevelClassification = fiveLevelClassification;
    }

    public String getStateOfLitigation() {
        return stateOfLitigation;
    }

    public void setStateOfLitigation(String stateOfLitigation) {
        this.stateOfLitigation = stateOfLitigation;
    }

    public String getLitigationPerson() {
        return litigationPerson;
    }

    public void setLitigationPerson(String litigationPerson) {
        this.litigationPerson = litigationPerson;
    }

    public String getHomeVisit() {
        return homeVisit;
    }

    public void setHomeVisit(String homeVisit) {
        this.homeVisit = homeVisit;
    }

    public String getVisitingStaff() {
        return visitingStaff;
    }

    public void setVisitingStaff(String visitingStaff) {
        this.visitingStaff = visitingStaff;
    }

    public String getCarCollector() {
        return carCollector;
    }

    public void setCarCollector(String carCollector) {
        this.carCollector = carCollector;
    }

    public String getStateOfNonPerformingAssets() {
        return stateOfNonPerformingAssets;
    }

    public void setStateOfNonPerformingAssets(String stateOfNonPerformingAssets) {
        this.stateOfNonPerformingAssets = stateOfNonPerformingAssets;
    }

    public String getNonPerformingAssetsTaskPersonnel() {
        return nonPerformingAssetsTaskPersonnel;
    }

    public void setNonPerformingAssetsTaskPersonnel(String nonPerformingAssetsTaskPersonnel) {
        this.nonPerformingAssetsTaskPersonnel = nonPerformingAssetsTaskPersonnel;
    }

    public String getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(String overdueDate) {
        this.overdueDate = overdueDate;
    }

    public String getContractAddedAddress() {
        return contractAddedAddress;
    }

    public void setContractAddedAddress(String contractAddedAddress) {
        this.contractAddedAddress = contractAddedAddress;
    }

    public String getPositioningState() {
        return positioningState;
    }

    public void setPositioningState(String positioningState) {
        this.positioningState = positioningState;
    }
}
