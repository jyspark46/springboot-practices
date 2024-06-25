package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Spring Boot Test Integration
 * 
 * Error:
 * 	 Spring Boot Test Integration(@SpringBootTest)
 * @Configuration을 달고 있는 설정 클래스를 스캔하지 못함
 */

@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}