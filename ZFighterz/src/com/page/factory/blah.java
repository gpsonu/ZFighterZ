package com.page.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class blah 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("wedsriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/index.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("zfighterz");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("zf123zf");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[4]/td/form/table/tbody/tr/td[2]/div/input[3]")).sendKeys("dsadsad");
	
		driver.quit();
	}

}