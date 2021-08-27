package page_object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addition_Object_repo 
{

	WebDriver driver;
	By digit_6=By.xpath("//*[@resource-id='com.google.android.calculator:id/digit_6']");
	By plus_operator=By.xpath("//*[@resource-id='com.google.android.calculator:id/op_add']");
	By equals_operator=By.xpath("//*[@resource-id='com.google.android.calculator:id/eq']");
	By output_result=By.xpath("//*[@resource-id='com.google.android.calculator:id/result_final' and @text='12']");

	public  Addition_Object_repo(WebDriver driver)
	{
		
		if(driver==null)
		{
			System.out.println("driver is null");
		}
		else
		{
			System.out.println("driver is not null");
		}
		
		this.driver=driver;
		
		if(driver==null)
		{
			System.out.println("driver is null");
		}
		else
		{
			System.out.println("driver is not null");
		}
	}
	
	public void click_on_digit_6()
	{
		driver.findElement(digit_6).click();
	}
	
	public void click_on_plus_operator()
	{
		driver.findElement(plus_operator).click();
	}
	
	public void click_on_equals_operator()
	{
		driver.findElement(equals_operator).click();
	}
	
	public String click_on_output_result()
	{
		String str =driver.findElement(output_result).getText();
		return str;
	}


}
