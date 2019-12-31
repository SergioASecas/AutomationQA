package Servicios;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;

public class asesor�aVirtual extends Base {

	By serviciosLocator     = By.xpath("//*[@text='Servicios >']");
	By asesor�aVirtualLocator	= By.xpath("(((//*[@class='android.view.View' and ./parent::*[@class='android.view.View' and ./parent::*[@class='android.view.View' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.TabWidget'] and ./parent::*[@class='android.view.View']]]]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[3]/*/*[@class='android.view.View' and ./parent::*[@class='android.view.View']])[2]/*[./*[@class='android.widget.Image']])[5]");
	
	public asesor�aVirtual(EnhancedAndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void asesoriaVirtual() {
		click(serviciosLocator);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\")).scrollIntoView(new UiSelector().text(\"Asesor�a\"));");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\")).scrollToEnd(1);");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.View\")).enabled(true).instance(4);");
		click(asesor�aVirtualLocator);
	}
	
	

}
