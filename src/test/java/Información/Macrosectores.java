package Información;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import Servicios.Base;
import io.appium.java_client.MobileElement;

public class Macrosectores extends Base {
	
	By informacionLocator 				 = By.xpath("//*[@text='Información >']");
	By infoSectoresLocator				 = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*[./*[@class='android.widget.Image']])[2]");
	By agropecuarioLocator				 = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]])[2]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[4]/*[./*[@class='android.widget.Image']])[1]");
	By construccionLocator				 = By.xpath("((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.widget.Image']]] and ./parent::*[@class='android.view.View']]]]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[1]/*[./*[@class='android.widget.Image']])[1]");
	By correoLocator				     = By.id("username");
	By passwordLocator					 = By.id("password");
	By iniciarSesionLocator				 = By.xpath("//*[@text='Iniciar sesión' and @class='android.widget.Button']");
	By industriasLocator				 = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]]])[2]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[4]/*[./*[@class='android.widget.Image']])[2]");
	By modaLocator						 = By.xpath("((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.widget.Image']]] and ./parent::*[@class='android.view.View']]]]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[2]/*[./*[@class='android.widget.Image']])[1]");
	By otrosSectoresLocator	      		 = By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]])[2]/*/*/*/*/*/*[@class='android.widget.Image'])[9]");
	By saludLocator						 = By.xpath("((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.widget.Image']]] and ./parent::*[@class='android.view.View']]]]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[1]/*[./*[@class='android.widget.Image']])[2]");
	By serviciosEmpresarialesLocator	 = By.xpath("((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.widget.Image']]] and ./parent::*[@class='android.view.View']]]]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[3]/*[./*[@class='android.widget.Image']])[2]");
	By softwreLocator					 = By.xpath("((((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]])[2]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[2]/*/*[@class='android.widget.Image'])[2]");
	By turismoLocator		             = By.xpath("((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.widget.Image']]] and ./parent::*[@class='android.view.View']]]]/*/*/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View']]]])[3]/*[./*[@class='android.widget.Image']])[1]");
	
	public Macrosectores(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void ingresar() {
		
	}
	
	public void agropecuario() {
		click(informacionLocator);
		click(infoSectoresLocator);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(flingToEnd(\"1\");");
		click(agropecuarioLocator);
		
	}
	
	public void construccion() {
		click(informacionLocator);
		click(infoSectoresLocator);		
		click(construccionLocator);
	}
	
	public void industrias() throws InterruptedException {
		click(informacionLocator);
		click(infoSectoresLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
	      + ".className(\"android.view.View\")).scrollIntoView("
	        + "new UiSelector().text(\"Industrias creativas y contenidos\"));");
		click(industriasLocator);
	}

	public void moda() {
		click(informacionLocator);
		click(infoSectoresLocator);
		click(modaLocator);		
	}
	
	public void otrosSectores() {
		click(informacionLocator);
		click(infoSectoresLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
	      + ".className(\"android.view.View\")).scrollIntoView("
	        + "new UiSelector().text(\"Otros sectores\"));");
		click(otrosSectoresLocator);
		
	}

	public void salud() {

		click(informacionLocator);
		click(infoSectoresLocator);		
		click(saludLocator);		
	}

	public void serviciosEmpresariales() {
		click(informacionLocator);
		click(infoSectoresLocator);		
		click(serviciosEmpresarialesLocator);
	}

	public void software() {
		click(informacionLocator);
		click(infoSectoresLocator);
		click(softwreLocator);		
	}

	public void turismo() {
		click(informacionLocator);
		click(infoSectoresLocator);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
	      + ".className(\"android.view.View\")).scrollIntoView("
	        + "new UiSelector().text(\"Turismo y gastronomia\"));");
		click(agropecuarioLocator);
	}
}
