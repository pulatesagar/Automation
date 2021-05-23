package stepdefs;

import context.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs extends TestBase {
	

@Given("user on login page")
public void user_on_login_page() {

}


@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password(String username, String password) {

}

@When("user clicks on login button")
public void user_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user should be redirected to dashboard")
public void user_should_be_redirected_to_dashboard() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}


}
