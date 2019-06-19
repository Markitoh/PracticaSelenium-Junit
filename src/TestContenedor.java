import java.awt.List;
import java.io.File;

import org.junit.After;
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
import org.openqa.selenium.WebElement;

public class TestContenedor extends Contenedor{
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
	public void AgregarOrdenAcarrito() {

		EsperarPorElemento(driver,Homepage.Buscador(driver));
		Homepage.Buscador(driver).sendKeys("samsung gear s3 charger");
		
		EsperarPorElemento(driver,Homepage.BtnBuscar(driver));
		Homepage.BtnBuscar(driver).click();
		
		EsperarPorElemento(driver,Homepage.Buscador(driver));
		Contenidos.ContenidoBuscado(driver).click();
		
		EsperarPorElemento(driver,Contenidos.AddCarrito(driver));
		Contenidos.AddCarrito(driver).click();
		
		EsperarPorElemento(driver,Contenidos.VerCarrito(driver));
		Contenidos.VerCarrito(driver).click();		
		
		//Here is the assertion
		
		EsperarPorElemento(driver,driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button-announce\"]")));
		String btn = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button-announce\"]")).getText();
		Assert.assertTrue(btn.toString().contains("Proceder al pago"));
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void PedidosArchivados() {
		
		EsperarPorElemento(driver,Homepage.AccountsList(driver));
		Homepage.AccountsList(driver).click();
		
		EsperarPorElemento(driver,TuCuenta.PedidosArchivados(driver));
		TuCuenta.PedidosArchivados(driver).click();
		
		//Here is the assertion
		EsperarPorElemento(driver,driver.findElement(By.id("Detalles-del-pedido-_1")));
		String btn = driver.findElement(By.id("Detalles-del-pedido-_1")).getText();
		Assert.assertTrue(btn.toString().contains("Detalles del pedido"));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void AgregarDireccion() {
		
		Homepage.AccountsList(driver).click();
		
		EsperarPorElemento(driver,TuCuenta.Direcciones(driver));
		TuCuenta.Direcciones(driver).click();
		
		EsperarPorElemento(driver,AddDireccion.BtnAgregar(driver));
		AddDireccion.BtnAgregar(driver).click();
		
		EsperarPorElemento(driver, AddDireccion.Pais(driver));
		//AddDireccion.Pais(driver).click();
		AddDireccion.Pais(driver).click();
		
		EsperarPorElemento(driver, AddDireccion.SubPais(driver));
		AddDireccion.SubPais(driver).click();
		
		EsperarPorElemento(driver,AddDireccion.NombreCompleto(driver));
		AddDireccion.NombreCompleto(driver).sendKeys("Marco Brujan");
		
		EsperarPorElemento(driver, AddDireccion.Direccion(driver));
		AddDireccion.Direccion(driver).sendKeys("Calle 8 Piantini");
		
		EsperarPorElemento(driver,AddDireccion.Direccion2(driver));
		AddDireccion.Direccion2(driver).sendKeys("Manzana 8");
		
		EsperarPorElemento(driver, AddDireccion.Ciudad(driver));
		AddDireccion.Ciudad(driver).sendKeys("Santo Domingo");
		
		EsperarPorElemento(driver,AddDireccion.Estado(driver));
		AddDireccion.Estado(driver).sendKeys("Santo Domingo");
		
		EsperarPorElemento(driver, AddDireccion.CodigoPostal(driver));
		AddDireccion.CodigoPostal(driver).sendKeys("10103");
		
		EsperarPorElemento(driver, AddDireccion.NumeroTel(driver));
		AddDireccion.NumeroTel(driver).sendKeys("8099127454");
		
		EsperarPorElemento(driver, AddDireccion.BtnAgregarUnaDireccion(driver));
		AddDireccion.BtnAgregarUnaDireccion(driver).click();
		
		
		//Here is the assertion
		EsperarPorElemento(driver,driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/h4")));
		String msg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/h4")).getText();
		Assert.assertTrue(msg.toString().contains("Dirección guardada"));
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void OrdenAntigua() {
		
		EsperarPorElemento(driver, Homepage.Pedidos(driver));
		Homepage.Pedidos(driver).click();
		
		EsperarPorElemento(driver, 	Pedidos.PedidosArchivados(driver));
		Pedidos.PedidosArchivados(driver).click();
		
		EsperarPorElemento(driver, 	Pedidos.SeleccionAntiguedad(driver));
		Pedidos.SeleccionAntiguedad(driver).click();
		
		//Pedidos.PedidoMasAntiguo(driver).click();
		EsperarPorElemento(driver, Pedidos.testlist(driver));
		Pedidos.testlist(driver);
		//Here is the assertion
		
	//	String reloj = driver.findElement(By.xpath("//*[@id=\"instantOrderUpdate_feature_div\"]/div/div/div/div/span[2]")).getText();
		Assert.assertTrue(Pedidos.testlist(driver).isDisplayed());
	
	}
	
	@After
	public void close() {
		
		driver.quit();
		
	}
	

}
