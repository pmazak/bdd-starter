package steps;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.Pending;
import static org.junit.Assert.*

public class GroovySteps
{
	@Given("^I am learning Cucumber\$")
	public void learning() {
	}
	
	@When("^I want to see documentation\$")
	public void seeDocumentation() {
	}
	
	@Then("^the site is available\$")
	public void siteAvailable() {
		def pageHtml = new URL("http://cukes.info/").text
		assertTrue(pageHtml.contains("Cucumber"))
	}
}