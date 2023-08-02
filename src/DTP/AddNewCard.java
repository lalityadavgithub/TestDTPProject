package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddNewCard {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
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
		a.moveToElement(driver.findElement(By.xpath("//a[@id='60||2']"))).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FormNumber")).sendKeys("9000003371");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("NoOfCards")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("rbtnCard")).click();
		//System.out.println(driver.findElement(By.id("rbtnCard")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.id("rbtnOnline")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("VechileNo_0")).sendKeys("VEHICLE02");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tbody//tr//td[4]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'HCV')][1]")).click();
		
		driver.findElement(By.id("VehicleMake_0")).sendKeys("Automation");
		driver.findElement(By.id("YearofRegistration_0")).sendKeys("2001");
		driver.findElement(By.id("VehicleNoVerifiedManually")).click();
		//driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(2000);

	//System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Please ensure that all the Vehicle Nos. have been ')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'CONFIRM')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("btnsubmit")).click();
		
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Customer and Card details saved successfully and p')]")).getText());
		}

}
