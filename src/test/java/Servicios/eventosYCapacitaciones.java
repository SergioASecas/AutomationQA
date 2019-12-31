package Servicios;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import io.appium.java_client.MobileElement;


public class eventosYCapacitaciones extends Base{
	
	By serviciosLocator					= By.xpath("//*[@text='Servicios >']");
	By eventosycapacitacionesLocator	= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[3]");
	//By eventCapLocator					= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[3]");
	By eventosLocator					= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[1]");
	By userLocator						= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='USUARIO']]]");
	By claveLocator						= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='CLAVE']]]");
	By entrarButtonLocator				= By.xpath("//*[@text='Entrar']");
	By misEventosLocator				= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[2]");
	By responderEncuestaLocator			= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[3]");
	By memoriasLocator					= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[@class='android.view.View'])[2]/*[@class='android.view.View'])[3]/*[./*[@class='android.widget.Image']])[4]");
	By filtroEventosLocator				= By.xpath("//*[@text='Filtrar eventos y capacitaciones']");
	By todoElContenidoLocator			= By.xpath("//*[@text='Todo el contenido']");
	By terminosYCondLocator				= By.xpath("//*[@text='Consulta terminos y condiciones aqui']");
	By descargarTerminosLocator			= By.xpath("//*[@text='Descargar']");
	By descargarCondicionesChat			= By.xpath("(//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@text='  '] and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@text='  '] and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='  ']]]]]/*/*[@text='Descargar'])[2]");
	By okLocator						= By.xpath("//*[@class='android.widget.Button']");
	By porNombreLocaotor				= By.xpath("//*[@text='Por nombre']");
	By buscarLblLocator					= By.xpath("//*[@id='mobileSearchTextFilter']");
	By buscarBtnLocator					= By.xpath("//*[@text='Buscar']");
	By atrasLocator						= By.xpath("//*[@content-desc='Back Button']");
	By porFiltroLocator					= By.xpath("//*[@text='Por tipo']");
	By porPrecioLocator					= By.xpath("");
	
	
	public eventosYCapacitaciones(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void ingresar() {
		click(serviciosLocator);
		click(eventosycapacitacionesLocator);
	}

	public void eventosYCap() throws Exception {
		click(eventosLocator);
		Thread.sleep(5000);	
	    click(filtroEventosLocator);
	    click(porNombreLocaotor);
	    type("2018", buscarLblLocator);
	    click(buscarBtnLocator);
	    click(atrasLocator);
	    click(filtroEventosLocator);
	    click(porFiltroLocator);
	    click(porPrecioLocator);
	   /* click(porAreaLocator);
	    click(porSectorLocator);
	    click(porModalidadLocator);
	    click(porFechaDeInicio);
	    click(porDuracionLocator);*/
	    
	    click(filtroEventosLocator);
	   /* driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().className(\"android.widget.FrameLayout\"));");
	    
	    click(todoElContenidoLocator);
	    driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().text(\"Síganos en redes\"));");*/
	    
	    click(todoElContenidoLocator);
	    driver.findElementByAndroidUIAutomator("new UiScrollable("
		        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
		        + "new UiSelector().text(\"Materiales\"));");
	}
	
	public void misEventos() throws InterruptedException {	
		click(misEventosLocator);
		type("ascadasfaf", userLocator);
		type("sdfdfgsg", claveLocator);
		click(entrarButtonLocator);
		Thread.sleep(4000);
		click(okLocator);
		click(terminosYCondLocator);
		 driver.findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
			        + "new UiSelector().text(\"Descargar\"));");
		 click(descargarTerminosLocator);
		 click(descargarCondicionesChat);
	}
	
	public void responderEncuesta() throws InterruptedException {		
	
		click(responderEncuestaLocator);
		Thread.sleep(10000);	
	}
	
	public void memorias() throws InterruptedException {	
		click(memoriasLocator);
		Thread.sleep(10000);	
	}

}
