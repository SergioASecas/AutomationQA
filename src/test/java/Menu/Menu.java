package Menu;

import org.openqa.selenium.By;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import Servicios.Base;
import io.appium.java_client.MobileElement;

public class Menu extends Base{
	
	By menuLocator  				= By.xpath("//*[@text='menu']");
	By documentoLocator				= By.xpath("//*[@id='cphContent_DocumentoTextbox']");
	By nombreLocator				= By.xpath("//*[@id='cphContent_NombreTextbox']");
	By primerApellidoLocator		= By.xpath("//*[@id='cphContent_PrimerApellidoTextbox']");
	By segundoApellidoLocator		= By.xpath("//*[@id='cphContent_SegundoApellidoTextbox']");
	By correoLocator				= By.xpath("//*[@id='cphContent_CorreoTextbox']");
	By confirmarLocator				= By.xpath("//*[@id='cphContent_ConfirmarCorreoTextbox']");
	By direccionLocator				= By.xpath("//*[@id='cphContent_DireccionTextbox']");
	By paisDropDownLocator			= By.xpath("//*[@id='cphContent_PaisDropDownList']");
	By paisSeleccionLocator			= By.xpath("//*[@text='COLOMBIA']");
	By departamentoDropdownLocator 	= By.xpath("//*[@id='cphContent_DepartamentoDropDownList']");
	By departamentoSeleccionLocator	= By.xpath("//*[@text='BOGOT� D.C']");
	By ciudadDropdownLocator		= By.xpath("//*[@id='cphContent_CiudadDropDownList']");
	By ciudadSeleccionLocagtor		= By.xpath("//*[@text='BOGOTA D.C.']");
	By celularLocator				= By.xpath("//*[@id='cphContent_CelularTextbox']");
	By telefonoLocator				= By.xpath("//*[@id='cphContent_TelefonoTextBox']");
	By checkBoxLocator				= By.xpath("//*[@id='cphContent_EnvioSmsCheckBox']");
	By sexoDropdownLocator			= By.xpath("//*[@id='cphContent_SexoDropDownList']");
	By sexoSeleccionLocator			= By.xpath("//*[@text='MASCULINO']");
	By fechaLocator					= By.xpath("//*[@id='cphContent_FechaNacimientoTextBox']");
	By a�oLocator					= By.xpath("//*[@id='date_picker_header_year']");
	By a�oSeleccionLocator			= By.xpath("//*[@text='1993']");
	By mesSeleccionLocator			= By.xpath("//*[@id='prev']");
	By diaSeleccionLocator			= By.xpath("//*[@text='12']");
	By establecerLocator			= By.xpath("//*[@text='ESTABLECER']");
	By nivelEstudioDropdownLocator  = By.xpath("//*[@id='cphContent_NivelEstudioDropDownList']");	
	By nivelEstudioSeleccionLocator	= By.xpath("//*[@text='BACHILLERATO']");
	By seguirButtonLocator			= By.xpath("//*[@id='btn']");

	By iniciarSesionbuttonLocator	= By.xpath("//*[@text='Iniciar sesi�n' and ./parent::*[./parent::*[@class='android.view.View']]]");
	By numeroIdLocator				= By.xpath("//*[@id='cphContent_loginUsuarioNoRegister_textBoxNombreUsuario']");
	By contrase�aLocator			= By.xpath("//*[@id='cphContent_loginUsuarioNoRegister_textBoxContrasena']");
	By iniciarSesionBtnLocator		= By.xpath("//*[@id='cphContent_loginUsuarioNoRegister_buttonIngresar']");
	
	By pasosButtonLocator			= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[16]/*[@class='android.view.View'])[3]/*[@class='android.view.View'])[3]/*[@text and @class='android.view.View'])[1]");
	By agendeAsesoriaButtonLocator	= By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]/*[@class='android.view.View'])[16]/*[@class='android.view.View'])[3]/*[@class='android.view.View'])[3]/*[@text and @class='android.view.View'])[1]");
	
	
	By monthLocator					= By.xpath("//*[@id='month_view']");
	By dropDownLocator				= By.xpath("//*[@id='cphContent_TipoDocumentoDropDownList']");
	By seleccionarDropDown			= By.xpath("//*[@text='CEDULA DE CIUDADAN�A']");
	By evalueEmpresarialLocator		= By.xpath("//*[@text='Eval�e su proyecto - C�mara de Comercio de Bogot�']");
	By pasosDelModeloLocator		= By.xpath("//*[@text='Pasos del Modelo de Servicios Empresariales']");
	By evalueProyectoLocator		= By.xpath("//*[@text='Eval�e su proyecto' and ./parent::*[./parent::*[@class='android.view.View']]]");
	By creeSuEmpresaLocator			= By.xpath("//*[@text='Cree su empresa']");
	By eventosLocator				= By.xpath("//*[@text='Eventos y capacitaciones']");
	By informacionLocator			= By.xpath("//*[@class='android.view.View' and ./*[@class='android.widget.Image'] and ./*[@text='Informaci�n']]");
	By configuracionLocator     	= By.xpath("//*[@text='Configuraci�n' and ./parent::*[@text='Configuraci�n']]");
	By registrarseLocator			= By.xpath("//*[@text='Registrarse' and ./parent::*[@text='Registrarse']]");

	By ingresarLocator				= By.xpath("//*[@text='Ingresar' and ./parent::*[@text='Ingresar']]");
	By entrar1Locator				= By.xpath("//*[@text='Configuraci�n' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]]");
	By entrar2Locator				= By.xpath("//*[@text and @class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget']]]]]]]]");
	By entrar3Locator				= By.xpath("//*[@text='Entrar']");
	By atrasLocatorButton			= By.xpath("//*[@id='back']");
	By alertasLocator				= By.xpath("//*[@text='Alertas']");
	By perfilLocator				= By.xpath("//*[@text='Perfil']");
	By infoCuentaLocator			= By.xpath("//*[@text='Info de cuenta']");
	By acercaDeLocator				= By.xpath("//*[@text='Acerca de']");
	By comentariosLocator			= By.xpath("//*[@text='Comentarios']");
	By nombresTxtLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Nombres *']]]");
	By apellidosTxtLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Apellidos *']]]");
	By correoTxtLocator				= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Correo Electr�nico *']]]");	
	By claveTxtLocator				= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Clave *']]]");
	By macrosectoresDropdownLocator	= By.xpath("//*[@text='Macrosectores' and ./*[@class='android.view.View']]");
	By construccionSeleccionLocator	= By.xpath("//*[@text='Construcci�n y energia']");
	By saludSeleccionLocator		= By.xpath("//*[@text='Salud y qu�micos']");
	By modaSeleccionLocator			= By.xpath("//*[@text='Moda']");
	By softwareSeleecionLocator		= By.xpath("//*[@text='Software y TI']");
	By turismoSeleccionLocator		= By.xpath("//*[@text='Turismo y gastronom�a']");
	By aceptarBtnLocator			= By.xpath("//*[@text='ACEPTAR']");
	By checkBoxTerminosLocator		= By.xpath("//*[@class='android.widget.Image' and ./parent::*[@class='android.widget.CheckBox']]");
	By registrarseBtnLocator		= By.xpath("//*[@text='Registrarse']");
	By serviciosLocator				= By.xpath("//*[@class='android.view.View' and ./*[@class='android.widget.Image'] and ./*[@text='Servicios']]");
	By usuarioLocator				= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Usuario *']]]");
	By claveLocator					= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Clave *']]]");
	By recordarDatosLocator			= By.xpath("//*[@class='android.widget.Image' and ./parent::*[@text='a Recordar mis datos']]");
	By olvidasteContrase�aLocator	= By.xpath("//*[@text='�Olvidaste tu contrase�a?']");
	By consultaTerminosLocator		= By.xpath("//*[@text='Consulta terminos y condiciones aqui']");
	By tipoDocumentoDropdownlocator	= By.xpath("//*[@text='Tipo de documento *' and ./*[@class='android.view.View']]");
	By numeroDoumentoLocator		= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='N�mero de identificaci�n *']]]");
	By correoElectronico			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Correo electr�nico *']]]");
	By recuperarBtnLocator			= By.xpath("//*[@text='Recuperar Contrase�a']");
	By documentoSeleccionLocator	= By.xpath("//*[@class='android.widget.Button' and ./parent::*[@text='Cedula de Ciudadania']]");
	By contactenosLocator			= By.xpath("//*[@text='Cont�ctenos']");
	By primerNombreLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Primer nombre *']]]");
	By segundoNombreLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Segundo nombre *']]]");
	By primerApeLocator				= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Primer apellido *']]]");
	By segundoApeLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Segundo apellido *']]]");
	By correoEcetronicoLocator		= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Correo electr�nico *']]]");
	By telefonoFijoLocator			= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='T�lefono *']]]");
	By otroTelefono					= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Otro t�lefono']]]");
	By ciudadLocator				= By.xpath("//*[@class='android.widget.EditText' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Ciudad *']]]");
	By checkBoxTerminosCondLocator 	= By.xpath("//*[@class='android.widget.Button' and ./parent::*[@text='He le�do, entiendo y acepto los t�rminos de tratamiento de datos descritos en la secci�n de T�rminos y Condiciones.']]");
	By aquiLocator					= By.xpath("//*[@text='aqu�']");
	By enviarBtnLocator				= By.xpath("//*[@text='Enviar']");
	By closeLocator					= By.xpath("//*[@content-desc='Close Button']");
	
	
	public Menu(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void servicios() throws InterruptedException {
		click(menuLocator);
		click(serviciosLocator);
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Nuestras filiales\"));");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Cree Su empresa\"));");
		click(atrasLocatorButton);
	}
	
	public void informacion() throws InterruptedException {
		click(menuLocator);
		click(informacionLocator);
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Nuestras filiales\"));");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Cree Su empresa\"));");
		click(atrasLocatorButton);
		
	}
	
	public void configuracion() {
		click(menuLocator);
		click(configuracionLocator);
		click(entrar1Locator);
		click(alertasLocator);
		click(perfilLocator);
		click(infoCuentaLocator);
		click(acercaDeLocator);
		click(comentariosLocator);
	}
	
	public void registrarse() {
		click(menuLocator);
		click(registrarseLocator);
		type("Sergio", nombresTxtLocator);
		type("Villalba D�az", apellidosTxtLocator);
		type("sergiovillalba522@gmail.com", correoTxtLocator);
		type("Calle63bissur", claveTxtLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".className(\"android.view.View\")).scrollIntoView("
				+ "new UiSelector().textContains(\"Registrarse\"));");
		click(macrosectoresDropdownLocator);
		click(softwareSeleecionLocator);
		click(aceptarBtnLocator);
		click(checkBoxTerminosLocator);
		click(registrarseBtnLocator);
		//click(entrar2Locator);
		
	}
	
	public void contactenos() {
		click(menuLocator);
		click(contactenosLocator);
		type("Sergio", primerNombreLocator);
		type("Alejandro", segundoNombreLocator);
		type("Villalba", primerApeLocator);
		type("D�az", segundoApeLocator);
		type("sergiovillalba522@gmail.com", correoEcetronicoLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Enviar\"));");
		
		type("4628844", telefonoFijoLocator);
		type("3213746653", otroTelefono);
		type("Bogot�", ciudadLocator);
		
		click(checkBoxTerminosCondLocator);
		click(checkBoxTerminosCondLocator);
		click(aquiLocator);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"Sobre el uso de la marca CCB\"));");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" 
				+ ".className(\"android.view.View\")).scrollIntoView(" 
				+ "new UiSelector().text(\"T�rminos y condiciones\"));");
		
		click(closeLocator);
		click(enviarBtnLocator);
		
	}
	
	public void ingresar() {
		click(menuLocator);
		click(ingresarLocator);
		type("Sergio", usuarioLocator);
		type("2343", claveLocator);
		click(recordarDatosLocator);		
		click(entrar3Locator);
		click(olvidasteContrase�aLocator);
		click(tipoDocumentoDropdownlocator);
		click(documentoSeleccionLocator);
		type("122345345", numeroDoumentoLocator);
		type("sergio@gmail.com", correoElectronico);
		click(recuperarBtnLocator);
		click(menuLocator);
		click(ingresarLocator);
		registrarse();
		
	}
}
	