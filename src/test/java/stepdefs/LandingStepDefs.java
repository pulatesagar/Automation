package stepdefs;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import context.TestBase;
import context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.manager.driver.factory.DriverFactory;
import utils.manager.driver.factory.DriverManager;

public class LandingStepDefs extends TestBase {
	TestContextUI testContextUI;
	Scenario scn;

	public LandingStepDefs(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}
	
	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}

	
	@After
	public void CleanUp(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot scrnShot = (TakesScreenshot)testContextUI.getDriver();
			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
			scn.embed(data, "image/png");
		}
		
		testContextUI.getDriver().quit();
		scn.write("Browser is Closed");
	}
	
	
	
@Given("browser is open")
public void browser_is_open() throws Exception {
	/* Various ways of invoking Web Driver*/
	/* Mehtod - 1*/
	DriverManager driverManager = DriverFactory.getDriverManager("chrome");
	WebDriver driver = driverManager.getDriver();
	driverManager.maximizeBrowser();
	driverManager.navigateToDriver(server_ui);
	
	/* OR Mehtod - 2*/
	/*
	 *WebDriver driver = new ChromeDriver();
	 *driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
	 *driver.manage().window().maximize();
	 *driver.get(serverUI);
	*/
	

	/* OR Mehtod - 3*/
	/*
	 WebDriver driver = WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();
	*/
	
	/* OR Mehtod - 4*/
	/*
	WebDriver driver = WebDriverManagerSimple.getDriver("chrome");
	*/
	scn.write("Chrome Driver invoked and URL navigated as: " + server_ui);
	//Assign driver and set page Objects to Test Context 
	testContextUI.setDriver(driver);
	testContextUI.initializePageObjectClasses(driver, scn);
}


@When("landing page displayed and login link should be available on page.")
public void landing_page_displayed_and_login_link_should_be_available_on_page() {
    
	testContextUI.landingPageObjects().clickLoginLinks();
}



}
