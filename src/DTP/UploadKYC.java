package DTP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadKYC {

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
		a.moveToElement(driver.findElement(By.xpath("//a[@id='59||2']"))).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("FormNumber")).sendKeys("9000003676");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		 
		//Proof of Identity
		driver.findElement(By.xpath("//p[contains(@title,'--Select ID Proof--')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Masked Aadhar Card']")).click();
		//Document Number
		driver.findElement(By.id("IdProofDocumentNo")).sendKeys("DOCadhar01");
		//Front Photo
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='IdProofFront']"));

		upload_file.sendKeys("C:/Users/lalit/OneDrive/Desktop/Screenshot/ADD NEW CARD NON-FLEET PAGE FONT.png");
		//Back Photo
		WebElement upload_backfile = driver.findElement(By.xpath("//input[@id='IdProofBack']"));

		upload_backfile.sendKeys("C:/Users/lalit/OneDrive/Desktop/Screenshot/checkalertmessase.png");
		//Proof of Address
		driver.findElement(By.xpath("//p[contains(@title,'--Select Address Proof--')]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Insurance Policy']")).click();
		//Document Number
		driver.findElement(By.id("AddressProofDocumentNo")).sendKeys("Docs8556");
		
		//Front Photp
		WebElement upload_Addressfile = driver.findElement(By.xpath("//input[@id='AddressProofFront']"));

		upload_Addressfile.sendKeys("C:/Users/lalit/OneDrive/Desktop/Screenshot/CARD INDENTIFIER WITH DIFFERENT TAB.jpeg");
		
		//Back Photo
		WebElement upload_Backfile = driver.findElement(By.xpath("//input[@id='AddressProofBack']"));

		upload_Backfile.sendKeys("C:/Users/lalit/OneDrive/Desktop/Screenshot/fullpage.png");
		
		driver.findElement(By.id("btnSaveDoc")).click();
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'KYC Documents Uploaded Successfully with Form Numb')]")).getText());
	}

}
