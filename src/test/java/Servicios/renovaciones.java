package Servicios;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class renovaciones extends Base {	

	By serviciosLocator 			= By.xpath("//*[@text='Servicios >']");
	By renovacionesLocator			= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*/*[@class='android.widget.Image'])[1]");
	By tipoDocumentoDropLocator		= By.xpath("//*[@class='android.widget.Spinner']");
	By documentoLocator				= By.xpath("//*[@text='CEDULA DE CIUDADANIA']");
	By numeroDocumentoLocator		= By.xpath("//*[@resource-id='numeroDocumento']");
	By numeroMatriculaLocator		= By.xpath("//*[@resource-id='numeroMatricula']");
	By claveLocator					= By.xpath("//*[@resource-id='clave']");
	By checkBoxLocator				= By.className("android.widget.CheckBox");
	By ingresarButtonLocator		= By.xpath("//*[@text='Ingresar']");
	By solicitudClaveLocator		= By.xpath("((//*[@id='login']/*[@class='android.view.View'])[1]/*[@text and @class='android.view.View'])[2]");
	By checkBox2Locator				= By.className("android.widget.CheckBox");
	By aceptarTerminosButtonLocator	= By.xpath("//*[@text='Solicitar Clave']");
	By tipoDocumentoDropDownLocator	= By.xpath("//*[@text='Seleccione'] ");
	By documentoDropLocator			= By.xpath("(//*[@class='android.widget.ListView']/*[@text])[2]");
	By siguienteButtonLocator		= By.xpath("//*[@id='ctl00_cph_columna_der_btnValidarIdentificacion']");
	By documentoIdentificacion		= By.xpath("//*[@id='ctl00_cph_columna_der_txtNumeroIdentificacion']");
	By validarIdentificacionButton	= By.xpath("//*[@id='ctl00_cph_columna_der_btnValidarIdentificacion']");
	By continuarButtonLocator		= By.xpath("//*[@text='Continuar']");
	By claveTxtLocator				= By.id("ctl00_ContentPlaceHolder1_txtClave");
	By confirmarClaveLocator		= By.id("ctl00_ContentPlaceHolder1_txtConfirmar");
	By pregunta1DropLocator			= By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DropDownList1']");
	By pregunta1Locator				= By.xpath("//*[@text='¿Cuál es su bebida favorita?']");
	By pregunta2DropLocator			= By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DropDownList2']");
	By pregunta2Locator				= By.xpath("//*[@text='¿Cuál es el nombre de su primer novio/novia?']");
	By respuesta1Locator			= By.id("TextBox1"); 
	String respuesta1 				= "agua";
	By respuesta2Locator			= By.id("TextBox2");
	String respuesta2				= "wilmer";
	By generarClaveButtonLocator	= By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnConfirmar']");
	String clave					= "Periferia2019";
	By recuperarClaveLocator		= By.xpath("//*[@text='¿Olvidó su clave virtual?']"); 
	By actualiceClave				= By.xpath("//*[@text='Actualice la información de su clave']");
	By tipoDocumentoLocator			= By.id("ctl00_ContentPlaceHolder1_DropDownList1");
	By numeroDocTxtLocator			= By.id("ctl00_ContentPlaceHolder1_TextBox1");
	By continuarLocator				= By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnActualizarInformacion']");
    By tipoDocLocator				= By.xpath("//*[@text='Cédula de ciudadanía']");
    By renovarLocator				= By.xpath("//*[@text='RENOVAR']");
	By infoMatricula			    = By.xpath("//*[@text='¿No tiene la información de su Matrícula?']");
	By busquedaDrop					= By.xpath("//*[@class='android.widget.Spinner']");
    By cedulaSeleccion				= By.xpath("//*[@text='Cédula de Ciudadanía']");
    By infoTxt						= By.xpath("//*[@resource-id='inputFiltro']");
	By buscarBtnLocator				= By.xpath("//*[@text='Buscar']");
    By atrasLocator					= By.xpath("//*[@contentDescription='Back Button']' and ./*[@class='android.view.View'] and ./*[@text='Cédula de Ciudadanía']]");
	By seleccionResultado			= By.xpath("//*[@text and @class='android.view.View' and ./parent::*[./parent::*[@class='android.widget.ListView']]]");
	By recibosLocator				= By.xpath("//*[@text='Recibos']");
	By formulariosDiligenciadosLoc	= By.xpath("//*[@text='Formularios Diligenciados']");
	By solicitudesLocator			= By.xpath("//*[@text='Solicitudes']");
	By atrasContinuarLocator		= By.xpath("//*[@text='Atrás/Continuar']");
	By formulariosLocator			= By.xpath("//*[@text='Formularios ']");
	By pagarLocator					= By.xpath("//*[@text='Pagar']");
	By descargarLocator				= By.xpath("//*[@text='Descargar']");
	By rechazarLocator				= By.xpath("//*[@text='Rechazar']");
	
	
	
	public renovaciones(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	
	public void obtenerRenovaciones() throws InterruptedException {
	//-----------------------------------------------------FLUJO DE RENOVACIONES----------------------------------------------------------------------					
				
		click(serviciosLocator);
		click(renovacionesLocator);		
	}
	
	public void login() throws InterruptedException {
	//-------------------------------------------------LLENADO DE FORMULARIO DE INGRESO---------------------------------------------------------------- 

		//SCROLL		
		driver.findElementByAndroidUIAutomator("new UiScrollable("
			        + "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
			        + "new UiSelector().text(\"Ingresar\"));");
			
		click(infoMatricula);
		click(busquedaDrop);
		click(cedulaSeleccion);
		type("1030613947", infoTxt);
		click(buscarBtnLocator);	

		Thread.sleep(5000);
		click(seleccionResultado);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable("
					+ "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
					+ "new UiSelector().text(\"INGRESAR\"));");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable("
				+ "new UiSelector().className(\"android.webkit.WebView\")).scrollIntoView("                      
				+ "new UiSelector().text(\"Ingresar\"));");
		
		click(documentoDropLocator);
		click(documentoLocator);
		click(numeroDocumentoLocator);
		type("1030613947",numeroDocumentoLocator);
		//click(numeroMatriculaLocator);
		//type("02787732", numeroMatriculaLocator);
		click(claveLocator);
		type("Comercio2017", claveLocator);
		//type("1030613947",numeroDocumentoLocator);			
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
			//	+ ".className(\"android.view.View\")).scrollIntoView("
				//+ "new UiSelector().text(\"Ingresar\"));");
		//type("Noviembre2019", claveLocator);
		//ocultarKeyboard();
		click(checkBoxLocator);
		click(ingresarButtonLocator);
	}
	
	
	public void completarInformacion() {
	//------------------------------------------------FLUJO PARA COMPLETAR INFORMACIÓN------------------------------------------------------------------	
		//FLUJO DE RENOVACION
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"2018\"));");
		//click(renovarLocator);
		click(recibosLocator);
		click(atrasContinuarLocator);
		click(formulariosDiligenciadosLoc);
		click(formulariosLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Renovación Matrícula Mercantil y ESAL.\"));");
		click(atrasContinuarLocator);
		click(solicitudesLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Renovación Matrícula Mercantil y ESAL.\"));");
		click(pagarLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Continuar al pago\"));");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Número de solicitud\"));");
		click(descargarLocator);
		driver.findElement(By.xpath("//*[@contentDescription='Back Button']"));
		click(rechazarLocator);
		
		
		
		/*
		//COMPLETAR SITUACIÓN FINANCIERA
		if(isDisplayed(locator)) {
			isDisplayed(incompletoLocator);
			click(estadoFinancieroLocator);
			click(situacionFinancieraLocator);
			type("", privadoTxtLocator);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Grabar\"));");
		
			type("", activoCorrienteTxtLocator );
			type("", activoNocorrienteTxtLocator);
			type("", pasivoCorrienteTxtLocator);
			type("", pasivoNoCorrienteTxtLocator);
			type("", patrimonioTxtLocator);
			click(tipoNiifDropDownLocator);
			click(grupo1Locator);
			if(isDisplayed(contiuarLocator)) {
				click(contiuarLocator);				
			}			
		}
		
		//INFORMACIÓN FINANCIERA
		if(isDisplayed(estadoResultadosLocator)) {
			click(grabarLocator);
			click(atrasContinuarLocator);
		}
		
		
		//COMPLETAR INFORMACIÓN SI TIENE ESTABLECIMIENTO
		if(isDisplayed(establecimientoIncompletoLocator)) {
			click(establecimientoIncompletoLocator);
			click(fitboxLocator);
			click(Locator);
			type("", valorActivosTxt);
			type("", trabajadoresTxtLocator);
			click(grabar2Locator);
			click(atasLocator);
			click(atrasLocator);			
		}
		
		click(continuarConfirmarbutton);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"EXISTENCIA Y REPRESENTACION LEGAL\"));");
		click("agregar boton mas");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Pagar\"));");
		click(pagarLocator);
		click(aceptarLocator);*/	
	}
	
	public void recuperarClave() {
		click(serviciosLocator);
		click(renovacionesLocator);	
		click(solicitudClaveLocator);
		//TERMINOS Y CONDICIONES GENERACION CLAVE
		click(checkBox2Locator);
		click(aceptarTerminosButtonLocator);
		
		//VALIDAR INFORMACIÓN CLAVE	
		click(tipoDocumentoDropDownLocator);
		click(documentoDropLocator);
		click(documentoIdentificacion);
		type("1012335930", documentoIdentificacion);
		ocultarKeyboard();
		click(validarIdentificacionButton);
		click(continuarButtonLocator);				
	}
	
	public void actualizarInfoClave() {
		click(serviciosLocator);
		click(renovacionesLocator);	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"Actualice la información de su clave\"));");
		click(actualiceClave);
		click(tipoDocumentoLocator);
		click(tipoDocLocator);
		click(numeroDocTxtLocator);
		type("", numeroDocTxtLocator);
		click(continuarLocator);
		
	}
	
	public void generarClave() {
		
		click(serviciosLocator);
		click(renovacionesLocator);	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().text(\"¿Olvidó su clave virtual?\"));");
		click(recuperarClaveLocator);
		//TERMINOS Y CONDICIONES GENERACION CLAVE
		click(checkBox2Locator);
		click(aceptarTerminosButtonLocator);
		
		//VALIDAR INFORMACIÓN CLAVE	
		click(tipoDocumentoDropDownLocator);
		click(documentoDropLocator);
		click(documentoIdentificacion);
		type("1012335930", documentoIdentificacion);
		ocultarKeyboard();
		click(validarIdentificacionButton);
		click(continuarButtonLocator);	
		
		/*
		 * REALIZAR PASOS MANUALMENTE:
		 * 
		 * 1. FECHA DE EXPEDICION DE LA CÉDULA
		 * 2. PREGUNTAS DE SEGURIDAD ALEATORIAS
		 */
		
		click(claveTxtLocator);
		type(clave, claveTxtLocator);
		click(confirmarClaveLocator);
		type(clave, confirmarClaveLocator);
		
		click(pregunta1DropLocator);
		click(pregunta1Locator);
		click(respuesta1Locator);
		type(respuesta1, respuesta1Locator);
		
		click(pregunta2DropLocator);
		click(pregunta2Locator);
		click(respuesta2Locator);
		type(respuesta2, respuesta2Locator);		
		click(generarClaveButtonLocator);		
		
	}

}
