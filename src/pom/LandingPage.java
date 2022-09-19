package pom;

	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;






	public class LandingPage {
	    
	    WebDriver driver;
	    
	    public LandingPage(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    //WebElement myName = driver.findElement(By.id("myName"));
	    
	    
	    //PageFactor
	    //SignUp
	    @FindBy(xpath="//*[text()='SIGN IN']")
	    WebElement signin;
	    
	    @FindBy(css="a[href='signup.html']")
	    WebElement signup;
	    
	    @FindBy(id="myName")
	    WebElement firstname;
	    
	    @FindBy(css="input[placeholder='Last Name']")
	    WebElement lastname;
	    
	    @FindBy(css="input[placeholder='Enter Email']")
	    WebElement email;
	    
	    @FindBy(css="input[placeholder='Password']")
	    WebElement singuppassword;
	    
	    @FindBy(css="input[type='date']")
	    WebElement date;
	    
	    @FindBy(css="div[class='col-md-2'] input[name='gender']")
	    WebElement gender;
	    
	    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
	    WebElement mobile;
	    
	    @FindBy(css="textarea[placeholder='Short Bio']")
	    WebElement shortbio;
	    
	    @FindBy(xpath="//button[normalize-space()='Register']")
	    WebElement register;
	    
	  //Signin  
	    @FindBy(id="username")
	    WebElement username;
	    
	    @FindBy(id="password")
	    WebElement signinpassword;
	    
	    @FindBy(css="a[type='submit']")
	    WebElement submit;
	    
	   



	
	
	    
	    //All mobile
	    @FindBy(xpath="//a[normalize-space()='All Mobiles']")
	    WebElement allmobile;
	    
	    @FindBy(xpath="//input[@id='myInput']")
	    WebElement search;
	    
	    @FindBy(linkText="Order")
	    WebElement order;
	    
	    @FindBy(css="body > footer:nth-child(9) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	    WebElement Home;

	    public void goTo()
	    {
	        driver.get("https://mobileworld.banyanpro.com/");
	    }





	  public void signinapplication(String name,String pwd) throws InterruptedException
	    {
	        signin.click();
	        username.sendKeys(name);
	        Thread.sleep(1000);
	        signinpassword.sendKeys(pwd);
	        Thread.sleep(1000);
	        submit.click();
	    }
	  
	 


	  public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio)
	    {
	        signin.click();
	        signup.click();
	        firstname.sendKeys(fname);
	        lastname.sendKeys(lname);
	        email.sendKeys(mail);
	        singuppassword.sendKeys(uppwd);
	        date.sendKeys(dob);
	        gender.click();
	        mobile.sendKeys(phone);
	        shortbio.sendKeys(bio);
	        register.click();
	    }
	  public void allmobileapplication(String Sname) throws InterruptedException
	  {
		  allmobile.click();
		  search.sendKeys(Sname);
		  Thread.sleep(1000);
		  order.click();
		  Thread.sleep(1000);
		  Home.click();
		  
		  
		  
	  }
	}
	
	
	
	
	
	
	