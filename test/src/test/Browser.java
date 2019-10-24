package test;
import java.awt.List;

import org.junit.Ignore;
import org.junit.Test;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nano\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.gmail.com");
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("sksusanta.net@gmail.com");
		WebElement nextButton = driver.findElement(By.id("identifierNext"));
		nextButton.click();
		 Thread.sleep(2000);
		    WebElement password = driver.findElement(By.xpath(".//*[@name='password']"));
		    password.sendKeys("1991susanta@sairam");
		        driver.findElement(By.id("passwordNext")).click();
		        driver.findElement(By.partialLinkText("Sent"));
		       // System.out.println(link.size());
		        Thread.sleep(4000);
		 
		driver.manage().window().maximize();
		 
		}

}
