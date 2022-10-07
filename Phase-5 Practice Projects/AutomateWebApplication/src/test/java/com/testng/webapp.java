package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webapp {
	String driverPath="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	public WebDriver wd;
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() {
		// WebDriverManager.chromedriver().setup();
		 
			
	     // WebDriver wd=new ChromeDriver();
	      System.setProperty("webdriver.chrome.driver", 
				  "D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Jyothiradithya");
	      wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      wd.findElement(By.id("ap_email")).sendKeys("jyothiradithya@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
//	     wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	     wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  //WebDriverManager.chromedriver().setup();
	   //  WebDriver wd=new ChromeDriver();
	     System.setProperty("webdriver.chrome.driver", 
				  "D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		  
		  wd = new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("jyothiradithya@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");


	  }
	  @Test(priority = 3)
	  public void search() throws InterruptedException {
		  	//WebDriverManager.chromedriver().setup();
		  //	WebDriver wd=new ChromeDriver();
		  	System.setProperty("webdriver.chrome.driver", 
					  "D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
			  
			  wd = new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("latest deals");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
	      // wd.findElement(By.name("submit.add-to-cart")).click();
	  }
}

