import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojos.AccountPojo;
import rmi_clients.ClientCalculator;
import rmi_clients.ClientAccountManager;

/**
 * Created in project Test_RMI on 26.01.17
 */
public class ClientMain
{
	public static void main(String[] args)
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("clientContext.xml");

		// 1 bean - сложение
		ClientCalculator calc = (ClientCalculator) factory.getBean("addCalc");
		System.out.println(calc
				.getCalculator()
				.calc(new String[]{"30", "60"})
		);

		// 2 bean - умножение
		calc = (ClientCalculator) factory.getBean("multiCalc");
		System.out.println(calc
				.getCalculator()
				.calc(new String[]{"30", "60"})
		);

		// Обработка объекта
		ClientAccountManager accMan = (ClientAccountManager) factory.getBean("accountMan");

		AccountPojo account1 = accMan.getAccountManager().getByName("Batman");
		AccountPojo account2 = accMan.getAccountManager().getByName("Wayne");

		System.out.println(account1);
		System.out.println(account2);
	}
}
