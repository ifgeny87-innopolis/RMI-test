package rmi_clients;

import services.IAccountManager;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientAccountManager
{
	private IAccountManager accountManager;

	public void setAccountManager(IAccountManager arg)
	{
		this.accountManager = arg;
	}

	public IAccountManager getAccountManager()
	{
		return accountManager;
	}
}