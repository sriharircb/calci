package base_class;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Base 
{
	public  AndroidDriver driver;
	public void base()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("udid", "11171JEC200691"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("adbExecTimeout", 40000);		
		caps.setCapability("locationServicesAuthorized", true);
		caps.setCapability("autoGrantPermissions", "true");	;	
		caps.setCapability("ignoreUnimportantViews", true);
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			// AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new
			// URL("http://127.0.0.1:4723/wd/hub"),caps);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
