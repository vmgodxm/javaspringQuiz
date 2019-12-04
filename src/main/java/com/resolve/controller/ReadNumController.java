package com.resolve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


import com.resolve.service.ReadNumberService;

@RestController
public class ReadNumController {

	@Autowired
	private ReadNumberService service;
	
	@GetMapping(path= "/requestReadNum/{countNumber}")
	public List<String> readNumStr(@PathVariable String countNumber) throws Exception{
		
		return service.readNumber(countNumber);
	}
}
