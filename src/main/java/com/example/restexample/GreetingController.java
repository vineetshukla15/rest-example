package com.example.restexample;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	PostalServices postalServices;

	@GetMapping("/greeting")
	public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greetings(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	@RequestMapping(value ="/getPostalDetails", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostalInfo getPostalAddresses(@RequestParam String postalcode, @RequestParam String countryCode) throws IOException {
		return postalServices.findPostalAddress(postalcode, countryCode);
		
	}
}
