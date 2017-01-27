package pojos;

import java.io.Serializable;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class AccountPojo implements Serializable
{
	private final Long id;

	private final String name;

	public AccountPojo(Long id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public Long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return String.format("#%d, %s", id, name);
	}
}
