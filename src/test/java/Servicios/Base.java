package Servicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;
import io.appium.java_client.MobileElement;


public class Base {
	

	@Rule
	public TestWatcher watcher = Factory.createWatcher();
    public EnhancedAndroidDriver<MobileElement> driver;
	String path;
	File p = new File("C:\\Users\\SERGIO\\eclipse-workspace\\appcenterautomation-master\\app\\ccb.apk");
	
	
	public Base(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver=driver;
	}
	
	public EnhancedAndroidDriver<MobileElement> androidConection() {
		System.out.println("Iniciando Sesion");
		path = System.getProperty("user.dir");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Huawei P Smart 2019");
		cap.setCapability("app", p.getAbsolutePath());
		try {
			driver = Factory.createAndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public MobileElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<MobileElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public boolean isDisplayed(By locator) {
		try {		
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void ocultarKeyboard() {
		driver.hideKeyboard();
	}
	
	public String leerExcel(String nombreHoja, int numeroFila, int numeroCelda) throws IOException {
		String archivo = "C:\\Users\\SERGIO\\Desktop\\loginCertL.xlsx";
		File file = new File(archivo);		
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook myWorkbook = new XSSFWorkbook(inputStream);
		XSSFSheet mySheet = myWorkbook.getSheet(nombreHoja);
		//DataFormatter formato = new DataFormatter();
		
		XSSFRow fila = mySheet.getRow(numeroFila);
		XSSFCell celda = fila.getCell(numeroCelda);		
		return celda.getStringCellValue();	
	}
	
}
