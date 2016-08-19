package com.sitepal.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.css.sac.ElementSelector;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

     //Create FireFox Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbanerjee\\Desktop\\Jmeter\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//OPen Sitepal home page
				driver.get("http://www.sitepal.com");
				Thread.sleep(2000);
				
				driver.findElement(By.linkText("Login")).click();
				System.out.println("Welcome Oddcast");
				Thread.sleep(2000);
				System.out.println("send username");
				Thread.sleep(6000);
				try
				{
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sbanerjee@oddcast.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sumit1140");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='btn_blue_125']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("door")).click();
				Select drop = new Select(driver.findElement(By.id("door")));
				drop.selectByIndex(17);
				Thread.sleep(2000);
				driver.findElement(By.id("oneClick14")).click();
				Thread.sleep(2000);
				Select DropDown = new Select(driver.findElement(By.id("searchby")));
				DropDown.selectByIndex(3);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[name^=’keyword’]")).sendKeys("sss");
				
				
			
				//driver.findElement(By.xpath("//*[@id='btn_blue']")).click();
				Thread.sleep(2000);
				System.out.println("Successfully logged in VHSS");
				}
				catch(Exception e)
				{
					System.out.println("element not foud");
				}
			}
}