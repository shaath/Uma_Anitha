package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException 
	{
		OrgHRMLibrary om=new OrgHRMLibrary();
		
		String res=om.org_Launch("firefox", "http://opensource.demo.orangehrmlive.com/");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Vignankumar1234", "Vignankumar1234");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Browser/Application Closed successfully");

	}

}
