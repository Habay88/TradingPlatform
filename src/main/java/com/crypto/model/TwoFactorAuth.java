package com.crypto.model;

import com.crypto.domain.USER_ROLE;
import com.crypto.domain.VerificationType;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TwoFactorAuth {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean isEnabled = false;
	private VerificationType sendTo;
}
