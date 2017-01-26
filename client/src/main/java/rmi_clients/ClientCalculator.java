package rmi_clients;

import services.ICalculator;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientCalculator
{
	private ICalculator calculator;

	public void setCalculator(ICalculator calculator)
	{
		this.calculator = calculator;
	}

	public ICalculator getCalculator()
	{
		return calculator;
	}
}