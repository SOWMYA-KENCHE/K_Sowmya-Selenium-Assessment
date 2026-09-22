package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoappsslider {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to application
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		Thread.sleep(1000);
		// slider
		WebElement slide = driver.findElement(By.id("slide"));
		Actions act = new Actions(driver);
		act.clickAndHold(slide).moveByOffset(250, 0).release().perform();
//		act.moveToElement(slider, 30, 0).click().perform();
		String text = driver.findElement(By.xpath("(//h3[@class='text-sm font-bold pb-1'])[3]")).getText();
		if(text.contains("Mens Cotton Jacket"))
		{
			System.out.println("mens cotton jacket is verified");
		}
		else
		{
			System.out.println("mens cotton jacket is not verified");
		}
		Thread.sleep(2000);
		// close
		
		driver.quit();
		

	}

}
