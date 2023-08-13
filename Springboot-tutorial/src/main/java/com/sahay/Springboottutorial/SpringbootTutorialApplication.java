package com.sahay.Springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
		info = @Info(
				  title = "Springboot REST API Documentation",
				  description = "Springboot REST API Documentation",
				  version = "v1.0",
				  contact = @Contact(
						     name = "Amit Kumar",
						     email = "Sahay.mtech2013@gmail.com",
						     url="https://www.amit.com"
						  ),
				  license = @License(
						      name="Apache 2.0",
						      url="https://www.amitkumar.com/licence"
						  )
				),
		  externalDocs = @ExternalDocumentation(
				    description = "Spring Boot Swagger learning Documentation",
				    url="amit.com"
				  )
		)



@SpringBootApplication
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
	}

}



/***
 * (1) to add the swagger api documentation add the dependencies
 * (2) now we can get all the APIs from "http://localhost:8080/swagger-ui/index.html"
 *       
 *       //Not mandatory but we should write it to provide more info about
 *       // developer and how api is working. means what is input
 *       //and what is output etc.
 * (3)now we can write some more information about our exposed apis
 * 
 * 
 */

