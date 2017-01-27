package services;

import pojos.AccountPojo;

import java.util.Random;

/**
 * Created in project Test_RMI on 27.01.17
 */
public class AccountManager implements IAccountManager
{
	@Override
	public AccountPojo getByName(String name)
	{
		// как-будто у нас только один пользователь в базе
		if (name.equalsIgnoreCase("batman"))
			return new AccountPojo(1001L, name);
		else
			return null;
	}
}
