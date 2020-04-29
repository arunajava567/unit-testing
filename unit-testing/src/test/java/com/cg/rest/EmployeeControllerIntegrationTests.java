package com.cg.rest;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.cg.rest.SpringBootDemoApplication;
//import com.cg.rest.model.Employee;
import com.cg.rest.model.Employees;

@SpringBootTest(classes = SpringBootDemoApplication.class,	webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTests 
{
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAllEmployees() 
	{
		assertTrue(
				this.restTemplate
					.getForObject("http://localhost:8090" + "/employees", Employees.class)
					.getEmployeeList().size() == 2);
	}

	/*@Test
	public void testAddEmployee() {
		Employee employee = new Employee("abc", "a", "abc@gmail.com");
		ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("http://localhost:8090" + "/employees", employee, String.class);
		assertEquals(201, responseEntity.getStatusCodeValue());
	}*/
}
