package com.prototype.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum CustomerInformationMapping {
    reasonOfWithholding("扣款失败原因"), // 扣款失败原因
    collector("催收人员"), // 催收人员
    code("申请编号", "Integer"), // 申请编号
    contractNumber("合同号码"), // 合同号码
    credentialsType("证件类型"), // 证件类型
    credentialsNumber("证件号码", "Integer"), // 证件号码
    customerName("客户姓名"), //客户姓名
    overdueLevel("逾期级别"), // 逾期级别
    productSolutionName("产品方案名称"), // 产品方案名称
    area("区域"), // 区域
    branchCompanyName("分公司名称"), // 分公司名称
    dealerName("经销商名称"), // 经销商名称
    channelPartner("合作渠道"), // 合作渠道
    store("店面"), // 店面
    businessOwnership("业务归属"), // 业务归属
    businessType("业务类型"), //业务类型
    currentResidualRent("当前剩余租金"), // 当前剩余租金
    entrustmentAmount("委托金额"), // 委托金额
    cumulativeOverdueTimes("累计逾期次数"), // 累计逾期次数
    principalLenderPhone("主贷人电话"), // 主贷人电话
    mateName("配偶姓名"), // 配偶姓名
    matePhone("配偶手机"), // 配偶手机
    sponsorName("担保人姓名"), // 担保人姓名
    sponsorPhone("担保人电话"), // 担保人电话
    contactName("联系人姓名"), // 联系人姓名
    contactPhone("联系人电话"), // 联系人电话
    provinceOfCustomer("客户所在省份"), // 客户所在省份
    cityOfCustomer("客户所在城市"), // 客户所在城市
    detailedAddress("现居住地详细地址"), // 现居住详细地址
    homePlacePhone("现居住地电话"), // 现居住地电话
    profession("职业"), // 职业
    age("年龄", "Integer"), // 年龄
    downPaymentRatio("首付比例"), // 首付比例
    gpsCardNumber("GPS卡号"), // GPS卡号
    applicationType("申请类型"), // 申请类型
    methodOfWithholding("扣款方式"), // 扣款方式
    realRepaymentDay("实际还款日"), // 实际还款日
    vehicleIsRecovered("车辆是否收回"), // 车辆是否收回
    latestOverdueDays("最新逾期天数", "Integer"), // 最新逾期天数
    maxOverdueDays("历史最高逾期天数"), // 历史最高逾期天数
    latestOverdueIssues("最新逾期期数", "Integer"), // 最新逾期期数
    latestOverdueAmount("最新逾期金额"), // 最新逾期金额
    latestRepaymentIssues("最新还款期数", "Integer"), // 最新还款期数
    financingMaturity("融资期限", "Integer"), // 融资期限
    totalFinancingAmount("总融资额"), // 总融资额
    financialCaliberSurplusPrincipal("财务口径剩余本金"), // 财务口径剩余本金
    residualPrincipalOfSales("销售口径剩余本金"), //销售口径剩余本金
    exemptions("豁免天数"), // 豁免天数
    collectorPinyin("催收人员拼音"), // 催收人员拼音
    isOverdue("是否逾期"), // 是否逾期
    bankOfDepositNameOfRepaymentDebitCard("还款借记卡开户行名称"), // 还款借记卡开户行名称
    repaymentDebitCardAccountName("还款借记卡开户名"), // 还款借记卡开户名
    repaymentDebitCardAccountNumber("还款借记卡帐号"), // 还款借记卡账号
    brand("品牌"), // 品牌
    audi("车系"), // 车系
    motorcycleType("车型"), // 车型
    vehicleColor("车辆颜色"), // 车辆颜色
    engineNumber("发动机号"), // 发动机号
    dateOfEntryIntoForceOfContract("合同生效日"), // 合同生效日
    firstMonthlyPayment("首期月供金额"), // 首期月供金额
    vehicleConfiguration("车辆配置"), // 车辆配置
    licensePlate("车牌号码"), // 车牌号码
    vinNo("车架号"), // 车架号
    largeAreaCode("大区代码"), // 大区代码
    largeAreaName("大区名称"), // 大区名称
    vehicleType("车辆类型"), // 车辆类型
    companyProperty("公司属性"), // 公司属性
    rateType("利率类型"), // 利率类型
    overdueState("逾期状态"), // 逾期状态
    riskLevel("风险等级"), // 风险等级
    fiveLevelClassification("五级分类"), // 五级分类
    stateOfLitigation("诉讼状态"), // 诉讼状态
    litigationPerson("诉讼任务人员"), // 诉讼任务人员
    homeVisit("家访状态"), // 家访状态
    visitingStaff("家访任务人员"), // 家访任务人员
    carCollector("收车任务人员"), // 收车任务人员
    stateOfNonPerformingAssets("不良资产状态"), // 不良资产状态
    nonPerformingAssetsTaskPersonnel("不良资产任务人员"), // 不良资产任务人员
    overdueDate("逾期日期"), // 逾期日期
    contractAddedAddress("合同添加地"), // 合同添加地
    positioningState("定位状态");// 定位状态

    private String excelName;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    CustomerInformationMapping(String excelName) {
        this.excelName = excelName;
    }
    CustomerInformationMapping(String excelName, String type) {
        this.excelName = excelName;
        this.type = type;
    }
    private static  Map<String, CustomerInformationMapping> excelNameMap = new HashMap<>();

    static {
        CustomerInformationMapping[] values = CustomerInformationMapping.values();
        for (CustomerInformationMapping value : values) {
            excelNameMap.put(value.excelName, value);
        }
    }

    public static CustomerInformationMapping getSourceByExcelName (String excelName) {
        return excelNameMap.get(excelName);
    }


//    public static void main(String[] args) {
//        CustomerInformationMapping customerInformation = CustomerInformationMapping.getSourceByExcelName("定位状态");
//        System.out.printf(customerInformation.toString());
//    }
}
