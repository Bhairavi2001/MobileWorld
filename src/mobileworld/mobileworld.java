package mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LandingPage;

public class mobileworld {
	@DataProvider
	public Object[][] dp3(){
		return new Object[][] {
			new Object[] {
					"Samsung Galaxy S21"},
			       new Object[] {
			    		   "Samsung Galaxy Z"
		},
	};
		
		
	}

		@Test(dataProvider="dp3")
		public void mobile(String searchBox) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","C:/Users/bhairavi.hl/Downloads/chromedriver_win32/chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         
	         //driver.get(" https://mobileworld.banyanpro.com/");
	         LandingPage landingpage = new LandingPage(driver);
	         landingpage.goTo();
	        
	         landingpage.allmobileapplication(searchBox);
	        
	         
		}

}
