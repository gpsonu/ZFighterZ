package com.utility;

import java.sql.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class blah 
{
	private static Connection con;
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/features.html");
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/iframe[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/span/div/div/div[2]/div/div/div/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#intercom-container > div > div.intercom-messenger-body > div > div > div > div > div.intercom-home-screen-card.intercom-home-screen-messenger-card.intercom-home-screen-messenger-card-0 > div > div.intercom-messenger-card-body-container > span > div > div > div:nth-child(2) > div > div > div > div > div > input[type=\"text\"]")).sendKeys("crm");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/span/div/div/div[2]/div/div/div/div/button")).click();
		
		
		
		
		
		/*Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("zfighterz");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("zf123zf");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[4]/td/form/table/tbody/tr/td[2]/div/input[3]")).sendKeys("dsadsad");
	
		driver.quit();*/
	}

}