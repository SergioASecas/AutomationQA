package Servicios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class AppTest {
	
	@Rule
	public TestWatcher watcher = Factory.createWatcher();
    public static EnhancedAndroidDriver<MobileElement> driver;
	String path;
	File p = new File("C:\\Users\\SERGIO\\eclipse-workspace\\appcenterautomation-master\\app\\ccb.apk");
	
	
	@Before
	public void Iniciar() throws InterruptedException
	{
		System.out.println("Iniciando Sesion");
		path = System.getProperty("user.dir");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Moto G");
		cap.setCapability("app", p.getAbsolutePath());
		try {
			driver = Factory.createAndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void DemoApp() throws InterruptedException{
		//certificadosElectronicos ce=new certificadosElectronicos();
		//renovaciones re=new renovaciones();
		//ce.obtenerCertificadosElectronicos();
	    //re.obtenerRenovaciones();
		
	}
}
