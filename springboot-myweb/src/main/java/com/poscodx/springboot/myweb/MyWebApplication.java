package com.poscodx.springboot.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MyWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}
	
	@Controller
	public class HelloController {
		@ResponseBody
		@GetMapping("/hello1")
		public String hello1() {
			return "Hello World";
		}
		
		@GetMapping("/hello2")
		public String hello2() {
			return "hello2";
		}
		
		@GetMapping("/hello3")
		public String hello3() {
			return "th/hello3";
		}
	}
}