package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Información.Macrosectores;
import Información.sobreCCB;
import io.appium.java_client.MobileElement;

public class InformacionTest {
	
	private EnhancedAndroidDriver<MobileElement> driver;
	Macrosectores macro;
	sobreCCB ccb;
	
	
	@Before
	public void setUp() throws Exception {
		//macro = new Macrosectores(driver);
		//driver = macro.androidConection();
		ccb = new sobreCCB(driver);		
		ccb.androidConection();
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		ccb.verCCB();
		//macro.industrias();
		
	}

}
