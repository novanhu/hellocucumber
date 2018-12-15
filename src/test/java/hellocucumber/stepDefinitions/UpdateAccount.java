package hellocucumber.stepDefinitions;

import cucumber.api.java.en.Given;
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
}
