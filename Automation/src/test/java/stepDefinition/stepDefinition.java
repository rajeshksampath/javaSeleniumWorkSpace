package stepDefinition;

import java.util.Collections;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	
	@Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
     System.out.println("User on landing page");
    
    }

    @When("^User log in to application by providing \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_log_in_to_application_by_providing_username_and_password(String strArg1, String strArg2) throws Throwable {
      System.out.println("Username and password accepted");
      System.out.println(strArg1);
      System.out.println(strArg2);
    }

    @Then("^User is able to login to home page and its populated correctly$")
    public void user_is_able_to_login_to_home_page_and_its_populated_correctly() throws Throwable {
     System.out.println("User logged in");   
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        System.out.print("cards are dispalyed ");
        System.out.println(arg1);
    }
	
    @When("User sign up with following details")
    public void user_sign_up_with_following_details(DataTable data) {
    	  List<List<String>> obj = data.asLists();
    	 System.out.println(obj.get(0).get(0));
    	 System.out.println(obj.get(0).get(1));
    	 System.out.println(obj.get(0).get(2));
    	 System.out.println(obj.get(0).get(3));
    	 System.out.println(obj.get(0).get(4));
    }
    
        @When("User log in to application with (.+) and (.+)$")
    public void user_log_in_to_application_with_user1_and_password(String Username, String Password) {
        System.out.println(Username);
        System.out.println(Password);
    }

        @Given("Broweser should be available in desktop")
        public void broweser_should_be_available_in_desktop() {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("brower should be available in desktop");
        }
        @When("Click on Browser")
        public void click_on_browser() {
            // Write code here that turns the phrase above into concrete actions
           System.out.println("Browser is clicked");
        }
        @Then("Brower is opened")
        public void brower_is_opened() {
            // Write code here that turns the phrase above into concrete actions
           System.out.println("Browser is opened");
        }







    
  


	
}
