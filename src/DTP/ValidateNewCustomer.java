package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidateNewCustomer {

	@SuppressWarnings("deprecation")
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
		a.moveToElement(driver.findElement(By.xpath("//a[@id='62||2']"))).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FormNumber")).sendKeys("9000003676");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.xpath("//tr[@class='odd']//span[@class='rowCardNo'][normalize-space()='Validate']")).click();
		
		driver.findElement(By.xpath("//div[@id='BasicInformation']//div[2]//button[1]")).click();
		driver.findElement(By.xpath("//button[@onclick='ShowOfficialDetails()']")).click();
		driver.findElement(By.xpath("//button[@onclick='ShowKYCDetails()']")).click();
		
		driver.findElement(By.id("Remarks")).sendKeys("Approved Customer");
		driver.findElement(By.id("btnApprove")).click();
		
	System.out.println(driver.findElement(By.xpath("//div[@class='createmessagearea alert alert-success']")).getText());
	}

}
