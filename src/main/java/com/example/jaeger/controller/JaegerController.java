package com.example.jaeger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/service")
@Slf4j
public class JaegerController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${spring.application.name}")
	private String applicationName;

	@GetMapping("/path1")
	public ResponseEntity<String> path1() {
		log.info("Incoming request at {} for request /path1 ", applicationName);
		String response = restTemplate.getForObject("http://localhost:9090/service/path2", String.class);
		return ResponseEntity.ok("response from /path1 + " + response);
	}

	@GetMapping("/path2")
	public ResponseEntity<String> path2() {
		log.info("Incoming request at {} at /path2", applicationName);
		return ResponseEntity.ok("response from /path2 ");
	}

}
