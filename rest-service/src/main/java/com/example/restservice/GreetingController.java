package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    

    private static final String template = "Hello, %s!";
	private static final String template2 = "Ta mère la tepu, %s!";

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/nyakniak")
	public Greeting greeting2(@RequestParam(value = "name", defaultValue = "ohaano") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template2, name));
	}

	@GetMapping("/hello-world")  
	public String helloWorld()  
{  
	return "Hello World";  
	} 

	@GetMapping("/nikatu")
	public greetingforcat greeting3(@RequestParam(value = "name", defaultValue = "nikatu") String name) {
		return new greetingforcat(counter.incrementAndGet(), String.format(template2, name));
	}



}
