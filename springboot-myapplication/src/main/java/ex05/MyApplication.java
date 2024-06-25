package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		// MyComponent myComponent = ac.getBean(MyComponent.class);
		// myComponent.printHello();
		// 위 두 줄은 Hello World Runner가 대체 !!
	}
}