package com.example.Tourism_Management_Portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tourism_Management_Portal.repository.DestinationRepository;

@Service
public class DestinationServiceImpl implements DestinationService {
	
	@Autowired
	private DestinationRepository destinationRepository;

}
