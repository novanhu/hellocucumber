package pojo;

import lombok.Data;

//only need non parameter constructor since combine cucumber-picocontainer

@Data
public class Account {
	private String name;
	private String phone;
	private String email;
}
