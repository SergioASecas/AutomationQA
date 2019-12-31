package Tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Contactenos.Contactenos;
import io.appium.java_client.MobileElement;


public class ContactenosTest {
	private EnhancedAndroidDriver<MobileElement> driver;
	Contactenos contactenos;	

	@Before
	public void setUp() throws Exception {
		contactenos = new Contactenos(driver);
		driver = contactenos.androidConection();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		//contactenos.chatear();
		/*contactenos.realizarLlamadaVirtual();
		contactenos.ubicar();*/
		contactenos.realizarLlamadaNumeral();
	}

}
