package mobileworld;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LandingPage;






	public class signup {	
		
		
		
		@DataProvider
		public Object[][] dp2(){
			return new Object[][] {
				new Object[] {"Bhairavi","Bhumi","bhumi@gamil.com","bhumi12","05/07/2001","9513830369","Welcome to qualitest"
				},
				new Object[] {"Bh","Bhumi","bhumi@gamil.com","b2","05/07/2001","951383","Welcome to qualitest"
				
},
				new Object[] {"bhairavi","bh","bhumi@gmail.com","bhairavibhumi","05/06/6478","6546735871269","Welcome to corporate"},
			};
		}
		
		
		@Test(dataProvider="dp2")
	    public void signUp(String firstname,String lastname,String email,String password,String dob,String phnumber,String shortbio ) throws InterruptedException {
	        // TODO Auto-generated method stub
	         System.setProperty( "webdriver.chrome.driver", "C:/Users/bhairavi.hl/Downloads/chromedriver_win32/chromedriver.exe");
	         	
	         WebDriver driver = new ChromeDriver();
	         
	         LandingPage landingpage2 = new LandingPage(driver);
	         landingpage2.goTo();
	         Thread.sleep(1000);
	         landingpage2.signupapplication(firstname,lastname,email,password ,dob,phnumber,shortbio);
	         Thread.sleep(1000);
	         
	    }



	}


