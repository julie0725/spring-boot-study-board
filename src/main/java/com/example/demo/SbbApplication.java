package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
		try {
			new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://localhost:8080/hello").start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
