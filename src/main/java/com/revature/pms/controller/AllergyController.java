package com.revature.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pms.model.Allergy;
import com.revature.pms.service.AllergyService;

import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
@RequestMapping("/api/v1")
public class AllergyController {
	
//	private static final Logger log = LogManager.getLogger(AllergyService.class);
	
	@Autowired
	private AllergyService allergyService;
	
	@GetMapping("/allergy")
	public ResponseEntity<?> getAll(){
		List<Allergy> allergies = null;
			 allergies= allergyService.getAllergies();
			if(allergies==null || allergies.isEmpty())
				
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			else
//				log.info("AllergyController getAll() response{}",allergies);
		return new ResponseEntity<List<Allergy>>(allergies,HttpStatus.OK);
	}
	
	@GetMapping("/allergy/{id}")
	public  ResponseEntity<?> getAllergy(@PathVariable int id){
		Allergy allergy = allergyService.getAllergy(id);
			if(allergy==null )
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			else
//				log.info("AllergyController getAllergy() response{}",allergy);
				return new ResponseEntity<Allergy>(allergy,HttpStatus.OK);
			
		}
		
	}
	
	
	
	
	
//	@GetMapping("/users")
//	public String getUser() throws UnirestException {
//		HttpResponse<String> response = Unirest.post("https://dev-85rf4haa0cxb2bmc.us.auth0.com/oauth/token")
//				  .header("content-type", "application/json")
//				  .body("{\"client_id\":\"OIEQBpanAwWPrsCe4d3n4ng1yLkMWLMd\",\"client_secret\":\"PPmyV19VwGVuZMsOliyJbCme6riSkowsataqsbret7l2RXysYmCMiRsUymjKUdJR\",\"audience\":\"https://dev-85rf4haa0cxb2bmc.us.auth0.com/api/v2/\",\"grant_type\":\"client_credentials\"}")
//				  .asString();
//		HttpResponse<String> response1= Unirest.post("https://dev-85rf4haa0cxb2bmc.us.auth0.com/api/v2/users")
//				.header("authorization", response.getBody())
//				.asString();
//		
//		return response.getBody();
//	}

