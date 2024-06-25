package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. spring application의 bootstrapping의 역할: Bootstrapping Class
 * 2. 설정 클래스: Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일: Bootstrap
		 * 1. Application Context(= Spring Container) 생성
		 * 2. 만약, Web-Application이면, Web-Application 타입 결정(Spring MVC / Reactive)
		 * 3. Annotation Scanning + Configuration Class를 통해서 Bean 생성/등록/wiring 작업
		 * 4. 만약 Web-Application이고, 타입이 Spring MVC이면,
		 *    - 내장(embedded) 서버(TocatEmbeddedServiceServletContainer) 인스턴스 생성
		 *    - 서버 인스턴스에 Web-Application을 배포
		 *    - 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스를 구현한 Bean을 Application Container에서 찾아서 실행
		 */
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)) {}
		
		// 위 한 줄과 같음 !!
//		ApplicationContext ac = null;
//		
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			
//		} finally {
//			((ConfigurableApplicationContext)ac).close();
//		}
	}
}