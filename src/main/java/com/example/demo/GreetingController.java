package com.example.demo;


import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:3000")
@RestController
public class GreetingController {
@Autowired
private EmployeeRepo empRepo;

@Autowired
private InsuranceRepo insRepo;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@RequestMapping("/login")
	public String login(@RequestParam String uid, @RequestParam String pwd) {
		System.out.println("Given data is : User ID : "+uid+" Password : "+pwd);
		String strReturn ="";
		if(uid.equals("Admin")&& pwd.equals("Admin"))
			strReturn ="You are a valid User, Please proceed";
		else
			strReturn ="Invalid user, Please check credentials...";
		return strReturn;
	}
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PutMapping(path="/updateData")
	public ResponseEntity<?> updateData(@RequestBody Employee empObj) {
//		System.out.println("Recieved data in PutMapping is : "+empObj);
		Optional<Employee> empob = empRepo.findById(empObj.getId());
		if(empob.isPresent()) {
			Employee e = empob.get();
			e.setDepartment(empObj.getDepartment());
			e.setDept(empObj.getDept());
			e.setName(empObj.getName());
//			empRepo.save(e);
//			return "Record updated successfully...";
			return new ResponseEntity<>(empRepo.save(e),HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>("Record not present...",HttpStatus.NOT_FOUND);
	}
	@DeleteMapping(path="/deleteRecord/{id}")
	public ResponseEntity<?> deleteRecord(@PathVariable int id) {
//		System.out.println("Employee record to be deleted. Given id is : "+id);
		empRepo.deleteById(id);
		return new ResponseEntity<>("Record deleted successfully..",HttpStatus.NO_CONTENT);
		
	}
	@PostMapping(path="/insertData")
	public String insertData(@RequestBody Employee empObj) {
//		System.out.println("Recieved data in the springboot / rest is : "+empObj);
		empRepo.save(empObj);
		return "Record inserted successfully";
		
	}
	@GetMapping(path="/getEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
	
//		= new Employee(101,"abc","it","full stack developer");
		return new ResponseEntity<List<Employee>>(empRepo.findAll(),HttpStatus.OK);
		
	}
	@GetMapping(path="/getPolicyByNumber/{id}")
	public ResponseEntity<?> getPolicyByNumber(@PathVariable int id) {
//		System.out.println("Employee record to be deleted. Given id is : "+id);
		
		return new ResponseEntity<>(insRepo.findById(id),HttpStatus.NO_CONTENT);
		
	}
	@PutMapping(path="/updatePolicy")
//	public ResponseEntity<?> updatePolicy(@RequestBody Insurance empObj) {
	public String updatePolicy(@RequestBody Insurance empObj) {
//		System.out.println("Recieved data in PutMapping is : "+empObj);
		Optional<Insurance> empob = insRepo.findById(empObj.getPolicy_id());
		if(empob.isPresent()) {
			Insurance e = empob.get();
			e.setAddress(empObj.getAddress());
			e.setLocation(empObj.getLocation());
			e.setNominee(empObj.getNominee());
			e.setPolicyHolders(empObj.getPolicyHolders());
			e.setToBePaid(empObj.getToBePaid());
			e.setTotalAmount(empObj.getTotalAmount());
//			empRepo.save(e);
			return "Record updated successfully...";
//			return new ResponseEntity<>(insRepo.save(e),HttpStatus.CREATED);
		}
//		return new ResponseEntity<>("Record not present...",HttpStatus.NOT_FOUND);
		return "record not present";}
		@DeleteMapping(path="/deletePolicyByNumber/{id}")
		public String deletePolicyByNumber(@PathVariable int id) {
//			System.out.println("Employee record to be deleted. Given id is : "+id);
			insRepo.deleteById(id);
			return "Record deleted successfully..";
//			return new ResponseEntity<>("Record deleted successfully..",HttpStatus.NO_CONTENT);
			
		}
		@PostMapping(path="/addPolicy")
		public String addPolicy(@RequestBody List<Insurance> empObj) {
//			System.out.println("Recieved data in the springboot / rest is : "+empObj);
			insRepo.saveAll(empObj);
			return "Record inserted successfully";
			
		}
		@GetMapping(path="/getAllPolicies")
		public List<Insurance> getAllPolicyes() {
		System.out.println(insRepo.findAll()+"   hii..");
//			= new Employee(101,"abc","it","full stack developer");
			return (insRepo.findAll());
			
		}
}