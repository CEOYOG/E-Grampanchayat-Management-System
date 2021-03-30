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

import com.app.service.IBodyMemberService;
import com.app.service.ISuperAdminService;
import com.app.pojos.*;

@RestController
@RequestMapping("/bodyMember")
public class BodyMemberController {

	@Autowired
	private IBodyMemberService bodyMemberService;
	
	public BodyMemberController() {
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
			return bodyMemberService.getAllGDO();
		}
		//get  the GDO by id
		@GetMapping("/gdo/{gid}")
		public GDO getGDOById(@PathVariable int gid)
		{
			System.out.println("in get GDO by id: "+gid);
			return bodyMemberService.getGDOById(gid);
		}
	
		//============================================================================================================================
		//                               Administrator
		//============================================================================================================================
				
	
		//list of all the Administrator
		@GetMapping("/admin")
		public List<Administrator> getAllAdmin()
		{
			System.out.println("in getAll Administrator ");
			return bodyMemberService.getAllAdmin();
		}
		//get  the Administrator by id
		@GetMapping("/admin/{aid}")
		public Administrator getAdministratorById(@PathVariable int aid)
		{
			System.out.println("in get Administrator by id: "+aid);
			return bodyMemberService.getAdministratorById(aid);
		}
		
		
		
		// ============================================================================================================================
		//                        Funds
		// ============================================================================================================================
		
		// list of all the Fund
		@GetMapping("/funds")
		public List<Fund> getAllFund() {
			System.out.println("in getAll Fund ");
			return bodyMemberService.getAllFund();
		}
		
		// get the  Fund by id
		@GetMapping("/funds/{fid}")
		public Fund getFundById(@PathVariable int fid) {
			System.out.println("in get Fund by id: " + fid);
			return bodyMemberService.getFundById(fid);
		}
		
	
		// ============================================================================================================================
		//                        VillagersMaster
		// ============================================================================================================================
		
		// list of all the villagers
		@GetMapping("/villagers")
		public List<VillagersMaster> getAllVillagers() {
			System.out.println("in get Villagers Fund ");
			return bodyMemberService.getAllVillagers();
		}
		
		// get the  villagers by id
		@GetMapping("/villagers/{villagerId}")
		public VillagersMaster getVillagersById(@PathVariable int villagerId) {
			System.out.println("in get Villagers by id: " + villagerId);
			return bodyMemberService.getVillagersById(villagerId);
		}
		
		
	
		
		
		// ============================================================================================================================
		// 						GramPanchayatBody
		// ============================================================================================================================

		// list of all the Members
		@GetMapping("/member")
		public List<GramPanchayatBody> getAllMembers() {
			System.out.println("in getAll Members ");
			return bodyMemberService.getAllMembers();
		}

		// get the Members by id
		@GetMapping("/member/{memberId}")
		public GramPanchayatBody getMembersById(@PathVariable int memberId) {
			System.out.println("in get Members by id: " + memberId);
			return bodyMemberService.getMembersById(memberId);
		}

	
		// ============================================================================================================================
		// 						User
		// ============================================================================================================================
		
		// list of all the User
		@GetMapping("/user")
		public List<User> getAllUser() {
			System.out.println("in getAll User ");
			return bodyMemberService.getAllUser();
		}
		
		// get the User by id
		@GetMapping("/user/{userId}")
		public User getUserById(@PathVariable int userId) {
			System.out.println("in get User by id: " + userId);
			return bodyMemberService.getUserById(userId);
		}
		
		
	
		// ============================================================================================================================
		// 						Application
		// ============================================================================================================================
		
		// list of all the Application
		@GetMapping("/application")
		public List<Application> getAllApplication() {
			System.out.println("in getAll Application ");
			return bodyMemberService.getAllApplication();
		}
		
		// get the Application by id
		@GetMapping("/application/{appId}")
		public Application getApplicationById(@PathVariable int appId) {
			System.out.println("in get Application by id: " + appId);
			return bodyMemberService.getApplicationById(appId);
		}
		
		
		
		// update Application
		@PutMapping("/application/{appId}")
		public ResponseEntity<?> updateApplication(@PathVariable int appId, @RequestBody Application application) {
			System.out.println("in update Application " + appId);
			try {
				return new ResponseEntity<>(bodyMemberService.updateApplication(appId, application), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
		
		
		
		
	
}
