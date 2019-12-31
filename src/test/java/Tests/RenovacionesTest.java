package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import Servicios.renovaciones;
import io.appium.java_client.MobileElement;

public class RenovacionesTest {
	private EnhancedAndroidDriver<MobileElement> driver;
	renovaciones Renovaciones;

	@Before
	public void setUp() throws Exception { 
		
		Renovaciones = new renovaciones(driver);
		driver = Renovaciones.androidConection();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		//Renovaciones.generarClave();
		Renovaciones.obtenerRenovaciones();
		Renovaciones.login();
		//Renovaciones.completarInformacion();
	}

}
