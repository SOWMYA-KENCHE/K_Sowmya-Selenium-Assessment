package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopperstack {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new EdgeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		// navigate to application
		driver.get("https://www.shoppersstack.com/");
		// click men
		Thread.sleep(4000);
		driver.findElement(By.id("women")).click();
		Thread.sleep(1000);
		// click on any product
		driver.findElement(By.xpath("//a[text()='Kurtas & Suits']")).click();
		// check delivery
		driver.findElement(By.id("Check Delivery")).sendKeys("583102");
		// check wait
		WebElement ref1 = driver.findElement(By.xpath("//button[@name='Check']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ref1));
		ref1.click();
		// available
		String text = driver.findElement(By.cssSelector("[id='Check Delivery-helper-text']")).getText();
		if(text.equals("Not Deliveriable."))
		{
			System.out.println("the prouct is not available");
		}
		else
		{
			System.out.println("the product is available");
		}
	}

}
