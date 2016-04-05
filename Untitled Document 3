package bhanu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MojoDropdown {
	public static void main(String args[]) throws InterruptedException{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://mojo.staging.joveo.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@bayard.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("bayard4upass!");
		driver.findElement(By.xpath("html/body/data/ui-view/nav/div/div[2]/div/form/div[4]/div/div/input")).click();
		Thread.sleep(3000);
		//Click on the Client
		driver.findElement(By.xpath("html/body/data/ui-view/nav/div[1]/div[4]/div/ul/li[1]/button")).click();
		
		
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[3]/div/ol/button"));
		element.click();
		Select s= new Select(element);
		List<WebElement> list = element.findElements(By.className("ng-binding"));
		List<WebElement> list = element.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for (int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
		
		

	
		
				
	
		
	}

}

