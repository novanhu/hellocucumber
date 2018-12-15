package hellocucumber.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pojo.Account;
import pojo.Company;

public class Setup {
	private String share;
	private Account account;
	private Company company;
	
	public Setup(Account account, Company company) {
		this.account = account;
		this.company = company;
	}
	
	@Before
	public void setup() {
		 System.out.println("Encironment Start###########################");
		 share = "Start";
		 System.out.println("Share status: " + share);
		 System.out.println("Init: Account and Company");
		 this.account.setEmail("Init");
		 this.account.setName("Init");
		 this.account.setPhone("Init");
	}
	
	@After
	public void teardown() {
		 System.out.println("Encironment Start###########################");
		 share = "Over";
		 System.out.println("Share status: " + share);
	}
}
