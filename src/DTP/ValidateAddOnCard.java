package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidateAddOnCard {

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
		a.moveToElement(driver.findElement(By.xpath("//a[@id='175||2']"))).click().build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FormNumber")).sendKeys("9000003675");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='Validate']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("comments")).sendKeys("Validate Add On Card");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
		Thread.sleep(1000);

	System.out.println(driver.findElement(By.xpath("//div[@id='reason']")).getText());
	}

}
