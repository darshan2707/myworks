package com.testingone.utility;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_lib {

	//static String file="/home/ebuser/Desktop/en.xls";
	static String file="D:/xl/test.xls";
	
	public static void main(String args[]) throws InvalidFormatException, IOException{
	
	Excel_lib lib= new Excel_lib();
	//DataFormatter df = new DataFormatter();
	
	String ret= lib.getCelldata("Sheet1", 0,0 );
	
	System.out.println(ret);
	
	
}
		
	
	
	public String getCelldata(String sheetname,int rowno,int cellno) throws IllegalFormatException, IOException,EOFException {
		
		String retval=null;

	try {
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb= WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Sheet s=wb.getSheet(sheetname);
		
		Row r=s.getRow(rowno);
				
		Cell c=r.getCell(cellno);
		  
		retval = df.formatCellValue(c);
		 
		//retval=c.getStringCellValue();
				
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(InvalidFormatException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	return retval;
		
	}
	
	public void writeDataToExcel(String sheetName, int rowNum, int cellNum, String data){
		try {
			FileInputStream fis = new FileInputStream(file);
			//get the workbook object
			Workbook wb = WorkbookFactory.create(fis);
			//get the sheet [a particular sheet in the workbook]
			Sheet s = wb.getSheet(sheetName);
			//get the row where data needs to be written. This step 
			//assumes that we are writing to a cell in an existing row
			Row r = s.getRow(rowNum);			
			//Create the cell in that row. If we are trying to write to
			//a cell which has not been created, it will throw error. First
			//we need to create a cell, then set the value of the cell
			//This step is not needed if we are writing to an existing cell
			Cell c = r.createCell(cellNum);			
			c.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}	
