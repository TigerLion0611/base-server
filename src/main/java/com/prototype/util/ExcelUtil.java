package com.prototype.util;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.StringUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;

public class ExcelUtil {

//    public static void main(String[] args) {
//        Workbook wb =null;
//        Sheet sheet = null;
//        Row row = null;
//        List<Map<String,String>> list = null;
//        String cellData = null;
//        String filePath = "D:\\test.xlsx";
//        String columns[] = {"name","age","score"};
//        wb = readExcel(filePath);
//        if(wb != null){
//            //用来存放表中数据
//            list = new ArrayList<Map<String,String>>();
//            //获取第一个sheet
//            sheet = wb.getSheetAt(0);
//            //获取最大行数
//            int rownum = sheet.getPhysicalNumberOfRows();
//            //获取第一行
//            row = sheet.getRow(0);
//            //获取最大列数
//            int colnum = row.getPhysicalNumberOfCells();
//            for (int i = 1; i<rownum; i++) {
//                Map<String,String> map = new LinkedHashMap<String,String>();
//                row = sheet.getRow(i);
//                if(row !=null){
//                    for (int j=0;j<colnum;j++){
//                        cellData = (String) getCellFormatValue(row.getCell(j));
//                        map.put(columns[j], cellData);
//                    }
//                }else{
//                    break;
//                }
//                list.add(map);
//            }
//        }
//        //遍历解析出来的list
//        for (Map<String,String> map : list) {
//            for (Map.Entry<String,String> entry : map.entrySet()) {
//                System.out.print(entry.getKey()+":"+entry.getValue()+",");
//            }
//            System.out.println();
//        }
//
//    }

    //读取excel
    public static Workbook readExcel(MultipartFile file){
        Workbook wb = null;
        if(file==null){
            return null;
        }
        String fileName = file.getOriginalFilename();
        String extString = fileName.substring(fileName.lastIndexOf("."));
        InputStream is = null;
        try {
            is = file.getInputStream();
            if(".xls".equals(extString)){
                return wb = new HSSFWorkbook(is);
            }else if(".xlsx".equals(extString)){
                return wb = new XSSFWorkbook(is);
            }else{
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell){
        Object cellValue = null;
        if(cell!=null){
            //判断cell类型
            switch(cell.getCellTypeEnum()){
                case NUMERIC:{
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case FORMULA:{
                    //判断cell是否为日期格式
                    if(DateUtil.isCellDateFormatted(cell)){
                        //转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();
                    }else{
                        //数字
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case STRING:{
                    cellValue = cell.getStringCellValue();
                    break;
                }
                default:
                    cellValue = "";
            }
        }else{
            cellValue = "";
        }
        return cellValue;
    }

    /**
     *
     * @param workbook excel 文件
     * @return
     */
    public static List<Map<String, String>> getObjectListFromExcel (Workbook workbook, int n) {

        List<Map<String, String>> mapList = new ArrayList<>();


        Sheet sheet = null;
        Row row = null;
        String cellData = null;


        //获取第n个sheet
        sheet = workbook.getSheetAt(n - 1);

        //获取最大行数
        int rownum = sheet.getLastRowNum();

        //获取最大列数
        Row headRow = sheet.getRow(0);
        int colnum = headRow.getLastCellNum();

        for (int i = 1; i<=rownum; i++) {
            row = sheet.getRow(i);
            if(row != null){
                Map<String, String> map = new HashMap<>();
                for (int j=0;j<=colnum;j++){
                    String cellName = (String) getCellFormatValue(headRow.getCell(j));
                    cellData = (String) getCellFormatValue(row.getCell(j));
                    if(!StringUtils.isEmpty(cellData)) {
                        map.put(cellName, cellData);
                    }
                }
                mapList.add(map);
            }else{
                break;
            }
        }
        return mapList;
    }

}
