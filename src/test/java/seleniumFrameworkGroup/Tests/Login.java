package seleniumFrameworkGroup.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login 
{
	@Test
	public void login() throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://dotnetwebapp2.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//h1"));
		String heading=text.getText();
		Thread.sleep(2000);
		Assert.assertEquals(heading,"Welcome hari");
		driver.close();		
	}

}
