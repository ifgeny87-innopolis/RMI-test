import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ServerMain
{
	public static void main(String[] args)
	{
		new ClassPathXmlApplicationContext("serverContext.xml");

		System.out.println("Start and wait");
	}
}
