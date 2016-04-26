
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDemo {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("#######");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("*******");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(3000);
	}

}

