package hellocucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pojo.Account;

public class UpdateAccount {

	private Account account;

	public UpdateAccount(Account account) {
		this.account = account;
	}

	@Given("^I want to update a account with name \"([^\"]*)\" phone \"([^\"]*)\" email \"([^\"]*)\"$")
	public void i_want_to_update_a_account_with_name_phone_email(String name, String phone, String email) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    this.account.setEmail(email);;
	    System.out.println("Updated Account Info: " + account);
	}
	
	@When("^update account with new instance$")
	public void update_account_with_new_instance() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		this.account = new Account();
		System.out.println("Updated Account Info: " + account);
	}
}
