package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Menu.Menu;
import io.appium.java_client.MobileElement;

public class MenuTest {
	private EnhancedAndroidDriver<MobileElement> driver;
	Menu menu;

	@Before
	public void setUp() throws Exception {
		menu = new Menu(driver);
		driver = menu.androidConection();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

	@Test
	public void test() throws InterruptedException {
		//menu.servicios();
		//menu.informacion();
		//menu.configuracion();
		//menu.registrarse();
		//menu.ingresar();
		menu.contactenos();
	}

}
