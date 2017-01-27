package services;

import actions.IAction;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class Calculator implements ICalculator
{
	private IAction action;

	@Override
	public void setAction(IAction act)
	{
		this.action = act;
	}

	@Override
	public String calc(String[] args)
	{
		long op1 = Long.parseLong(args[0]);
		long op2 = Long.parseLong(args[1]);
		return op1 + action.getName() + op2 + " = "
				+ action.performAction(op1, op2);
	}
}
