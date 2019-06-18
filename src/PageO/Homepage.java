package PageO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	private static WebElement element = null;
	
	public static WebElement AccountsList(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		return element;
	}
	public static WebElement Buscador(WebDriver driver) {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}
	
	public static WebElement BtnBuscar(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		return element;
	}
	
	public static WebElement Pedidos(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]"));
		return element;
	}
}
