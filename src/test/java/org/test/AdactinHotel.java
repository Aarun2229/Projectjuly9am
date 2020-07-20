package org.test;

import org.pom.AdactinHotelAppPom;

public class AdactinHotel  extends BaseClass
{
	public static void main(String[] args)
	{
		launchBrowser();
		loadurl("http://adactinhotelapp.com/");
		maxmize();
		AdactinHotelAppPom reg = new AdactinHotelAppPom();
		click(reg.getLogBtn());
	}

}
