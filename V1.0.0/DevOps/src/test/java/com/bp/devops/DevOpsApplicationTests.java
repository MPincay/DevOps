package com.bp.devops;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DevOpsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void contextLoads() {
		try {
			mockMvc.perform(post("/DevOps", 42L).contentType("application/json").content("{\n" + 
					" \"message\" : \"This is a test\",\n" + 
					" \"to\": \"Juan Perez\",\n" + 
					" \"from\": \"Rita Asturia\",\n" + 
					" \"timeToLifeSec\" : 45\n" + 
					"}"));
		}
		catch(Exception e) {

		}
	}
}
