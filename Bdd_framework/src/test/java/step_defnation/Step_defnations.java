package step_defnation;

import org.openqa.selenium.By;

import base_class.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object_repository.Addition_Object_repo;


public class Step_defnations extends Base
{
	Addition_Object_repo repo ;
	
	
	@Given("Launch calculator app")
	public void launch_calculator_app() throws Exception {
		base();
		System.out.println("sucessfully launched the calculator");
		
		repo = new  Addition_Object_repo(driver);
		
		Thread.sleep(5000);
	}
	
	
	@When("click on digit {int}")
	public void click_on_digit(Integer int1) {
		repo.click_on_digit_6();
		System.out.println("sucessfully clicked on digit 6 ");
	    
	}
	
	@When("click on + operator")
	public void click_on_operator() throws Exception {
		Thread.sleep(5000);
		repo.click_on_plus_operator();
		 System.out.println("sucessfully clicked on  + ");
	}
	
	@When("click on equals operator")
	public void click_on_equals_operator() throws Exception {
		Thread.sleep(5000);
		repo.click_on_equals_operator();  
		 System.out.println("sucessfully clicked on = ");
	   
	}
	
	@Then("result should display as {int}")
	public void result_should_display_as(Integer int1) throws Exception {
		Thread.sleep(5000);
		String str=repo.click_on_output_result();
		System.out.println("result is showing as "+str);
	    
	}
	

}
