package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLibrary;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class keyworddriven {

	public static void main(String[] args) throws IOException
	{
		String res=null;
		OrgHRMLibrary ohm=new OrgHRMLibrary();
		String xlpath="F:\\UmaRecordings\\Workspace\\SeleniumProject\\src\\testdata\\Keyword.xlsx";
		String xlout="F:\\UmaRecordings\\Workspace\\SeleniumProject\\src\\results\\keyres1.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("Testdata");
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcid=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcid)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) {
						case "Launch":
							String br=ws2.getRow(1).getCell(0).getStringCellValue();
							String url=ws2.getRow(1).getCell(1).getStringCellValue();
							res=ohm.org_Launch(br, url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(2).getStringCellValue();
							String p=ws2.getRow(1).getCell(3).getStringCellValue();
							res=ohm.org_Login(u, p);
							break;
						case "logout":
							res=ohm.org_Logout();
							ohm.org_Close();
							break;
						case "Empreg":
							String  f=ws2.getRow(1).getCell(4).getStringCellValue();
							String l=ws2.getRow(1).getCell(5).getStringCellValue();
							res=ohm.org_EmployeeReg(f, l);
							break;
						case "Usereg":
							String  ename=ws2.getRow(1).getCell(6).getStringCellValue();
							String uname=ws2.getRow(1).getCell(7).getStringCellValue();
							String  pswd=ws2.getRow(1).getCell(8).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(9).getStringCellValue();
							res=ohm.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws2.getRow(1).getCell(7).getStringCellValue();
							String  pwd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=ohm.org_Login(un, pwd);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
