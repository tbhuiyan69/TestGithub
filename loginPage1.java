package ebayLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage1 {
	
	static WebDriver driver;

	

	public void boweserOpen() {

		 System.setProperty("webdriver.chrome.driver","/Users/tanveerbhuiyan/Desktop/JavaProject/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.ebay.com");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	public void searchProduct() throws InterruptedException {
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Daily Deals")).click();
	}
		
	public void nagivate() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com/");	
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("The title of this page is: " +driver.getTitle());
		
	}
	public void closeBrowser() {
		driver.quit();
	}
	
    public static void main(String[] args) throws InterruptedException {
    	
    	loginPage1 obj = new loginPage1();
    	obj.boweserOpen();
    	obj.searchProduct();
    	obj.nagivate();
    	obj.closeBrowser();
    }
		
	}


