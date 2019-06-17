import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contenedor {

	public static void main(String [] args) {
		
		carro();
		
	}

	
	public static String carro() {
		
		Datos datos = new Datos();	
		String password = datos.Pass();
		String user = datos.User();
		String enlace = datos.Enlace();
		
		String ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",ruta);	
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		
		driver.get(enlace);
		
		
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		
		Assert.assertNotEquals(user, password);
		
		driver.findElement(By.id("signInSubmit")).click();
				
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung gear s3 charger");		
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.get("https://www.amazon.com/gp/cart/view.html/ref=uss_cart");
		return ruta;
	}
	
	public static void whislist() {
		
		
		Datos datos = new Datos();
		String password = datos.Pass();
		String user = datos.User();
	
		
		
		String ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",ruta);	
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id='a-page']/div[2]/div/div[4]/div[1]/div/div/ul/li[4]/span/a")).click();
	}
	
	public static void Direccion() {
		
		
		
		Datos datos = new Datos();
		String password = datos.Pass();
		String user = datos.User();
		
		String ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",ruta);	
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		
		//*[@id="nav-link-accountList"]/span[2]
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[1]/span/a")).click();
		driver.findElement(By.id("ya-myab-plus-address-icon")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/form/span/div/div/div/div[2]/span/span/span/span")).click();
		driver.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId_189")).click();
		
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Marco Brujan");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Calle 8 Piantini");
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Manzana 8");
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Santo Domingo");
		driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion")).sendKeys("Santo Domingo");
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("10103");
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("8099127454");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/span/span/input")).click();
	}
	
	public static void OrdenAntigua() {
		
		Datos datos = new Datos();
		String password = datos.Pass();
		String user = datos.User();
		
		String ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",ruta);	
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orderFilter_3\"]")).click();
		jse.executeScript("scroll(0, 500);");
		driver.findElement(By.xpath("//*[@id=\"ordersContainer\"]/div[6]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/a")).click();
		
	}
	
	}

