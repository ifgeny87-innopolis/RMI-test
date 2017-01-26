package services;

import pojos.AccountPojo;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class Printer implements IPrinter
{
	public String print(AccountPojo pojo) {
		System.out.println("PRINTED: " + pojo.getId() + ", " + pojo.getName());
		return "Hello, " + pojo.getName();
	}
}
