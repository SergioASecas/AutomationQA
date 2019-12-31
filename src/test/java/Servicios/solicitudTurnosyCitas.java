package Servicios;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import io.appium.java_client.MobileElement;

public class solicitudTurnosyCitas extends Base {
	
	By serviciosLocator			= By.xpath("//*[@text='Servicios >']");
	By solicitudLocator			= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[4]");
	By agendarCitaLocator		= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[./*[@class='android.widget.Image']])[1]");
	By solicitudTurnoLocator	= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*[./*[@class='android.widget.Image']])[2]");
	By solicitarCitaBtnLocator	= By.xpath("//*[@text='Solicitar cita']");
	By aceptarBtn				= By.xpath("//*[@text='Aceptar']");
	By agendeCitaLocator		= By.xpath("//*[@text='Agende su cita' and ./parent::*[./parent::*[@text='Agende su cita']]]");
	By solicitarCitaLocator		= By.xpath("//*[@text='Solicitar cita']");
	By tipoDocumentoDropLocator	= By.xpath("//*[@text='Seleccione tipo de documento']");
	By numeroIdLocator			= By.xpath("//*[@resource-id='ContentPlaceHolderContenido_controlCapturaDatos_txtIdentificacion']");
	By correoLocator			= By.xpath("//*[@id='ContentPlaceHolderContenido_controlCapturaDatos_txtCorreo']");
	By cedulaSeleccionLocator	= By.xpath("//*[@text='Cédula']");
	By agendeTurnoLocator		= By.xpath("//*[@class='android.view.View' and ./*[@text='Agende su turno'] and ./parent::*[@text='Agende su turno']]");
	By soliciteTurno			= By.xpath("//*[@text='Solicitar turno']");
	By documentoIdseleccionLocator = By.xpath("//*[@text='Cédula']");
	
	public solicitudTurnosyCitas(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void ingresar() {
		click(serviciosLocator);
		click(solicitudLocator);
	}

	public void agendarCita() throws InterruptedException {
		
		click(agendarCitaLocator);
		click(aceptarBtn);
		click(agendeCitaLocator);
		click(solicitarCitaLocator);
		click(tipoDocumentoDropLocator);
		click(cedulaSeleccionLocator);
		type("1024541964", numeroIdLocator);
		type("sergiovillalba@cbit-online.com", correoLocator);
	}
	
	public void solicitudTurno() throws InterruptedException{
	
		click(solicitudTurnoLocator);
		click(aceptarBtn);
		click(agendeTurnoLocator);
		click(soliciteTurno);
		click(tipoDocumentoDropLocator);
		click(documentoIdseleccionLocator);
		type("1024541964", numeroIdLocator);
		type("sergiovillalba522", correoLocator);
		
		
	}

}
