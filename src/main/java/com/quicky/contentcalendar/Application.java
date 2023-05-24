package com.quicky.contentcalendar;

import com.quicky.contentcalendar.config.ContentCalendarProperties;
import com.quicky.contentcalendar.model.Content;
import com.quicky.contentcalendar.model.Status;
import com.quicky.contentcalendar.model.Type;
import com.quicky.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);


	}
//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository){
//		return abc -> {
//			Content content = new Content(null,
//					"hello it's me",
//					"without me i am you",
//					Status.IDEA,
//					Type.ARTICLE,
//					LocalDateTime.now(),
//					null,
//					"");
//			repository.save(content);
//		};
//	}
}
