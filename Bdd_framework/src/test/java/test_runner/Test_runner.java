package test_runner;

import org.junit.Before;
import org.junit.runner.RunWith;

import base_class.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\EclipseWorkspace\\Bdd_framework\\src\\test\\java\\features\\Addition.feature" , glue = {"step_defnation"}
			
			)

	public class Test_runner  extends Base{
		

	}

