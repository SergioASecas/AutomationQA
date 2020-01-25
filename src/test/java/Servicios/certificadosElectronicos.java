
package Servicios;

import java.io.IOException;

import org.openqa.selenium.By;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import io.appium.java_client.MobileElement;


public class certificadosElectronicos extends Base{
	
	By inicioPageLocator    			= By.xpath("//*[@text='Servicios >']");
	By serviciosPageLocator 			= By.xpath("//*[@text='Servicios >']");
	By ceritificadosElectronicosLocator = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[2]");
	By solicitudLocator 				= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[1]");
	By dropDownLocator 					= By.xpath("//*[@class='android.view.View' and ./*[@text=' Seleccione']]");
	By seleccionDropDown2Locator		= By.xpath("//*[@text='Identificación']");
	By tiposDeIdDropDownLocator			= By.xpath("//*[@class='android.view.View' and ./*[@text=' Seleccione']]");
	By idLocator						= By.xpath("(//*[@class='android.widget.ListView']/*[@text])[2]");
	By seleccionDropDown3Locator		= By.xpath("//*[@text='Razón Social']");
	By seleccionDropDown4Locator		= By.xpath("//*[@text='Palabra Clave']");
	By seleccionDropDown5Locator		= By.xpath("//*[@text='Proponente']");
	By filtroLocator					= By.className("android.widget.EditText");
	By buscarInscritosLocator			= By.xpath("//*[@class='android.widget.Button']");
	By resultadoLocator					= By.xpath("//*[@text and @class='android.view.View' and ./parent::*[./parent::*[@class='android.widget.ListView']]]");
	By addLibroComercioLocator			= By.xpath("(//*/*[@class='android.widget.Button'])[3]");
	By addExistenciaYRepLocator			= By.xpath("(//*/*[@class='android.widget.Button'])[3]");
	By addMatriculaMercantilLocator		= By.xpath("(//*/*[@class='android.widget.Button'])[1]");
	By confirmarButtonLocator			= By.xpath("//*[@text='Confirmar']");
	By tiposDeIdentificacionLocator		= By.xpath("//*[@class='android.view.View' and ./*[@text=' Seleccione']]");
	By numeroDocumentoLocator			= By.className("android.widget.EditText");
	By buscarButtonLocator				= By.xpath("//*[@text='Buscar']");
	By emailLocator						= By.className("android.widget.EditText");
	By nombre1Locator					= By.id("nombres");
	By nombre2Locator					= By.id("nombres1");
	By apellido1Locator					= By.id("apellidos");
	By apellido2Locator					= By.id("apellidos1");
	By telefonoLocator					= By.id("telefono");
	By paisDropDownLocator				= By.xpath("//*[@class='android.widget.Image' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='COLOMBIA'] and ./parent::*[@class='android.view.View']]]");
	By ciudadDropDownLocator			= By.xpath("//*[@class='android.widget.Image' and ./parent::*[./parent::*[@class='android.view.View'] and (./preceding-sibling::* | ./following-sibling::*)[@id='municipio']]]");
	By direccionLocator					= By.id("direccion");
	By checkBoxLocator					= By.className("android.widget.CheckBox");
	By pagarButtonLocator				= By.xpath("//*[@text='Pagar']");
	By seleccionDropDownLocator			= By.xpath("//*[@text='Matrícula']");
	By seleccionIdLocator				= By.xpath("(//*[@class='android.widget.ListView']/*[@text])[2]");
	By descargaLocator					= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[2]");
	By cedulaDropLocator				= By.xpath("//*[@text='CEDULA DE CIUDADANIA']");
	By cedulaLocator					= By.xpath("//*[@class='android.widget.EditText']");
	By descargarButtonLocator			= By.xpath("//*[@class='android.widget.Button']");
	By verificacionLocator				= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[3]");
	By atrasBtnLocator					= By.xpath("//*[@class='android.widget.ImageButton']");
	By pseLocator						= By.xpath("//*[@class='android.view.View' and ./*[@text='Débito automático PSE']]");
	By visaLocator						= By.xpath("//*[@class='android.view.View' and ./*[@text='Tarjeta de crédito Visa']]");
	By masterCardLocator				= By.xpath("//*[@class='android.view.View' and ./*[@text='Tarjeta de crédito MasterCard']]");
	By pagoCCBLocator					= By.xpath("//*[@class='android.view.View' and ./*[@text='Pago en bancos o sedes CCB']]");
	By continuarPagoLocator				= By.xpath("//*[@text='Continuar al pago']");
	By pagarMasterCardLocator			= By.xpath("//*[@text='Pagar']");
	By codigoVerificacionLocator		= By.xpath("//*[@class='android.widget.EditText']");
	By heLeidoCheckBoxLocator			= By.xpath("//*[@class='android.widget.CheckBox']");
	By aceptarBtnLocator				= By.xpath("//*[@text='Aceptar']");
	By cerrarBtnLocator					= By.xpath("//*[@class='android.view.View' and ./*[@text='Este código de verificación no existe.']]");
	By dondeLoEncuentroLocator			= By.xpath("//*[@text='img_codigo_verificacion']");
	By solicitud2Locator				= By.xpath("//*[@text=' Solicitud']");
	By descarga2Locator					= By.xpath("//*[@text=' Descarga']");
	By verificacion2Locator				= By.xpath("//*[@text=' Verificación']");
	By backLocator						= By.xpath("//*[@content-desc='Back Button']");
	By atrasBtnLocatorApp				= By.xpath("//*[@text='Atrás']");
	By pdfLocator						= By.xpath("//*[@text='Lector de PDF de Drive']");
	By terminosyCondicionesLocator		= By.xpath("//*[@text='Términos y condiciones']");
	By atrasLocator						= By.xpath("//*[@content-desc='Navegar hacia arriba']");
	
	public certificadosElectronicos(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void obtenerCertificadosElectronicos() throws InterruptedException {
		//-------------------------------------- FLUJO DE SERVICIOS, CERTIFICADOS ELECTRÓNICOS.--------------------------------------------
		
		click(serviciosPageLocator);
		click(ceritificadosElectronicosLocator);		
	}
	
	public void busquedaEmpresa()throws InterruptedException, IOException {
		click(solicitudLocator);
	    //---------------------------------------------DESPLEGABLE OPCIONES DE BÚSQUEDA-------------------------------------------------
		//click(dropDownLocator);
		//click(seleccionDropDownLocator);
		
		//SCROLL 	
		/*MobileElement elementToClick = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.view.View\")).scrollIntoView("
			        + "new UiSelector().resourceId(\"filtro\"));");
			elementToClick.click();	*/
		//click(filtroLocator);
		
		Thread.sleep(5000);
		String filtro = leerExcel("Login", 1, 0);
		type(filtro, filtroLocator);
		click(buscarInscritosLocator);
		click(resultadoLocator);
	}	
	
	public void busquedaEmpresa2()throws InterruptedException {
		
	    //---------------------------------------------DESPLEGABLE OPCIONES DE BÚSQUEDA-------------------------------------------------
		click(dropDownLocator);
		click(seleccionDropDown2Locator);
		
		//SCROLL 	
		    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			+ ".className(\"android.view.View\")).scrollIntoView("
			+ "new UiSelector().resourceId(\"filtro\"));");
		    
		click(tiposDeIdDropDownLocator);
		click(idLocator); 
		click(filtroLocator);
		type("1012335930", filtroLocator);
		click(buscarInscritosLocator);
		click(resultadoLocator);
	}	
	
	public void busquedaEmpresa3()throws InterruptedException {
		
	    //---------------------------------------------DESPLEGABLE OPCIONES DE BÚSQUEDA-------------------------------------------------
		click(dropDownLocator);
		click(seleccionDropDown3Locator);
		
		//SCROLL 	
		MobileElement elementToClick = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.view.View\")).scrollIntoView("
			        + "new UiSelector().resourceId(\"filtro\"));");
			elementToClick.click();	
		click(filtroLocator);
		type("CHAVARRO HERRERA JUAN CARLOS", filtroLocator);
		click(buscarInscritosLocator);
		click(resultadoLocator);
	}	
	
	public void busquedaEmpresa4()throws InterruptedException {
		
	    //---------------------------------------------DESPLEGABLE OPCIONES DE BÚSQUEDA-------------------------------------------------
		click(dropDownLocator);
		click(seleccionDropDown4Locator);
		
		//SCROLL 	
		MobileElement elementToClick = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.view.View\")).scrollIntoView("
			        + "new UiSelector().resourceId(\"filtro\"));");
			elementToClick.click();	
		click(filtroLocator);
		type("COLSANITAS", filtroLocator);
		click(buscarInscritosLocator);
		click(resultadoLocator);
	}	
	
	public void busquedaEmpresa5()throws InterruptedException {
		
	    //---------------------------------------------DESPLEGABLE OPCIONES DE BÚSQUEDA-------------------------------------------------
		click(dropDownLocator);
		click(seleccionDropDown5Locator);
		
		//SCROLL 	
		MobileElement elementToClick = (MobileElement) driver
			    .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			      + ".className(\"android.view.View\")).scrollIntoView("
			        + "new UiSelector().resourceId(\"filtro\"));");
			elementToClick.click();	
		click(filtroLocator);
		type("00000090", filtroLocator);
		click(buscarInscritosLocator);
		click(resultadoLocator);
	}	
	
	public void carroDeCompras() throws InterruptedException{
		//------------------------------------------------FLUJO DE ADICIÓN DE CERTIFICADOS---------------------------------------------------
		
		if(isDisplayed(addLibroComercioLocator)) {
			click(addLibroComercioLocator);
		}		
		
		//SCROLL Y SELECCION DE CERTIFICADOS			
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().textContains(\"MATRICULA MERCANTIL\"));");	
		if (isDisplayed(addMatriculaMercantilLocator)) {
				click(addMatriculaMercantilLocator);
		}
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			//	+ ".className(\"android.view.View\")).scrollIntoView("
				//+ "new UiSelector().textContains(\"EXISTENCIA Y REPRESENTACION\"));");
		if(isDisplayed(addExistenciaYRepLocator)) {
			click(addExistenciaYRepLocator);
		}
			
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Confirmar\"));");
		if(isDisplayed(confirmarButtonLocator)) {
			click(confirmarButtonLocator);	
		}
			
	}
	
	public void busquedaSolicitante() throws InterruptedException{
		//--------------------------------------------------BÚSQUEDA DE SOLICITANTE------------------------------------------------------------
		
		click(tiposDeIdentificacionLocator);
		click(seleccionIdLocator);
		click(numeroDocumentoLocator);
		type("1024541964", numeroDocumentoLocator);
		click(buscarButtonLocator);		
	}
	
	public void datosDelSolicitante() throws InterruptedException {
	//----------------------------------------------------DATOS DEL SOLICITANTE-----------------------------------------------------------
		
		//click(emailLocator);
		Thread.sleep(3000);
		type("sergiovillalba522@gmail.com", emailLocator);
		//ocultarKeyboard();
		click(checkBoxLocator);
		
		//SCROLL
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Certificados Electrónicos\"));");
		
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Pagar\"));");
		
		click(pagarButtonLocator);
		Thread.sleep(3000);
	}
	
	public void resumenPago() throws Exception {
	
		Thread.sleep(5000);
		//MobileElement btn = (MobileElement)
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"Débito automático PSE\"));");
		//btn.click();
		click(pseLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"Continuar al pago\"));");
		click(continuarPagoLocator);
		click(atrasBtnLocator);
		
		click(visaLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"Continuar al pago\"));");
		click(continuarPagoLocator);
		Thread.sleep(3000);
		click(atrasBtnLocator);
		
		click(masterCardLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"Continuar al pago\"));");
		click(continuarPagoLocator);
		Thread.sleep(3000);
		click(pagarMasterCardLocator);
		Thread.sleep(4000);
		click(atrasBtnLocator);
		click(atrasBtnLocator);
		
		click(pagoCCBLocator);
		/*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"Continuar al pago\"));");
		click(continuarPagoLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.webkit.WebView\")).scrollIntoView("
				+ "new UiSelector().text(\"DESCARGA\"));");
		click(descarga2Locator);*/
		
	}
	
	public void descarga() throws InterruptedException {	
		
		click(descargaLocator);
		click(tiposDeIdDropDownLocator);
		click(cedulaDropLocator);
		
		click(cedulaLocator);
		type("1024541964", cedulaLocator);
		click(buscarButtonLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Solicitud 9914356 08/11/2019 Estado Orden Pago Generada\"));");
		//Falta click en descargar
		click(atrasBtnLocatorApp);
	}
	
	public void verificacion() throws InterruptedException {
		click(verificacionLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().textContains(\"Código de verificación\"));");
		click(dondeLoEncuentroLocator);//hasta aca
		Thread.sleep(4000);
		click(backLocator);
		Thread.sleep(4000);
		/*Thread.sleep(5000);
        click(solicitud2Locator);
		click(backLocator);
		click(descarga2Locator);
		click(backLocator);
		click(verificacion2Locator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().textContains(\"Código de verificación\"));");
		*/
		click(terminosyCondicionesLocator);
		Thread.sleep(2000);		
		click(pdfLocator);
		Thread.sleep(3000);
		click(atrasLocator);
		type("9977286", codigoVerificacionLocator);
		click(heLeidoCheckBoxLocator);
		click(aceptarBtnLocator);
		click(cerrarBtnLocator);
		
	}
	
	public void certificadosElectronicos1()throws Exception {
	//--------------------------------------------CERTIFICADOS ELECTRONICOS POR MATRICULA--------------------------------------------------
		obtenerCertificadosElectronicos();
		busquedaEmpresa();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();		
		resumenPago();
				
	}
	
	public void certificadosElectronicos2()throws Exception {
	//--------------------------------------------CERTIFICADOS ELECTRÓNICOS POR IDENTIFICACION---------------------------------------------	
		obtenerCertificadosElectronicos();
		busquedaEmpresa2();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();
		resumenPago();
		
		
	}
	
	public void certificadosElectronicos3()throws Exception {
	//------------------------------------------CERTIFICADOS ELECTRÓNICOS POR RAZÓN SOCIAL-------------------------------------------------	
		obtenerCertificadosElectronicos();
		busquedaEmpresa3();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();
		resumenPago();
	
	}
	
	public void certificadosElectronicos4()throws Exception {
	//------------------------------------------CERTIFICADOS ELECTRÓNICOS POR PALABRA CLAVE-----------------------------------------------
		obtenerCertificadosElectronicos();
		busquedaEmpresa4();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();
		resumenPago();
		
	}
	
	public void certificadosElectronicos5()throws Exception {
	//------------------------------------------CERTIFICADOS ELECTRÓNICOS POR PROPONENTES-------------------------------------------------
		obtenerCertificadosElectronicos();
		busquedaEmpresa5();
		carroDeCompras();
		busquedaSolicitante();
		datosDelSolicitante();
		resumenPago();
	
	}
	
	public void certificados() throws Exception {
		certificadosElectronicos1(); 
		certificadosElectronicos2();
		certificadosElectronicos3();
		certificadosElectronicos4();
		certificadosElectronicos5();
	}
	
	public void descargaCertificados() throws InterruptedException {
		obtenerCertificadosElectronicos();
		descarga();
	}
	
	public void verificacionCertificados() throws InterruptedException {
		obtenerCertificadosElectronicos();
		verificacion();
	}
}

