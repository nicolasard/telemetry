package ar.nic.telemetrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class TelemetrydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelemetrydemoApplication.class, args);
	}

}
