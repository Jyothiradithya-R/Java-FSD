package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {
	public static void main(String[] args)
	{
		String path= "D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://profile.oracle.com/myprofile/account/create-account.jspx";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		System.out.println("Title:"+driver.getTitle());
		
		System.out.println("------------------------");
		
		
		
		WebElement email=driver.findElement(By.name("sView1:r1:0:email"));
		System.out.println(email.getAttribute("name"));
		email.sendKeys("jyothiradithya@gmail.com");
		
		
		WebElement pass=driver.findElement(By.name("sView1:r1:0:password"));
		System.out.println(pass.getAttribute("name"));
		pass.sendKeys("Bablu@123");
		
		WebElement repass=driver.findElement(By.name("sView1:r1:0:retypePassword"));
		System.out.println(repass.getAttribute("name"));
		repass.sendKeys("Bablu@123");
		
		WebElement country=driver.findElement(By.name("sView1:r1:0:country"));
		System.out.println(country.getAttribute("name"));
		country.sendKeys("India");
		
		WebElement fname=driver.findElement(By.name("sView1:r1:0:firstName"));
		System.out.println(fname.getAttribute("name"));
		fname.sendKeys("Jyothiradithya");
		
		WebElement lname=driver.findElement(By.name("sView1:r1:0:lastName"));
		System.out.println(lname.getAttribute("name"));
		lname.sendKeys("Ravula");

		WebElement jobtitle=driver.findElement(By.name("sView1:r1:0:jobTitle"));
		System.out.println(jobtitle.getAttribute("name"));
		jobtitle.sendKeys("Engineer");
		
		WebElement phone=driver.findElement(By.name("sView1:r1:0:workPhone"));
		System.out.println(phone.getAttribute("name"));
		phone.sendKeys("9494780150");
		
		WebElement company=driver.findElement(By.name("sView1:r1:0:companyName"));
		System.out.println(company.getAttribute("name"));
		company.sendKeys("xxxxxx"); 
		
		WebElement address=driver.findElement(By.name("sView1:r1:0:address1"));
		System.out.println(address.getAttribute("name"));
		address.sendKeys("6/18 Brodipet");
		
		
		WebElement city=driver.findElement(By.name("sView1:r1:0:city"));
		System.out.println(city.getAttribute("name"));
		city.sendKeys("Guntur");
		
		WebElement state=driver.findElement(By.name("sView1:r1:0:state"));
		System.out.println(state.getAttribute("name"));
		state.sendKeys("Andhra Pradesh");
		
		WebElement zipcode=driver.findElement(By.name("sView1:r1:0:postalCode"));
		System.out.println(zipcode.getAttribute("name"));
		zipcode.sendKeys("522002");
		
		System.out.println("successfully submitted");			
	}
}