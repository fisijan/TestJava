package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class TestSteps extends Steps{
	
	@Given("step represents a precondition to an event")
	public void precondition() {
		System.out.println("precondition");
	}
	
	@When("step represents the occurrence of the event")
	public void occurrence() {
		System.out.println("occurrence");
	}
	
	@Then("step represents the outcome of the event")
	public void outcome() {
		System.out.println("outcome");
	}
}
