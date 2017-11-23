package learnJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConsumerCategory {
	
	WebDriver driver;
	  public void Clikconsumer (WebDriver driver) throws InterruptedException {
		  driver.findElement(By.className("sidebar-consumers")).click();
		   Assert.assertEquals(driver.getCurrentUrl(), "https://360.servify.in/consumers");
	
	    } 
	     

}
