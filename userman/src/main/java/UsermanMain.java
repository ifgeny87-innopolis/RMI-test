import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsermanMain
{
	public static void main(String[] args)
	{
		new ClassPathXmlApplicationContext("usermanContext.xml");

		System.out.println("Start and wait");
	}
}
