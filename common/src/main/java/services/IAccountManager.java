package services;

import pojos.AccountPojo;

/**
 * Created in project Test_RMI on 26.01.17
 */
public interface IAccountManager
{
	AccountPojo getByName(String name);
}
