package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	  @GetMapping(value = "/")
	  public String getHome() {
	    return "Home returned";
	  }
	  
	  @GetMapping(value = "/pet")
	  public String getPet() {
	    return "Pet returned";
	  }
}
