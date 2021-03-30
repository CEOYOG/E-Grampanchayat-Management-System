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

import com.app.service.IAdministratorService;
import com.app.service.ISuperAdminService;
import com.app.pojos.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

	@Autowired
	private IAdministratorService administratorService;
	
	public AdministratorController() {
		System.out.println("In constructore of "+getClass().getName());
	}
	

		//============================================================================================================================
		//                                  Education
		//============================================================================================================================

		// list of all the Education
		@GetMapping("/education")
		public List<Education> getAllEducation() {
			System.out.println("in getAll Education ");
			return administratorService.getAllEducation();
		}

		// get the  Education by id
		@GetMapping("/education/{eid}")
		public Education getEducationById(@PathVariable int eid) {
			System.out.println("in get Education by id: " + eid);
			return administratorService.getEducationById(eid);
		}

		// add Education
		@PostMapping("/education")
		public ResponseEntity<?> addNewEducation(@RequestBody Education education) {
			System.out.println("in add Education" + education);
			try {
				return new ResponseEntity<>(administratorService.addNewEducation(education), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Education
		@PutMapping("/education/{eduId}")
		public ResponseEntity<?> updateEducation(@PathVariable int eduId, @RequestBody Education education) {
			System.out.println("in update Education" + education);
			try {
				return new ResponseEntity<>(administratorService.updateEducation(eduId, education), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Education
		@DeleteMapping("/education/{eduId}")
		public ResponseEntity<?> deleteEducation(@PathVariable int eduId) {
			System.out.println("in delete Education " + eduId);
			try {
				return new ResponseEntity<>(administratorService.deleteEducation(eduId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// ============================================================================================================================
		//                        Association
		// ============================================================================================================================
	
		// list of all the Association
		@GetMapping("/association")
		public List<Association> getAllAssociation() {
			System.out.println("in getAll Association ");
			return administratorService.getAllAssociation();
		}

		// get the  Association by id
		@GetMapping("/association/{eid}")
		public Association getAssociationById(@PathVariable int eid) {
			System.out.println("in get Association by id: " + eid);
			return administratorService.getAssociationById(eid);
		}

		// add Association
		@PostMapping("/association")
		public ResponseEntity<?> addNewAssociation(@RequestBody Association association) {
			System.out.println("in add Association" + association);
			try {
				return new ResponseEntity<>(administratorService.addNewAssociation(association), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Association
		@PutMapping("/association/{eduId}")
		public ResponseEntity<?> updateAssociation(@PathVariable int eduId, @RequestBody Association association) {
			System.out.println("in update Association" + association);
			try {
				return new ResponseEntity<>(administratorService.updateAssociation(eduId, association), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Association
		@DeleteMapping("/association/{assoId}")
		public ResponseEntity<?> deleteAssociation(@PathVariable int assoId) {
			System.out.println("in delete Association " + assoId);
			try {
				return new ResponseEntity<>(administratorService.deleteAssociation(assoId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}
		// ============================================================================================================================
		//                        Events
		// ============================================================================================================================
		
		// list of all the Event
		@GetMapping("/events")
		public List<Event> getAllEvent() {
			System.out.println("in getAll Event ");
			return administratorService.getAllEvent();
		}
		
		// get the  Event by id
		@GetMapping("/events/{eid}")
		public Event getEventById(@PathVariable int eid) {
			System.out.println("in get Event by id: " + eid);
			return administratorService.getEventById(eid);
		}
		
		// add Event
		@PostMapping("/events")
		public ResponseEntity<?> addNewEvent(@RequestBody Event event) {
			System.out.println("in add Event" + event);
			try {
				return new ResponseEntity<>(administratorService.addNewEvent(event), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Event
		@PutMapping("/events/{eventId}")
		public ResponseEntity<?> updateEvent(@PathVariable int eventId, @RequestBody Event event) {
			System.out.println("in update Event" + event);
			try {
				return new ResponseEntity<>(administratorService.updateEvent(eventId, event), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Event
		@DeleteMapping("/events/{eventId}")
		public ResponseEntity<?> deleteEvent(@PathVariable int eventId) {
			System.out.println("in delete Event " + eventId);
			try {
				return new ResponseEntity<>(administratorService.deleteEvent(eventId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
	
		// ============================================================================================================================
		// 						User
		// ============================================================================================================================
		
		// list of all the User
		@GetMapping("/user")
		public List<User> getAllUser() {
			System.out.println("in getAll User ");
			return administratorService.getAllUser();
		}
		
		// get the User by id
		@GetMapping("/user/{userId}")
		public User getUserById(@PathVariable int userId) {
			System.out.println("in get User by id: " + userId);
			return administratorService.getUserById(userId);
		}
		
		// add User
		@PostMapping("/user")
		public ResponseEntity<?> addNewUser(@RequestBody User user) {
			System.out.println("in add User " + user);
			try {
				return new ResponseEntity<>(administratorService.addNewUser(user), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update User
		@PutMapping("/user/{userId}")
		public ResponseEntity<?> updateUser(@PathVariable int userId, @RequestBody User user) {
			System.out.println("in update User " + user);
			try {
				return new ResponseEntity<>(administratorService.updateUser(userId, user), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// Activate User
		@PutMapping("/user/activate/{userId}")
		public ResponseEntity<?> activateUser(@PathVariable int userId,
				@RequestBody User user) {
			System.out.println("in Activate Members " + user);
			try {
				return new ResponseEntity<>(administratorService.activateUser(userId, user), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Members
		@DeleteMapping("/user/{userId}")
		public ResponseEntity<?> deleteUser(@PathVariable int userId) {
			System.out.println("in delete User " + userId);
			try {
				return new ResponseEntity<>(administratorService.deleteUser(userId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
	
}
