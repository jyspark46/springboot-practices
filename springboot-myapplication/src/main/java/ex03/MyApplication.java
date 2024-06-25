package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ex03.component.MyComponent;

/**
 * @SpringBootApplication 메타 어노테이션
 * 
 * + @SpringBootConfiguration: ex) ex01, ex02
 * + @ComponentScan: 패키지 ex04를 포함, 하부 패키지 스캔 ex) ex03
 * + @EnableAutoConfiguration:
 * 		1. MVC, Aspect, Security, JPA 등을 자동으로 설정
 * 		2. 발견된 Starter Dependency(Library) 기반으로 설정(관례를 따르는 default 설정)
 * 		3. application.properties or application.yml 안의 미세 설정 (필수 !!!)
 * 		4. Spring Boot의 Auto Configuration이나 미세 설정 이외의 설정은 Java 설정으로...
 */

// @SpringBootConfiguration
// @ComponentScan
@SpringBootApplication // 위 두 줄을 대체 !!
public class MyApplication {
	// @ComponentScan으로 해결 !!!
//	@Bean
//	public MyComponent myComponent() {
//		return new MyComponent();
//	}
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {
			MyComponent myComponent = ac.getBean(MyComponent.class);
			System.out.println(myComponent);
		}
	}
}