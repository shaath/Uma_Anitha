package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLibrary;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlops {

	public static void main(String[] args) throws IOException 
	{
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String xlpath=System.getProperty("user.dir")+"\\src\\testdata\\Emp_Testdata.xlsx";
		String xlout=System.getProperty("user.dir")+"\\src\\results\\Empres.xlsx";
		
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//***************************************************************		
		//Reading the 6th row 1st column data
//		XSSFRow r=ws.getRow(5);
//		XSSFCell c=r.getCell(0);
//		
//		String data=c.getStringCellValue();
//		System.out.println(data);
//****************************************************************		
		//Getting the last row index
		int rc=ws.getLastRowNum();
		System.out.println(rc);
//****************************************************************
		/*Getting number of columns
		int cc=ws.getRow(0).getLastCellNum();
		System.out.println(cc);*/
//****************************************************************
		
		om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		
		//Reading the total data from Excel
		for (int i = 1; i <= rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c1=r.getCell(0);
			XSSFCell c2=r.getCell(1);
			//Creating cell
			XSSFCell c3=r.createCell(2);
			
			String f=c1.getStringCellValue();
			String l=c2.getStringCellValue();
			
			System.out.println(f+"---"+l);
			
			String res=om.org_EmployeeReg(f, l);
			
			
			
			//Writing the into cell
			c3.setCellValue(res);
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
