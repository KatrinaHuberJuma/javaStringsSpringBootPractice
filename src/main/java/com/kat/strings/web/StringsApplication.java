package com.kat.strings.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "<h1>Hello my dear friend!</h1><h3>(This is a nice message)</h3>";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "<h1>It's Spring, you should replace your old boot</h1><h3>(Spring rains bring spring boots)</h3>";
	}
	

}
