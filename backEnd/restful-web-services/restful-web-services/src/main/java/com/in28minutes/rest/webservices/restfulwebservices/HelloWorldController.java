package com.in28minutes.rest.webservices.restfulwebservices;

import java.nio.file.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "localhost:4200")
public class HelloWorldController {

	//Get
	//URI -hello-world
	//method- "Hello-World"'
	
	
	 @GetMapping(path="/hello-world" )
	 public String helloWorld() {
		return "Hello World ..";
	}
	
	 @GetMapping(path="/hello-world-bean" )
	 public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hey this is your first message");
	}

	 
	 @GetMapping(path="/hello-world/path-veriable/{name}" )
	 public HelloWorldBean helloWorldBeanPathVeriable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hey your path veriable is -, %s ", name));
	}

}
