package org.hote;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datad {
	public static void main(String[] args) throws IOException {
		File location=new File("C:\\Users\\USER\\eclipse-workspace\\MavenPro\\src\\test\\resources\\sat.xls.xlsx");
		FileInputStream fis=new FileInputStream(location);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheet("satdetails");
		Row r=s.getRow(2);
		//System.out.println(r);
		Cell c=r.getCell(3);
		//System.out.println(c);
		int type = c.getCellType();
		if(type==1) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
				String value = sf.format(d);
				System.out.println(value);
			}
		else {
			double db = c.getNumericCellValue();
			long ln=(long) db;
			String value=String.valueOf(ln);
			System.out.println(value);
		}}
//		int rowcount = s.getPhysicalNumberOfRows();
//		System.out.println(rowcount);
//		int cellcount = r.getPhysicalNumberOfCells();
//		System.out.println(cellcount);
//		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
//			Row row=s.getRow(i);
//			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
//				Cell cell=row.getCell(j);
//				System.out.println(cell);
//			}
//		}
	}}


