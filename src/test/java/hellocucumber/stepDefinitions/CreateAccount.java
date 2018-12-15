package hellocucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pojo.Account;
import pojo.Company;

public class CreateAccount {
	
	private Account account;
	private Company company;
	
	public CreateAccount(Account account, Company company) {
		this.account = account;
		this.company = company;
		System.out.println("Account Init value: " + this.account);
	}
	
	@Given("^I want to create a account with name \"([^\"]*)\" phone \"([^\"]*)\" email \"([^\"]*)\"$")
	public void i_want_to_create_a_account_with_name_phone_email(String name, String phone, String email)
			throws Exception {
		 this.account.setName(name);
		 this.account.setPhone(phone);
		 this.account.setEmail(email);
		 System.out.println("Created Account Info: " + account);
	}

	@Then("^verify the account name \"([^\"]*)\" phone \"([^\"]*)\" email \"([^\"]*)\"$")
	public void verify_the_account_name_phone_email(String name, String phone, String email) throws Exception {
		System.out.println("Final Account Info: " + account);
	}
}
