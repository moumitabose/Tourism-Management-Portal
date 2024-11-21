package com.example.Tourism_Management_Portal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Tourism_Management_Portal.service.DestinationService;

@RestController
public class DestinationController {
	
	@Autowired
	private DestinationService destinationService;
	

}
