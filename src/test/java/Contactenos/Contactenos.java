package Contactenos;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Servicios.Base;
import io.appium.java_client.MobileElement;

public class Contactenos extends Base{

	By contactenosLocator  				= By.xpath("//*[@text='Contáctenos >']");
	By chatLocator						= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*[./*[@class='android.widget.Image']])[1]");
	By tipoDocumentoDropLocator			= By.xpath("//*[@text='Tipo de Documento']");
	By seleccionDocumentoLocator		= By.xpath("//*[@text='Cédula Ciudadanía']");
	By numeroIdTxtLocator				= By.xpath("(//*[@class='android.view.View']/*/*/*[@class='android.widget.EditText'])[1]");
	By nombreTxtLocator					= By.xpath("(//*[@class='android.view.View']/*/*/*[@class='android.widget.EditText'])[2]");
	By checkBoxLocator					= By.xpath("//*[@class='android.widget.CheckBox' and ./parent::*[@text='Acepto la política de protección de datos personales publicada aquí ']]");
	By checkBoxReCaptchaLocator			= By.xpath("//*[@text='Se requiere la verificación de reCAPTCHA.. No soy un robot']");
	By iniciarChatBtnLocator			= By.xpath("//*[@text='Iniciar Chat']");
	By llamadaVirtual	 				= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[4]");
	By colgarLocator	  				= By.xpath("//*[@resource-id='com.android.incallui:id/endButton']");
	By llamadaVirtualLocator			= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*[./*[@class='android.widget.Image']])[2]");
	By nombresyapellidosLocator			= By.xpath("//*[@resource-id='nombres']");
	By numeroCelularLocator				= By.xpath("//*[@resource-id='identificacion']");
	By marcarLocator					= By.xpath("//*[@text='Marcar']");
	By llamarLocator					= By.xpath("//*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View'] and ./*[@text='Llamar']]]");
	By ubiquenosLocator   				= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[3]");
	By permitirLocator	 				= By.xpath("//*[@text='PERMITIR']");
	By aceptarLocator	  				= By.xpath("//*[@text='Aceptar' and @class='android.widget.Button']");
	
	
	public Contactenos(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
		
	}
	
	public void entrar() {
		click(contactenosLocator);
		click(chatLocator);
	}
	
	public void chatear() {		
		click(tipoDocumentoDropLocator);
		click(seleccionDocumentoLocator);
		type("1024541964", numeroIdTxtLocator);
		type("Sergio Villalba", nombreTxtLocator);
		click(checkBoxLocator);
		click(checkBoxReCaptchaLocator);
		click(iniciarChatBtnLocator);
	}	
	
	public void realizarLlamadaNumeral() throws InterruptedException {
		//click(permitirLocator);
		click(contactenosLocator);
		click(llamadaVirtual);
		Thread.sleep(4000);
		click(colgarLocator);
	}
	
	public void realizarLlamadaVirtual() throws InterruptedException {		
		click(contactenosLocator);
		click(llamadaVirtualLocator);	
		type("Sergio Villalba", nombresyapellidosLocator);
		type("3213746653", numeroCelularLocator);
		click(marcarLocator);
		click(llamarLocator);	
	}
	
	public void ubicar() throws InterruptedException {		
		click(contactenosLocator);
		click(ubiquenosLocator);
		click(permitirLocator);
		click(aceptarLocator);
	}
	
	

}
