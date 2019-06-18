import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageO.AddDireccion;
import PageO.Contenidos;
import PageO.Homepage;
import PageO.Login;
import PageO.Pedidos;
import PageO.TuCuenta;
import junit.framework.Assert;

public class TestContenedor {
	String password;
	String user;
	String enlace;
	String ruta;
	WebDriver driver;
	
	@Before
	public void Inicializar() {
		Datos datos = new Datos();	
		password = datos.Pass();
		user = datos.User();
		enlace = datos.Enlace();
		ruta = new File("Drivers/geckodriver.exe").getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",ruta);
		driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.get(enlace);
		Login.UserName(driver).sendKeys(user);
		Login.Password(driver).sendKeys(password);
		Login.btnLogIn(driver).click();
	}

	
	@Test
	public void carro() {

		Homepage.Buscador(driver).sendKeys("samsung gear s3 charger");
		Homepage.BtnBuscar(driver).click();
		Contenidos.ContenidoBuscado(driver).click();
		Contenidos.AddCarrito(driver).click();
		Contenidos.VerCarrito(driver).click();		
		
		//Here is the assertion
		
		String btn = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button-announce\"]")).getText();
		Assert.assertTrue(btn.toString().contains("Proceder al pago"));
		driver.close();
	}
	
	@Test
	public void PedidosArchivados() {
			
		Homepage.AccountsList(driver).click();
		TuCuenta.PedidosArchivados(driver).click();
		
		
		//Here is the assertion
		String btn = driver.findElement(By.id("Detalles-del-pedido-_1")).getText();
		Assert.assertTrue(btn.toString().contains("Detalles del pedido"));
		driver.close();
	}
	
	@Test
	public void Direccion() {
		
		Homepage.AccountsList(driver).click();
		TuCuenta.Direcciones(driver).click();
		AddDireccion.BtnAgregar(driver).click();
		
		
		AddDireccion.Pais(driver).click();
		AddDireccion.Pais(driver).click();
		AddDireccion.SubPais(driver).click();
		AddDireccion.NombreCompleto(driver).sendKeys("Marco Brujan");
		AddDireccion.Direccion(driver).sendKeys("Calle 8 Piantini");
		AddDireccion.Direccion2(driver).sendKeys("Manzana 8");
		AddDireccion.Ciudad(driver).sendKeys("Santo Domingo");
		AddDireccion.Estado(driver).sendKeys("Santo Domingo");
		AddDireccion.CodigoPostal(driver).sendKeys("10103");
		AddDireccion.NumeroTel(driver).sendKeys("8099127454");
		AddDireccion.BtnAgregarUnaDireccion(driver).click();
		
		
		//Here is the assertion
		
		String msg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/h4")).getText();
		Assert.assertTrue(msg.toString().contains("Dirección guardada"));
		driver.close();
		
	}
	
	@Test
	public void OrdenAntigua() {
		
		Homepage.Pedidos(driver).click();
		Pedidos.PedidosArchivados(driver).click();
		Pedidos.SeleccionAntiguedad(driver).click();
		Pedidos.PedidoMasAntiguo(driver).click();
		
		//Here is the assertion
		
		String reloj = driver.findElement(By.xpath("//*[@id=\"instantOrderUpdate_feature_div\"]/div/div/div/div/span[2]")).getText();
		Assert.assertTrue(reloj.toString().contains("Última compra el marzo 6, 2018"));
		driver.close();
	}

}
