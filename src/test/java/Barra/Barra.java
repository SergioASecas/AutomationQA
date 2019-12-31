package Barra;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import Servicios.Base;
import Servicios.certificadosElectronicos;
import Servicios.eventosYCapacitaciones;
import Servicios.renovaciones;
import Servicios.solicitudTurnosyCitas;
import io.appium.java_client.MobileElement;

public class Barra extends certificadosElectronicos {
	
	By noticiasLocator  				= By.xpath("//*[@text='Noticias' and ./parent::*[@text='Noticias']]");
	By serviciosLocator					= By.xpath("//*[@text='Servicios']"); 
	By certificadosElectronicosLocator	= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[2]");
	By solicitudLocator					= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[1]");
	By contactenosLocator  				= By.xpath("//*[@text='Contáctenos >']");
	By chatLocator						= By.xpath("//*[@text='Chat']");
	By tipoDocumentoDropLocator			= By.xpath("//*[@text='Tipo de Documento']");
	By seleccionDocumentoLocator		= By.xpath("//*[@text='Cédula Ciudadanía']");
	By numeroIdTxtLocator				= By.xpath("(//*[@class='android.view.View']/*/*/*[@class='android.widget.EditText'])[1]");
	By nombreTxtLocator					= By.xpath("(//*[@class='android.view.View']/*/*/*[@class='android.widget.EditText'])[2]");
	By checkBoxLocator					= By.xpath("//*[@class='android.widget.CheckBox' and ./parent::*[@text='Acepto la política de protección de datos personales publicada aquí ']]");
	By checkBoxReCaptchaLocator			= By.xpath("//*[@text='Se requiere la verificación de reCAPTCHA.. No soy un robot']");
	By iniciarChatBtnLocator			= By.xpath("//*[@text='Iniciar Chat']");
	By descargaLocator					= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[2]");
	By eventosycapacitacionesLocator	= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[3]");
	By eventosLocator					= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[1]");
	By misEventosLocator				= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[2]");
	By verMasLocator					= By.xpath("//*[@text='Ver más >>']");
	By verMas2Locator					= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*/*/*/*/*/*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text]])[2]");
	By atrasLocator						= By.xpath("//*[@contentDescription='Close Button']");
	By irAVerMasLocator					= By.xpath("//*[@text='Ver más' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='2019']]]]");
	By verMas3Locator					= By.xpath("//*[@text='Ver más' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Enero 2019']]]]");
	
	
	public Barra(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);		
	}
	
	public void verNoticias() throws InterruptedException {
		click(noticiasLocator);
		Thread.sleep(3000);
		click(verMasLocator);
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().text(\"2015\"));");
		driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().text(\"Noticias CCB\"));");
		Thread.sleep(3000);
		click(irAVerMasLocator);
		Thread.sleep(3000);
		click(verMas3Locator);
		driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().textContains(\"Ampliamos hasta el 29 \"));");
		Thread.sleep(3000);
		click(atrasLocator);	
		click(verMas2Locator);
	
		driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().textContains(\"La cámara de Comercio de Bogotá\"));");
		
	}
	
	public void verServicios() throws Exception {
		click(serviciosLocator);
		click(certificadosElectronicosLocator);
		//click(solicitudLocator);		
		busquedaEmpresa();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();
		resumenPago();		
	}
	
	public void descargar() throws Exception {
		click(serviciosLocator);
		click(certificadosElectronicosLocator);
		//click(descargaLocator);
		
		descarga();
		Thread.sleep(2000);
	}
	
	public void verificaciones() throws Exception {
		click(serviciosLocator);
		click(certificadosElectronicosLocator);
		verificacion();
		Thread.sleep(2000);
	}
	
	public void irARenovaciones() throws InterruptedException {
		renovaciones Renovaciones = new renovaciones(driver);
		Renovaciones.obtenerRenovaciones();
		Renovaciones.login();
		Renovaciones.completarInformacion();
	}
	
	public void irAEventos() throws Exception {
		click(serviciosLocator);
		click(eventosycapacitacionesLocator);	
		eventosYCapacitaciones eventos = new eventosYCapacitaciones(driver);
		eventos.eventosYCap();
	}
	
	public void irAMisEventos() throws Exception {
		click(serviciosLocator);
		click(eventosycapacitacionesLocator);
		eventosYCapacitaciones eventos = new eventosYCapacitaciones(driver);
		eventos.misEventos();
	}
	
	public void irAMemorias() throws Exception {
		click(serviciosLocator);
		click(eventosycapacitacionesLocator);
		eventosYCapacitaciones eventos = new eventosYCapacitaciones(driver);
		eventos.memorias();
	}
	
	public void irAEncuesta() throws Exception {
		click(serviciosLocator);
		click(eventosycapacitacionesLocator);
		eventosYCapacitaciones eventos = new eventosYCapacitaciones(driver);
		eventos.responderEncuesta();
	}
	
	public void irASolicitudCita() throws Exception {
		solicitudTurnosyCitas cita = new solicitudTurnosyCitas(driver);
		cita.ingresar();
		cita.agendarCita();
	}
	
	public void irASolicitudturno() throws Exception {
		solicitudTurnosyCitas turno = new solicitudTurnosyCitas(driver);
		turno.ingresar();
		turno.solicitudTurno();
	}
	public void verChat() {		
		click(chatLocator);
		click(tipoDocumentoDropLocator);
		click(seleccionDocumentoLocator);
		type("1024541964", numeroIdTxtLocator);
		type("Sergio Villalba", nombreTxtLocator);
		click(checkBoxLocator);
		click(checkBoxReCaptchaLocator);
		click(iniciarChatBtnLocator);		
	}

}
