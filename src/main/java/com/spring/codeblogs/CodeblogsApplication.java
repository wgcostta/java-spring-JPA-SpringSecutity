package com.spring.codeblogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.spring.codeblogs.model"})
public class CodeblogsApplication {
	//@EntityScan(basePackages = {"br.com.codeblogs.model"})
	public static void main(String[] args) {
		SpringApplication.run(CodeblogsApplication.class, args);
	}

}
