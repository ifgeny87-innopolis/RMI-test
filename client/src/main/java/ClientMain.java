import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojos.AccountPojo;
import rmi_clients.ClientCalculator;
import rmi_clients.ClientPrinter;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientMain
{
	public static void main(String[] args)
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("clientContext.xml");

		ClientCalculator calc = (ClientCalculator) factory.getBean("addCalc");
		System.out.println(
				calc
						.getCalculator()
						.calc(new String[]{"30", "60"})
		);

		calc = (ClientCalculator) factory.getBean("multiCalc");
		System.out.println(
				calc
						.getCalculator()
						.calc(new String[]{"30", "60"})
		);

		ClientPrinter printer = (ClientPrinter) factory.getBean("printer");
		System.out.println(
				printer
						.getPrinter()
						.print(new AccountPojo(4321L, "Kitties"))
		);
	}
}
