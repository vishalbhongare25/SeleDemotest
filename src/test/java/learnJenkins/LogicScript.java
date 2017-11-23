package learnJenkins;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;


public class LogicScript {
	
	 WebDriver driver;
	public void Login (WebDriver driver) throws InterruptedException, IOException {
    	
	   	  System.out.println("Open360Dashbordboard URL");
	   	      driver.get("https://360.servify.in/");
	   	     //driver.get("http://staging.servify.in:3000/");  
	   	     //driver.get ("http://staging.servify.in:3002/");
	   	     // driver.findElement(By.name("username")).sendKeys("karan.b@servify.in"); 
	   	     //String homePageUrl = driver.getCurrentUrl();
	   	      AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/");
	   	      Thread.sleep(3000); 
	   	      System.out.println("Opened Successfully 360Dashbordboard URL");
	   	       System.out.println("Start User login on 360Dashbordboard ");
			  driver.findElement(By.name("username")).sendKeys("vishal.b@servify.in");
		      driver.findElement(By.name("next")).click();	
		      Thread.sleep(2000);
		      //driver.findElement(By.name("password")).sendKeys("|$JBRmed+K#im");
		      driver.findElement(By.name("password")).sendKeys("vishal09");
		      driver.findElement(By.name("submit")).click();
		      Thread.sleep(2000); 
		      String HomepageURl = driver.getCurrentUrl();
		      AssertJUnit.assertEquals(HomepageURl, "https://360.servify.in/dashboard");
		      Thread.sleep(4000);
		      WebElement element =driver.findElement(By.id("filterDashboard"));
		   //   Assert.assertNotEquals(element, null);  
		      System.out.println(" User logined Successfully 360Dashbordboard ");
		      Thread.sleep(3000);
		  /*
		    	  MultiScreenShot mShot=new MultiScreenShot("/Users/servify/eclipse-workspace/LearnTestNG/screen/image.png", "Login");
		    	  mShot.multiScreenShot(driver);
		    	  System.out.println("ScreenshotTaken Successfully");   */   
		     
	}
	
	
	
		     public void Clikconsumer (WebDriver driver) throws InterruptedException {
			  driver.findElement(By.className("sidebar-consumers")).click();
			  Assert.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/consumers");
		
		    } 
		     
		     
		 
		 

} // end main class 
