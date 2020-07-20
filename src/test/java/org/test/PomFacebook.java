package org.test;

import org.pom.LoginPage;

public class PomFacebook extends BaseClass
{
	public static void main(String[] args)
	{
		launchBrowser();
		loadurl("https://www.facebook.com/");
		geturl(); 
		getTitle();
		LoginPage login = new LoginPage();
		insert(login.getTxtEmail(),"arunuvan@gmail.com");
		insert(login.getTxtPass(),"3456789");
		click(login.getBtnLogin().get(0));
		//quiteBrowser();
	}
}

	


