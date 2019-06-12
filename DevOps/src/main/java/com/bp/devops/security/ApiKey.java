package com.bp.devops.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ApiKey {

	@Value("${devops.apiKey}" )
	private String apiKey;
	
	public boolean validate(String apiKeyRecept) {
		
		if(apiKey.equals(apiKeyRecept))
			 return true;
		else
			return false;
	}
}
