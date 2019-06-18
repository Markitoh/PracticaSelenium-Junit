package PageO;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pedidos {
private static WebElement element = null;
	
	public static WebElement PedidosArchivados(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='a-button-inner']/*[@class='a-button-text a-declarative']"));
		return element;
}
	
	public static WebElement SeleccionAntiguedad(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='a-dropdown-link'][contains (.,'2018')]"));
		return element;
}
	public static WebElement PedidoMasAntiguo(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"ordersContainer\"]/div[6]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/a"));
		return element;
}
	
	/*public List<WebElement> seleccionarpedido(WebDriver driver){
	
		return driver.findElement(By.xpath("//div[@class='a-box-group a-spacing-base order']"));
	}*/
	
	
}

