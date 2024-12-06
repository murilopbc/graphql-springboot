package com.murilo.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication {
	// http://localhost:8080/graphiql?path=/graphql
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}


}
