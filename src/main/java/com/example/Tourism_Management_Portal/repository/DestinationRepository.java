package com.example.Tourism_Management_Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Tourism_Management_Portal.model.Destination;


@Repository
public interface DestinationRepository  extends JpaRepository<Destination, Integer> {
	

}
