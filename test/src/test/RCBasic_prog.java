package test;


import org.junit.Ignore;
import org.junit.Test;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.Iterator;
import java.util.List;


public class RCBasic_prog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nano\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.redbus.in/");
		WebElement we= driver.findElement(By.id("src"));
		we.sendKeys("Hyd");
		Thread.sleep(1000);
		 
		List<WebElement> cities= driver.findElements(By.xpath("//*[@id='Search']/div/div[1]/div/ul/li"));
		System.out.println(cities.size());
		for (int i=0;i<cities.size();i++)
		{
			String cityname=cities.get(i).getText();
			System.out.println(cityname);
		}
		
		
		}
	}
	


