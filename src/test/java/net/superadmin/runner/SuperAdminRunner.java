package net.superadmin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		 features = "C:\\Users\\vishn\\git\\IETMSuperadmin\\src\\test\\java\\net\\superadmin\\features\\EditIETM.feature",
		 glue = "net.ei.superadmin.stepdefinitions",
		 dryRun = false,
		 monochrome = true,
		 publish = true,
		 plugin = {"pretty","html:target/IETMReports/IETM.html","junit:target/IETMReports/IETM.json","junit:target/IETMReports/IETM.xml"}
		
		
		
		
		
		
		
		
		
		
		
		
		
		)































public class SuperAdminRunner {

}
