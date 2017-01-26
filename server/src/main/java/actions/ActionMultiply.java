package actions;

import actions.Action;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ActionMultiply implements Action
{
	@Override
	public long performAction(long op1, long op2)
	{
		return op1 * op2;
	}

	@Override
	public String getName()
	{
		return " * ";
	}
}