package com.gf.guttafertilizers.checking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	// for http://localhost:8080/employees
	@RequestMapping(method = RequestMethod.GET, path = "/employees") // or @GetMapping(path="/employees")
	public List<Employee> getAllEmployees() {
		return testingEmpRecords();
	}

	// for http://localhost:8080/employees/102
	@RequestMapping(method = RequestMethod.GET, path = "/employees/{id}") // or @GetMapping(path="/employees/{id}")
	public Employee getAnEmployeeById(@PathVariable String id) {
		return testingEmpRecords().stream().filter(e -> e.getEmpid().equals(id)).collect(Collectors.toList()).get(0);
	}

	// for http://localhost:8080/createemployee
	@RequestMapping(method = RequestMethod.POST, path = "/createemployee") // or @PostMapping("/createemployee")
	public Employee createNewEmployee(@RequestBody Employee newEmployee) {
		return newEmployee;
	}

	// for http://localhost:8080/updateemployee/104
	@RequestMapping(method = RequestMethod.PUT, path = "/updateemployee/{id}") // or @PutMapping("/updateemployee/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {
		return newEmployee;
	}

	// for http://localhost:8080/deleteemployee/105
	@RequestMapping(method = RequestMethod.DELETE, path = "/deleteemployee/{id}") // or @DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable String id) {
		return "Hello";
	}

	public List<Employee> testingEmpRecords() {
		List<Employee> listofemployees= new ArrayList<Employee>();
		listofemployees.add( new Employee("101", "Raja", "Kolavennu", "9908812345") );
		listofemployees.add( new Employee("102", "Jasti", "Kesarapalli", "9908812346"));
		listofemployees.add( new Employee("103", "Rampudi", "Khammam", "9908812347"));
		listofemployees.add( new Employee("104", "Dasari", "Hyderabad", "9908812348"));
		listofemployees.add( new Employee("105", "Thalluri", "Chagallu", "9908812349"));
		return listofemployees;
	}
}
