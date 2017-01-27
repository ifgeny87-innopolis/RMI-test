package actions;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ActionAdd implements IAction
{
	@Override
	public long performAction(long op1, long op2)
	{
		return op1 + op2;
	}

	@Override
	public String getName()
	{
		return " + ";
	}
}