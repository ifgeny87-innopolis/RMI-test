package actions;

/**
 * Created in project Test_RMI on 26.01.17
 */
public interface Action
{
	long performAction(long op1, long op2);

	String getName();
}
