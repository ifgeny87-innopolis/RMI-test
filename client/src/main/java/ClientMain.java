import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmi_clients.ClientCalculator;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientMain
{
	public static void main(String[] args)
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("clientContext.xml");

		ClientCalculator calc = (ClientCalculator) factory.getBean("clientCalculator");

		System.out.print(calc.getCalculator().calc(new String[] {"30", "60"}));
	}
}
