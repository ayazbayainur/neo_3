package Week3.example.neo_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Neo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Neo3Application.class, args);
	}

//	@GetMapping
//	public List<Customer> hello(){
//		return List.of(
//				new Customer(
//						1L,
//						"First name",
//						"Second name",
//						"firstname.secondname@gmail.com",
//						"+7 777 645 34 21"
//						)
//		);
//	}

}
