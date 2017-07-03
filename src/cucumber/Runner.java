package cucumber;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter"},
					 features = {"src/cucumber"},
					 glue = {"cucumber.steps"},
					 tags = {"~@ignore"}
				)

public class Runner {

@BeforeClass
public static void setup() {
	
	
	String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
	String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
	//the file name will show dateReportTime and it will be stored in the directory as shown below
	String fileName = String.format("C:/seleniumTraining/Delta/report/%s/report_%s.html", dateNow, timeNow);
	
	//initiate the extent report and generate the output in the output/Run<unique timestamp>/report.html file by default
	ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(fileName));
	
//  Loads the extent config xml to customize on the report.
	ExtentCucumberFormatter.loadConfig(new File("src/com/seleniumtests/resources/extent-config.xml"));

// User can add the system information as follows
	ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
	ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
	ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

	// Also you can add system information using a hash map
//	Map systemInfo = new HashMap();
//	systemInfo.put("Cucumber version", "v1.2.3");
//	systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");
//	ExtentCucumberFormatter.addSystemInfo(systemInfo);
}

}