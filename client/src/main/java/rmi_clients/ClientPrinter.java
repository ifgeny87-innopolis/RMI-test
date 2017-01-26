package rmi_clients;

import services.IPrinter;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientPrinter
{
	private IPrinter printer;

	public void setPrinter(IPrinter arg)
	{
		this.printer = arg;
	}

	public IPrinter getPrinter()
	{
		return printer;
	}
}