package ar.nic.telemetrydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {

	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/hello")
	Mono<String> getProfile() {
		log.info("test");
		return Mono.just("Hello");
	}
}