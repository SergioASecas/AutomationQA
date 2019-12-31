package Servicios;

import org.openqa.selenium.By;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import io.appium.java_client.MobileElement;

public class Servicios extends Base {
	
	By noticiasLocator    = By.xpath("//*[@text='Servicios' and ./parent::*[@text='Servicios']]");
	certificadosElectronicos ce = new certificadosElectronicos(driver);
	renovaciones re				= new renovaciones(driver);
	eventosYCapacitaciones ec   = new eventosYCapacitaciones(driver);
	solicitudTurnosyCitas stc	= new solicitudTurnosyCitas(driver);
	asesoríaVirtual av			= new asesoríaVirtual(driver);
	
	public Servicios(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void servicios() throws Exception {
		click(noticiasLocator);
		eventos();
	}
	
	public void certificados() throws Exception {
		ce.certificadosElectronicos1(); 
		//ce.certificadosElectronicos2();
		//ce.certificadosElectronicos3();
		//ce.certificadosElectronicos4();
		//ce.certificadosElectronicos5();
	}
	
	public void renovaciones() throws InterruptedException {
		re.obtenerRenovaciones();
		re.login();
		//re.completarInformacion();
		re.recuperarClave();
		re.actualizarInfoClave();
		re.generarClave();
	}
	
	public void eventos() throws Exception {
		ec.eventosYCap();
		ec.misEventos();
		ec.responderEncuesta();
		ec.memorias();		
	}

	public void solicitudCitas() throws InterruptedException {
		stc.agendarCita();
		stc.solicitudTurno();
	}
	
	public void asesoriaVirtual() {
	}
}
