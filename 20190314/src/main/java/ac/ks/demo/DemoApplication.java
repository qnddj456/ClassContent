package ac.ks.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// OverRiding :: 상속관계에 놓여있는 반환타입이 동일한 시그니쳐를 재정의하는 것
	@GetMapping("/World")
	public String hello() {
		return "Hello World";
	}
}
