package com.reset.StudentService.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/getallstudents")
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class StudentServiceApplication {
	
	@GetMapping("/student")
	public String getAllStudents() {
		return "All Students";
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
