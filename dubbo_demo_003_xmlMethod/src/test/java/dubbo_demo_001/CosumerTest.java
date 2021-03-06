package dubbo_demo_001;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.action.UserAction;

public class CosumerTest {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
		UserAction action = application.getBean("userAction", UserAction.class);
		action.sayHello();
	}

}
