package com.josenaves.spring.renascence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {
	@Bean
	MessageService helloWorldMessageService() {
		return new HelloWorldMessage();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		MessageService service = context.getBean(MessageService.class);

		System.out.println(service.getMessage());
	}

}