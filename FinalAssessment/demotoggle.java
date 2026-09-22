package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demoappqspiders {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new EdgeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// navigate to application
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		// click on disabled button
		driver.findElement(By.cssSelector("[href='/ui/toggle/disabled?sublist=1']")).click();
		Thread.sleep(1000);		
		// javascript executor	
		
		WebElement toggle1=  driver.findElement(By.id("tog"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].removeAttribute('disabled');",toggle1);
	    js.executeScript("arguments[0].click();", toggle1);
	    
	    WebElement toggle2=  driver.findElement(By.id("togg"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].removeAttribute('disabled');",toggle2);
	    js1.executeScript("arguments[0].click();", toggle2);
	    
	    
	    WebElement toggle3=  driver.findElement(By.id("toggl"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
	    js2.executeScript("arguments[0].removeAttribute('disabled');",toggle3);
	    js2.executeScript("arguments[0].click();", toggle3);
	    
	    
	    WebElement toggle4=  driver.findElement(By.id("toggler"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
	    js3.executeScript("arguments[0].removeAttribute('disabled');",toggle4);
	    js3.executeScript("arguments[0].click();", toggle4);
	    
	    Thread.sleep(2000);
		
	    // place order click
	    driver.findElement(By.id("togglers")).click();
	    String text = driver.findElement(By.cssSelector("[class='text-lg text-orange-600 font-bold text-center']")).getText();
		if(text.equals("ORDER PLACED"))
		{
			System.out.println("order is placed");
		}
		else
		{
			System.out.println("order is not placed");
		}
		
		Thread.sleep(2000);
		// close
		driver.quit();

	}

}

