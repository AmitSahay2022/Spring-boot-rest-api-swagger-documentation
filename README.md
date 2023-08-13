# Spring-boot-rest-api-swagger-documentation
Project to show how to add swagger api documentation in springboot project
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
<!-- SpringDoc OpenAPI Starter WebMVC UI-->
		<!-- this dependency internally use swagger-->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.1.0</version>
		</dependency>
