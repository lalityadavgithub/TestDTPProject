package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	 

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dtpapptestv1.mloyalcapture.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//Login
		driver.findElement(By.id("textsearch")).sendKeys("lalitadmin");
		driver.findElement(By.id("Password")).sendKeys("1234");
		Thread.sleep(15000);
		driver.findElement(By.id("btnSub")).click();
		
		Thread.sleep(3000); 
		// mouseover
		 Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//a[@id='3||2']"))).build().perform();
	    Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='15||2']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='58||2']"))).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("btnFormNumber")).click();
		Thread.sleep(3000);
        
		//Customertype
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_CustomerTypeID']//span[contains(text(),'Select Customer Type')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Fleet']")).click();
		Thread.sleep(1000);

		//customersubtype

		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_CustomerSubTypeID']")).click();
		driver.findElement(By.xpath("//label[text()='Truck Fleet']")).click();
		Thread.sleep(1000);
		//zonal office
		driver.findElement(By.xpath("//span[normalize-space()='Select Zonal Office']")).click();
		driver.findElement(By.xpath("//label[text()='EAST ZONE']")).click();
		Thread.sleep(1000);

		//Regional office
		driver.findElement(By.xpath("//span[normalize-space()='Select Regional Office']")).click();
		driver.findElement(By.xpath("//label[text()='KOLKATA RRO']")).click();
		Thread.sleep(1000);

		//Sales  area
		driver.findElement(By.xpath("//span[normalize-space()='Select Sales Area']")).click();
		driver.findElement(By.xpath("//label[text()='Howrah Retail S.A.']")).click();
		Thread.sleep(1000);

		//Type of CUstomer
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_TypeOfCustomerID']//span[contains(text(),'Select Customer Type')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='New Customer']")).click();
		Thread.sleep(1000);

		//Tier of Customer
		driver.findElement(By.xpath("//span[normalize-space()='Select Tier Of Customer']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='1']")).click();
		Thread.sleep(1000);

		//Title
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_IndividualOrgNameTitle']//span[contains(text(),'Title')]")).click();
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_IndividualOrgNameTitle open']//label[contains(text(),'Mr')]")).click();
		Thread.sleep(1000);
		
		 //Name
		driver.findElement(By.id("IndividualOrgName")).sendKeys("TULARAM MAJHI");
		driver.findElement(By.id("CustomerNameOnCard")).sendKeys("Lalit");
		Thread.sleep(1000);
		
		//pan
		driver.findElement(By.xpath("//span[normalize-space()='Select Type of Business Entity']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Sole Propreitorship']")).click();
		
		driver.findElement(By.id("CustomerIncomeTaxPan")).sendKeys("BBZPM3757R");
		driver.findElement(By.id("btnVerify")).click();
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.id("btnVerify")).getText());
		
		driver.findElement(By.id("btnshowregAddress")).click();
		Thread.sleep(1000);
		//Address
		driver.findElement(By.id("CommunicationAddress1")).sendKeys("Noida office");
		driver.findElement(By.id("CommunicationAddress2")).sendKeys("Building d1");
		driver.findElement(By.id("CommunicationCity")).sendKeys("Noida");
		driver.findElement(By.id("CommunicationPinCode")).sendKeys("100200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_CommunicationStateID']//p[contains(@title,'Select State')]//label")).click();
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_CommunicationStateID open']//label[contains(text(),'ANDHRA PRADESH')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='SumoSelect sumo_CommunicationDistrictId']//span[contains(text(),'Select District')]")).click();
		driver.findElement(By.xpath("//label[text()='ANANTHAPUR']")).click();
		
		//Generate Mobile OTP
		driver.findElement(By.id("CommunicationMobileNumber")).sendKeys("8652671260");
		driver.findElement(By.id("btnGenerateMobileOTP")).click();
		Thread.sleep(2000);

		//Generate Email OTP
		driver.findElement(By.id("CommunicationEmail")).sendKeys("lalit.shiv@paytmmloyal.com");
		driver.findElement(By.id("btnGenerateEmailOTP")).click();
		
		Thread.sleep(30000);
		//Mobile verification
		driver.findElement(By.id("btnMobileOTPVerify")).click();
		
		//email verification
		driver.findElement(By.id("btnEmailOTPVerify")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("sameAddressCheck")).click();
		
        driver.findElement(By.xpath("//button[@onclick='return showOfficialDetailsOnlineForm()']")).click();
		Thread.sleep(3000);
		
		 String text=driver.findElement(By.xpath("//p[contains(text(),'Entered PAN is already existing in DT Plus system,')]")).getText();
		//DUPLICATE PAN
		if (text.contains("Entered PAN is already existing in DT Plus system"))
				//equals("Entered PAN is already existing in DT Plus system"))
		{
			//Thread.sleep(3000);

			driver.findElement(By.xpath("//button[normalize-space()='YES']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("PanCardRemarks")).sendKeys("accepted");
			Thread.sleep(1000);
			driver.findElement(By.id("btnshowregAddress")).click();
		}
				
			
		Thread.sleep(3000);

		//Key Official Details
		
		driver.findElement(By.xpath("//button[@onclick='return showOfficialDetailsOnlineForm()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@title=' Title']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='opt']//label[contains(text(),'Mr')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("KeyOffFirstName")).sendKeys("Testauto");
		
		driver.findElement(By.id("KeyOffEmail")).sendKeys("lalit.shiv@paytmmloyal.com");
		driver.findElement(By.id("KeyOffMobileNumber")).sendKeys("8652671260");
		driver.findElement(By.id("KeyOffDesignation")).sendKeys("Testing method");

		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"createmessagearea alert alert-success\"]")).getText());
	}
	

	}
	



