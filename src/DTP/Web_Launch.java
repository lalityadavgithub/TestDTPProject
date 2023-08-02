package DTP;

import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Launch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dtpapptestv1.mloyalcapture.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	

	}

}
