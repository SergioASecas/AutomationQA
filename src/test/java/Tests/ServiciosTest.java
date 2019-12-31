package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import Barra.Barra;
import Servicios.Servicios;
import Servicios.asesoríaVirtual;
import Servicios.certificadosElectronicos;
import Servicios.eventosYCapacitaciones;
import Servicios.solicitudTurnosyCitas;
import io.appium.java_client.MobileElement;

public class ServiciosTest {

	private EnhancedAndroidDriver<MobileElement> driver;
	certificadosElectronicos CertificadosElectronicos;
	eventosYCapacitaciones eventos;
	solicitudTurnosyCitas syt;
	Servicios servicios;
	asesoríaVirtual av;
	Barra n;
	
	@Before
	public void setUp() throws Exception {
		CertificadosElectronicos= new certificadosElectronicos(driver);
		driver = CertificadosElectronicos.androidConection();
		//n = new Barra(driver);	
				
	}

	@Test
	public void test() throws Exception {		
		//eventos.ingresar();
		//eventos.misEventos();
		
		//eventos.ingresar();
		//eventos.eventosYCap();
		//n.irASolicitudturno();
		//n.irASolicitudCita();
		//n.irARenovaciones();
		//n.irAEncuesta();
		//n.irAMemorias();
		//n.irAMisEventos();
		//n.irAEventos();
		//n.verServicios();
		//n.descargar();
		//n.verNoticias();
		//n.verificaciones();
		//CertificadosElectronicos.obtenerCertificadosElectronicos();
		//CertificadosElectronicos.verificacion();
		//CertificadosElectronicos.descargaCertificados();
		//CertificadosElectronicos.androidConection();
		//CertificadosElectronicos.certificadosElectronicos2();
		CertificadosElectronicos.certificadosElectronicos1();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
