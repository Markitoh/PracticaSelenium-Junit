package PageO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contenidos {

	private static WebElement element = null;
	
	public static WebElement ContenidoBuscado(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		return element;
	}
	
	public static WebElement AddCarrito(WebDriver driver) {
		element = driver.findElement(By.id("add-to-cart-button"));
		return element;
	}
	
		
	public static WebElement VerCarrito(WebDriver driver) {

		element = driver.findElement(By.id("hlb-view-cart-announce"));
		return element;
		}
	
}
