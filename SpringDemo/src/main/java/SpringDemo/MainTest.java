package SpringDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainTest {

	public static final Logger LOGGER = LoggerFactory.getLogger(MainTest.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MainTest.class, args);
		
		LOGGER.error("Mesage logged at error level");
		LOGGER.warn("Mesage logged at warn level");
		LOGGER.info("Mesage logged at info level");
		LOGGER.debug("Mesage logged at debug level");
	}
	
	@RequestMapping("/")
	public String HelloWorld() {
		return "HelloWorld";
	}

}
