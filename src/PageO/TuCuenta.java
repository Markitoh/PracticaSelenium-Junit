package PageO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TuCuenta {

private static WebElement element = null;
	
	public static WebElement PedidosArchivados(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='a-page']/div[2]/div/div[4]/div[1]/div/div/ul/li[4]/span/a"));
		return element;
}
	
	public static WebElement Direcciones(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[1]/span/a"));
		return element;
}
	
}
