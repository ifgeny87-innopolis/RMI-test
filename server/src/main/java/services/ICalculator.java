package services;

import actions.Action;

/**
 * Created in project Test_RMI on 26.01.17
 */
public interface ICalculator
{
	void setAction(Action act);

	String calc(String[] args);
}