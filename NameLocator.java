package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args)throws InterruptedException {
		      //Launch Browser
			  WebDriver driver=new ChromeDriver();

				//Maximize
				driver.manage().window().maximize();

				//Navigate
				driver.navigate().to("https://berribot.com/");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[text()='Reject']")).click();
	
				driver.findElement(By.xpath("//div[contains(@class,'absolute inset-0')]")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,500)");
		        Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@placeholder='John Smith']")).sendKeys("Manimaran");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@placeholder='Blueberry Studios']")).sendKeys("Test Company");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@placeholder='john@bbstudios.org']")).sendKeys("Manimaran@test1.com");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//textarea[contains(@placeholder,'walk-through')]")).sendKeys("I want to book a demo");
				Thread.sleep(3000);
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js1.executeScript("window.scrollBy(0,500)");
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[text()='Contact support']")).click();
				Thread.sleep(3000);
				
				driver.quit();
						
	}
	
}
