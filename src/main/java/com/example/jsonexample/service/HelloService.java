package com.example.jsonexample.service;

import com.example.jsonexample.dto.HelloDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class HelloService {

	private final ObjectMapper objectMapper;

	@Value("classpath:json/hello.json")
	private Resource helloJson;

	public HelloDto getHelloDto() throws IOException {
		return objectMapper.readValue(helloJson.getFile(), HelloDto.class);
	}
}
