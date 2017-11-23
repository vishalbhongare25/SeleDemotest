package learnJenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTestCase {

		WebDriver driver;
		LogicScript logintest ;
		ConsumerCategory consumer ;
		
		
		
		@Test (priority =1)
		public void LoginServifylUrl () throws InterruptedException, IOException{
		logintest.Login(driver);
		//Thread.sleep(2000);
		}
		
		@Test (priority =2)
		public void clikOnConsumerCateegory() throws InterruptedException {
			consumer.Clikconsumer(driver);
		}
		
		/*@BeforeMethod
		public void beforeMethod (){
			driver =new ChromeDriver();
			logintest =new LoginLogic();

		}*/ // Run before evert tets case.
		
		@BeforeClass
		public void beforeClass() throws InterruptedException{

		     System.out.println("Started Chrome browser");
			 driver =new ChromeDriver();
			 System.out.println("Started login Servify 360");
			 logintest =new LogicScript();
			 consumer = new ConsumerCategory();
			 
			 
			{
			};
			// consumertest =new ConsumerTab();
			// request = new ReqestTab();
			
		}

}
