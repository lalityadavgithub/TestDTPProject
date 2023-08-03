package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddOnCard {

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
		a.moveToElement(driver.findElement(By.xpath("//a[@id='66||2']"))).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("CustomerId")).sendKeys("4000000277");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnFormNumber")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("NoOfCards")).sendKeys("1");
		driver.findElement(By.id("rbtnCard")).click();
		driver.findElement(By.id("rbtnOnline")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("VechileNo_0")).sendKeys("TESTVEHI04");
		Thread.sleep(2000);

		driver.findElement(By.id("ddlVehicleType_0")).click();
		driver.findElement(By.xpath("//option[contains(text(),'HCV')][1]")).click();
		driver.findElement(By.id("VehicleMake_0")).sendKeys("Test");
		driver.findElement(By.id("YearofRegistration_0")).sendKeys("2005");
		
		driver.findElement(By.id("VehicleVerifiedManually")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnsubmit")).click();
		
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Add-On Card request placed successfully')]")).getText());
		
		
	}

}
