package com.revature.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ALLERGY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Allergy {
	@Column(name  = "ALLERGY_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int allergyId; 
	
	@Column(name = "ALLERGY_NAME")
	private String allergyName;
	
	@Column(name="ALLERGY_DESCRIPTION")
	private String allergyDescription;

}
