package com.revature.pms.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pms.model.Allergy;
import com.revature.pms.repo.AllergyRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AllergyService {
	
//	private static final Logger log = LogManager.getLogger(AllergyService.class);
	
	@Autowired
	private AllergyRepository allergyRepository;
	
	public List<Allergy> getAllergies() {
		List<Allergy> allergies = allergyRepository.findAll();
//		log.info("");
		return allergies;
	}
	
	public Allergy getAllergy(int id){
		Allergy allergy =  allergyRepository.findById(id).get();
		return allergy;
	}
}
