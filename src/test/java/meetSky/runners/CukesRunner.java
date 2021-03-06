package meetSky.runners;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                // "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",// generate report for Jira
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "meetSky/step_definitions",
        dryRun =false,
        tags = "@MESK-333",
        publish = false

)
public class CukesRunner {
}




