package app_acceptance_tests;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;

public class MiscSteps {
	
	private ErrorMessageHolder errorMessage;
	
	public MiscSteps(ErrorMessageHolder errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Then("^I get the error message \"([^\"]*)\"$")
	public void iGetTheErrorMessage(String errorMessage) throws Exception {
		assertEquals(errorMessage, this.errorMessage.getErrorMessage());
	}
}