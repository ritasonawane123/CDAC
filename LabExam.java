package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LabExam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\SelniumData\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.opencart.com/index.php?route=account/register");
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());
		// for username
		d.findElement(By.id("input-username")).sendKeys("ritasonawane123");
		// for first name
		d.findElement(By.id("input-firstname")).sendKeys("Rita");
		// for last name
		d.findElement(By.id("input-lastname")).sendKeys("Sonawane");
		// for email
		d.findElement(By.id("input-email")).sendKeys("rita23998@gmail.com");
		// for country
		Select country = new Select(d.findElement(By.id("input-country")));
		country.selectByValue("India");
		// for password
		d.findElement(By.name("password")).sendKeys("ABCD1234");
		// for register
		d.findElement(By
				.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]"))
				.click();

		// For navigate on login page
		d.findElement(By.linkText("Login")).click();

		// for email
		WebElement we = d.findElement(By.xpath("//input[@id='input-email']"));
		we.sendKeys("rita23998@gmail.com");

		// for password
		WebElement we1 = d.findElement(By.xpath(""));
		we1.sendKeys("ABCD1234");

		// for click on login button
		d.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]"))
				.click();

		// for printing msg on console
		String uName = we.getAttribute("value");
		System.out.println(uName);

		String pwd = we1.getAttribute("value");
		System.out.println(pwd);

	}

}
