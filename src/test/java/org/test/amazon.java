package org.test;

import org.pom.AmazonSearchPage;

public class amazon extends BaseClass 
{
	public static void main(String[] args)
{
		launchBrowser();
		loadurl("https://www.amazon.in/");
		AmazonSearchPage search= new AmazonSearchPage();
		insert(search.getTxtSearch(),"iphone");
		click(search.getBtnSearch().get(0));
		
		
		
}

}
