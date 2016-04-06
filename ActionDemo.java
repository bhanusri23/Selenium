import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		driver.findElement(By.name("p")).sendKeys("Selenium IDE");
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
	
		a.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
		
		a.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
		
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		if(driver.getTitle().contains("SeleniumIDE"))
		{
			System.out.println("Searching i not working");
			
		}
			
		else
			System.out.println("Search is not working");
		
		 
	}

}
