import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ServerMain
{
	public static void main(String[] args)
	{
		new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("Start and wait");
	}
}
