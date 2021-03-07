package com.example.jsonexample.controller;

import com.example.jsonexample.dto.HelloDto;
import com.example.jsonexample.service.HelloService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

	private final HelloService helloService;

	@GetMapping
	public ResponseEntity<HelloDto> getHello()  throws Exception {
		return new ResponseEntity<>(helloService.getHelloDto(), HttpStatus.OK);
	}
}
