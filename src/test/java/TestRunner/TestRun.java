package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
				//	features= {".\\FeatureFiles\\Login.feature"},
							features= {".\\FeatureFiles\\Login2.feature"},
					glue="stepDefinitions1",
                 //  dryRun=true,
					publish=true,
                   plugin= {"pretty","html:reports/myreport.html",
                		   "rerun:target/rerun.txt",}
                   
					
                   )
                   
                   
                   
public class TestRun {
}
