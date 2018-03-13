package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String res=om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Browser/Application Closed successfully");
		
		//EmpReg
		
		res=om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_EmployeeReg("Sandeep", "Kumar");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Browser/Application Closed successfully");
		//Userreg
		res=om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_Userreg("Sandeep Kumar", "Sandeepkumar1234", "Sandeepkumar1234", "Sandeepkumar1234");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Browser/Application Closed successfully");
		
		//Userlogin
		res=om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Sandeepkumar1234", "Sandeepkumar1234");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Browser/Application Closed successfully");
	}

}
