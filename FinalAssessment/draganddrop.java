package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException
	{
		// launch
		WebDriver driver = new EdgeDriver();
		// maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// navigate to application
		driver.get("https://demoapps.qspiders.com/ui/dragDrop");
		Thread.sleep(1000);
		// click on multiple drag
		driver.findElement(By.cssSelector("[href='/ui/dragDrop/dragToMultiple?sublist=3']")).click();
		// elements
		WebElement drag1 = driver.findElement(By.id("dragElement1"));
		WebElement drag2= driver.findElement(By.id("dragElement3"));
		// target for laptop
		WebElement target1 = driver.findElement(By.id("dropZone2"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(drag1).click(drag2).keyUp(Keys.CONTROL).perform();
		// drag
		act.dragAndDrop(drag1, target1).perform();
		act.dragAndDrop(drag2, target1).perform();
		// target for mobile
		WebElement drag3 = driver.findElement(By.id("dragElement2"));
		WebElement drag4 = driver.findElement(By.id("dragElement4"));
		WebElement target2 = driver.findElement(By.id("dropZone1"));
		Actions act1=new Actions(driver);
		act1.keyDown(Keys.CONTROL).click(drag3).click(drag4).keyUp(Keys.CONTROL).perform();
		// drag
		act1.dragAndDrop(drag3, target2).perform();
		act1.dragAndDrop(drag4, target2).perform();
		
		Thread.sleep(2000);
		// close
		driver.quit();
		
	}

}

