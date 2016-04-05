package bhanu;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class mojoDemo {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://mojo.staging.joveo.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@bayard.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("bayard4upass!");
		driver.findElement(By.xpath("html/body/data/ui-view/nav/div/div[2]/div/form/div[4]/div/div/input")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul[2]/li[1]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul[2]/li[1]/ul/li/a")).click();
//		
		//Click on the Client
		driver.findElement(By.xpath("html/body/data/ui-view/nav/div[1]/div[4]/div/ul/li[1]/button")).click();

		Thread.sleep(3000);
//		//Client creation form
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[1]/div/input")).sendKeys("TestClient30");
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[2]/div/input")).sendKeys("www.testclient30.com");
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[3]/div/input")).sendKeys("testclient30@gmail.com");
//		Clicking on Dropdown List
		
//		WebElement element = driver.findElement(By.className("btn btn-default dropdown-toggle show-special-title"));
//		element.click();
		
//		Select s = new 	Select(element);
//		List<WebElement> list = s.getOptions();
//		System.out.println(list.size());
//		
////		Retrieving drop down values
//		for(int i=0; i<list.size(); i++){
//			System.out.println(s.getFirstSelectedOption().getText());
//		}
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[6]/div/input")).sendKeys("https://lensa.com/platform/feeds/jobtarget");
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[7]/div/div/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[7]/div/div/div/ul/li[1]/div/table/tbody/tr[2]/td[7]/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[8]/div/div/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[1]/div[8]/div/div/div/ul/li[1]/div/table/tbody/tr[3]/td[7]/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[1]/div/input")).sendKeys("testclienttcareers");
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[6]/div/input")).sendKeys("5000");
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[8]/div/input")).sendKeys("50");
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[2]/div/div/div/input"));
		element.click();
		
		
		
		// Bid Type Drop down list
//		WebElement bidType = driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[7]/div/ol/div/ul"));
//		
//		Select s = new Select(bidType);
//		List<WebElement> list = s.getOptions();
//		System.out.println(list.size());
		
		driver.findElement(By.xpath("//*[@id='file']")).click();
		
		WebElement fileInput = driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/div[1]/div[2]/div[2]/div/div/input"));
		fileInput.sendKeys("/home/bhanu/Pictures/Infosys.png");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[3]/div/button[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[1]/div/div[2]/div/i")).click();
		
		Select s = new Select(element);
		driver.close();	
		
	}	
		
	}	
		
		
			
		
	



