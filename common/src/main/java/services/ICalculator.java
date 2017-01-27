package services;

import actions.IAction;

/**
 * Created in project Test_RMI on 26.01.17
 */
public interface ICalculator
{
	void setAction(IAction act);

	String calc(String[] args);
}