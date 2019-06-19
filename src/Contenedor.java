import java.io.File;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Contenedor {

/*	
//Code
*/
	
	
	
	public static void EsperarPorElemento(WebDriver driver, WebElement element) {
		
		WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
		
	}

	}

