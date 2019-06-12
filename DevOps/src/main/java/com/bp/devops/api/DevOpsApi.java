package com.bp.devops.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bp.devops.dto.Request;
import com.bp.devops.dto.Response;



public interface DevOpsApi {

	@PostMapping(value="/DevOps", consumes="application/json", produces="application/json")
	public ResponseEntity<Response> message(@RequestBody Request request) ;
	
	
}
