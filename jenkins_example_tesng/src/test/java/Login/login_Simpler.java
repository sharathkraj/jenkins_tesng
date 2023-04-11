package Login;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public final class login_Simpler {

		
		private static  AndroidDriver driver;
		
		@BeforeTest
		public static AndroidDriver launchdriver() throws MalformedURLException, InterruptedException {
			
			 DesiredCapabilities caps= new DesiredCapabilities();
					

				    caps.setCapability("platformName", "ANDROID");
				    caps.setCapability("platformVersion", "12");
				    caps.setCapability("udid", "a1025483");
				    caps.setCapability("deviceName", "Sharath");
				    caps.setCapability("appPackage", "com.bellesoft.stprotradingroom");
				    caps.setCapability("appActivity", "com.bellesoft.stprotradingroom.MainActivity");	
					

				    URL url = new URL("http://0.0.0.0:4723/wd/hub");
				    driver= new AndroidDriver(url,caps);
				    System.out.println("driver manager");
				    Thread.sleep(10000);
					return driver;
					
	}
		@Test
		public void login() throws InterruptedException {
			
			
			WebElement USERNAME = driver.findElement(By.xpath("//android.widget.EditText[@password='false']"));
			USERNAME.sendKeys("roomtest1@simplertrading.com");
			
			WebElement PASSWORD = driver.findElement(By.xpath("//android.widget.EditText[@password='true']"));
			PASSWORD.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
			
			WebElement LOGIN_BUTTON = driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']"));
			LOGIN_BUTTON.click();
			
//			Thread.sleep(10000);
//			WebElement MenuClick = driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
//			MenuClick.click();
//			
//			Thread.sleep(1000);
//			WebElement LOGOUT_BUTTON = driver.findElement(By.xpath("//android.widget.Image[@text='menu outline']"));
//			LOGOUT_BUTTON.click();
//			
//			Thread.sleep(1000);
//			WebElement CONFIRM_BUTTON = driver.findElement(By.xpath("//android.widget.Button[@text='Log Out']"));
//			CONFIRM_BUTTON.click();
		}

}


