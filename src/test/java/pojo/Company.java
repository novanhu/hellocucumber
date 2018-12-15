package pojo;

import lombok.Data;

//only need non parameter constructor since combine cucumber-picocontainer

@Data
public class Company {

	private String companyName;
	private String companyAddress;
}
