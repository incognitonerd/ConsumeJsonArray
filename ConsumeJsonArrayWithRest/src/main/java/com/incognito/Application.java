package com.incognito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String args[]){
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate r) throws Exception{
		return args->{
			String s = r.getForObject("https://www.ing.nl/api/locator/atms/", String.class);
			ObjectMapper o = new ObjectMapper();
			Atm[] locations = o.readValue(s.substring(5), Atm[].class);
			for(Atm a: locations){
				System.out.println(a.getAddress().getCity() + "\t\t\t\t" + a.getDistance());
			}
		};
	}
}