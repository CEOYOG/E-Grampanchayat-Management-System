package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.ISuperAdminService;
import com.app.service.IUserService;
import com.app.pojos.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	public UserController() {
		System.out.println("In constructore of "+getClass().getName());
	}
	
	
		//============================================================================================================================
		//                               GDO
		//============================================================================================================================
					
		
		
		//list of all the GDO
		@GetMapping("/gdo")
		public List<GDO> getAllGDO()
		{
			System.out.println("in getAll GDO ");
			return userService.getAllGDO();
		}
		//get  the GDO by id
		@GetMapping("/gdo/{gid}")
		public GDO getGDOById(@PathVariable int gid)
		{
			System.out.println("in get GDO by id: "+gid);
			return userService.getGDOById(gid);
		}
		
		//============================================================================================================================
		//                               Administrator
		//============================================================================================================================
				
	
		//list of all the Administrator
		@GetMapping("/admin")
		public List<Administrator> getAllAdmin()
		{
			System.out.println("in getAll Administrator ");
			return userService.getAllAdmin();
		}
		//get  the Administrator by id
		@GetMapping("/admin/{aid}")
		public Administrator getAdministratorById(@PathVariable int aid)
		{
			System.out.println("in get Administrator by id: "+aid);
			return userService.getAdministratorById(aid);
		}
		
		
		// ============================================================================================================================
		//                        Funds
		// ============================================================================================================================
		
		// list of all the Fund
		@GetMapping("/funds")
		public List<Fund> getAllFund() {
			System.out.println("in getAll Fund ");
			return userService.getAllFund();
		}
		
		// get the  Fund by id
		@GetMapping("/funds/{fid}")
		public Fund getFundById(@PathVariable int fid) {
			System.out.println("in get Fund by id: " + fid);
			return userService.getFundById(fid);
		}
		
		
	
		// ============================================================================================================================
		// 						User
		// ============================================================================================================================
		
		
		
		// get the User by id
		@GetMapping("/user/{userId}")
		public User getUserById(@PathVariable int userId) {
			System.out.println("in get User by id: " + userId);
			return userService.getUserById(userId);
		}
		
		// add User
		@PostMapping("/user")
		public ResponseEntity<?> addNewUser(@RequestBody User user) {
			System.out.println("in add User " + user);
			try {
				return new ResponseEntity<>(userService.addNewUser(user), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update User
		@PutMapping("/user/{userId}")
		public ResponseEntity<?> updateUser(@PathVariable int userId, @RequestBody User user) {
			System.out.println("in update User " + user);
			try {
				return new ResponseEntity<>(userService.updateUser(userId, user), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
		// ============================================================================================================================
		// 						Bill
		// ============================================================================================================================
		
		// get the Bill by id
		@GetMapping("/bill/{billId}")
		public Bill getBillById(@PathVariable int billId) {
			System.out.println("in get User by id: " + billId);
			return userService.getBillById(billId);
		}
		
		// add Bill
		@PostMapping("/bill")
		public ResponseEntity<?> addNewBill(@RequestBody Bill bill) {
			System.out.println("in add Bill " + bill);
			try {
				return new ResponseEntity<>(userService.addNewBill(bill), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
	
		
		// ============================================================================================================================
		// 						Application
		// ============================================================================================================================
	
		// get the Application by id
		@GetMapping("/application/{appId}")
		public Application getApplicationById(@PathVariable int appId) {
			System.out.println("in get Application by id: " + appId);
			return userService.getApplicationById(appId);
		}
		
		// add Application
		@PostMapping("/application")
		public ResponseEntity<?> addNewApplication(@RequestBody Application application) {
			System.out.println("in add Application " + application);
			try {
				return new ResponseEntity<>(userService.addNewApplication(application), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		
		
		
		
		
	
}
