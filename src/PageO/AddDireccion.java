package PageO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDireccion {

	
	private static WebElement element = null;
	
	public static WebElement BtnAgregar(WebDriver driver){
        element = driver.findElement(By.id("ya-myab-plus-address-icon"));
        return element;
        }
	
	public static WebElement Pais(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode\"]/span/span"));
        return element;
        }
	public static WebElement SubPais(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId_189"));
        return element;
        }
	
	public static WebElement NombreCompleto(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
        return element;
        }
	public static WebElement Direccion(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
        return element;
        }
	public static WebElement Direccion2(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
        return element;
        }
	public static WebElement Ciudad(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
        return element;
        }
	public static WebElement Estado(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));
        return element;
        }
	public static WebElement CodigoPostal(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
        return element;
        }
	public static WebElement NumeroTel(WebDriver driver){
        element = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
        return element;
        }
	public static WebElement BtnAgregarUnaDireccion(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/span/span/input"));
        return element;
        }
	
}
