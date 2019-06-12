package com.bp.devops.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bp.devops.dto.Request;
import com.bp.devops.dto.Response;
import com.bp.devops.security.ApiKey;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class DevOpsApiController implements DevOpsApi{


	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	ApiKey apiKeyComponent;

	@org.springframework.beans.factory.annotation.Autowired
	public DevOpsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<Response> message(Request requestBody) {
		String apiKey=request.getHeader("X-Parse-REST-API-Key");
		if(apiKey != null) {
			if(apiKeyComponent.validate(apiKey)) {
				Response response = new Response();
				response.setMessage("Hello "+requestBody.getFrom()+" your message will be send");
				return new ResponseEntity<>(response,HttpStatus.OK);
			}
			else
			{
				Response response = new Response();
				response.setMessage("Api key Invalid!!");
				return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		else
		{
			Response response = new Response();
			response.setMessage("REST Api key need!!");
			return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




}
