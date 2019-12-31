package Información;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Servicios.Base;
import io.appium.java_client.MobileElement;

public class sobreCCB extends Base{
	
	By informacionLocator  = By.xpath("//*[@text='Información >']");
	By sobreCCBLocator	   = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*[./*[@class='android.widget.Image']])[1]");
	By chatLocator		   = By.xpath("//*[@id='topbar']");
	By tipoDocumentoLocator = By.xpath("//*[@text='Tipo de Documento']");
	By tipoDocumento	   = By.xpath("(//*[@id='f']/*/*[@class='android.widget.EditText' and ./parent::*[@id='dynamicField']])[1]");
	By cedulaLocator	   = By.xpath("//*[@text='Cédula Ciudadanía']");	
	By nombreLocator	   = By.xpath("(//*[@id='f']/*/*[@class='android.widget.EditText' and ./parent::*[@id='dynamicField']])[2]");
	By telefonoLocator	   = By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='telefono']]]");
	By terminosLocator	   = By.xpath("//*[@id='politicaproteccion']");	
	By iniciarChatLocator  = By.xpath("//*[@text='Iniciar Chat']");	
	By cerrarSesion		   = By.xpath("chat-close");
  	
	public sobreCCB(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	
	public void verCCB() {
		click(informacionLocator);
		click(sobreCCBLocator);
	
	/*	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.webkit.WebView\")).scrollIntoView("
			        + "new UiSelector().text(\"Síganos en redes\"));");*/
		
	/*	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.webkit.WebView\")).scrollToEnd(\"10\"));");*/
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.webkit.WebView\")).scrollIntoView("
			        + "new UiSelector().text(\"Más información\"));");
	}
}
