package com.carsguide.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


//path & annotation = write outside of the class codes
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",//content root path from featurefile
        glue = "com/cars-guide",//source root path from au.com.cucumber
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"
        },
        tags = {"@smoke,@sanity,@regression"}
)
public class TestRunner {
    //after class genrate this code
  // @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }

}




//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/java/resources/featurefile",
//        glue = "com/cars-guide",
//        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
//                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"
//        }
//        )
//public class TestRunner {
//
//       @AfterClass
//        public static void setUp() {
//
//                String projectPath = System.getProperty("user.dir");
//                String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
//                Reporter.loadXMLConfig(reportConfigPath);
//                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//                Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//                Reporter.setSystemInfo("Selenium", "3.141.59");
//                Reporter.setSystemInfo("Maven", "3.5.9");
//                Reporter.setSystemInfo("Java Version", "1.8.0_151");
//        }
//}
