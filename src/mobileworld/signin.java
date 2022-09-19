package mobileworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.LandingPage;

public class signin {
	
	@DataProvider
	public Object[][] dp1(){
		return new Object[][]{
			new Object[] {
					"Bhairavi","Bhairavi1"
			},
			new Object[] {
					"bh","Pas"
			},
			new Object[] {
					"hggdcvgvcuyeguyefgcuygf","fdtfvdgvtyg"
			},
		};
	}
	
	
	
@Test(dataProvider="dp1")
public void sign(String user, String pass) throws InterruptedException {
    
     System.setProperty("webdriver.chrome.driver","C:/Users/bhairavi.hl/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get(" https://mobileworld.banyanpro.com/");
         LandingPage landingpage = new LandingPage(driver);
         landingpage.goTo();
         landingpage.signinapplication(user, pass);
          
       
    }
}


