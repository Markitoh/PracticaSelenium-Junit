package PageO;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	private static WebElement element = null;
	public static WebElement UserName(WebDriver driver){
		 
        element = driver.findElement(By.id("ap_email"));

        return element;

        }	 

	 public static WebElement Password(WebDriver driver){
		 
         element = driver.findElement(By.id("ap_password"));
 
         return element;
 
         }
	 public static WebElement btnLogIn(WebDriver driver){
		 
         element = driver.findElement(By.id("signInSubmit"));
 
         return element;
 
         }
	
	}

