package com.mini.Lulu02_MS1_Sports.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mini.Lulu02_MS1_Sports.entity.Sports;
import com.mini.Lulu02_MS1_Sports.repository.SportsRepo;

@RestController
public class SportsController {
	
	@Autowired
	SportsRepo sportsrepo;
	
	@GetMapping("sps/getSports")
	public List<Sports> getShipping() {

		return sportsrepo.findAll(); // select * from <TableName>;

	}
	
	@PostMapping("sps/addSports")
	public Sports createuser(@RequestBody Sports sport) {
		return sportsrepo.save(sport);
	}
	
	@PutMapping("sps/updateSports/{id}")
	public ResponseEntity<Object> updateSprts(@RequestBody Sports sport, @PathVariable long id) {
		
		Optional<Sports> sportsOptional = sportsrepo.findById((int) id);
		if (sportsOptional.isEmpty())	
		return ResponseEntity.notFound().build();	
		sport.setId(id);	
		sportsrepo.save(sport);
		return ResponseEntity.noContent().build();

	}

 
	
	@DeleteMapping("sps/deleteSports/{id}")
	public void deleteShipping(@PathVariable("id") Integer id  ) {
		sportsrepo.deleteById(id);
		
	}



}
