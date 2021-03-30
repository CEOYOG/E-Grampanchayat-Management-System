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
import com.app.pojos.*;

@RestController
@RequestMapping("/superAdmin")
public class SuperAdminController {

	@Autowired
	private ISuperAdminService adminService;
	
	public SuperAdminController() {
		System.out.println("In constructore of "+getClass().getName());
	}
	
	//============================================================================================================================
	//                               Super Admin
	//============================================================================================================================
				
		//list of all the Super Admin
		@GetMapping("/superAdmin")
		public List<SuperAdmin> getAllSuperAdmin()
		{
			System.out.println("in getAll Super Admin ");
			return adminService.getAllSuperAdmin();
		}
		//get  the Super Admin by id
		@GetMapping("/superAdmin/{aid}")
		public SuperAdmin getSuperAdminById(@PathVariable int aid)
		{
			System.out.println("in get Super Admin by id: "+aid);
			return adminService.getSuperAdminById(aid);
		}
		//add super admin
		@PostMapping("/superAdmin")
		public ResponseEntity<?> addNewSuperAdmin(@RequestBody SuperAdmin superAdmin)
		{
			System.out.println("in add Super Admin"+superAdmin);
			try {
				return new ResponseEntity<>(adminService.addNewSuperAdmin(superAdmin),HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		//update super admin
		@PutMapping("/superAdmin/{supAdminId}")
		public ResponseEntity<?> updateSuperAdmin(@PathVariable int supAdminId,@RequestBody SuperAdmin superAdmin)
		{
			System.out.println("in update Super Admin"+superAdmin);
			try {
				return new ResponseEntity<>(adminService.updateSuperAdmin(supAdminId,superAdmin),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//delete super admin
		@DeleteMapping("/superAdmin/{supAdminId}")
		public ResponseEntity<?> deleteSuperAdmin(@PathVariable int supAdminId)
		{
			System.out.println("in delete Super Admin "+supAdminId);
			try {
				return new ResponseEntity<>(adminService.deleteSuperAdmin(supAdminId),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//============================================================================================================================
		//                               GDO
		//============================================================================================================================
					
		
		
		//list of all the GDO
		@GetMapping("/gdo")
		public List<GDO> getAllGDO()
		{
			System.out.println("in getAll GDO ");
			return adminService.getAllGDO();
		}
		//get  the GDO by id
		@GetMapping("/gdo/{gid}")
		public GDO getGDOById(@PathVariable int gid)
		{
			System.out.println("in get GDO by id: "+gid);
			return adminService.getGDOById(gid);
		}
		//add GDO
		@PostMapping("/gdo")
		public ResponseEntity<?> addNewGDO(@RequestBody GDO gdo)
		{
			System.out.println("in add GDO "+gdo);
			try {
				return new ResponseEntity<>(adminService.addNewGDO(gdo),HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		//update GDO
		@PutMapping("/gdo/{gId}")
		public ResponseEntity<?> updateGDO(@PathVariable int gId,@RequestBody GDO gdo)
		{
			System.out.println("in update GDO "+gdo);
			try {
				return new ResponseEntity<>(adminService.updateGDO(gId,gdo),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		//Activate GDO
		@PutMapping("/gdo/activate/{gId}")
		public ResponseEntity<?> activateGDO(@PathVariable int gId,@RequestBody GDO gdo)
		{
			System.out.println("in Activate GDO "+gdo);
			try {
				return new ResponseEntity<>(adminService.activateGDO(gId,gdo),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//delete GDO
		@DeleteMapping("/gdo/{gId}")
		public ResponseEntity<?> deleteGDO(@PathVariable int gId)
		{
			System.out.println("in delete GDO "+gId);
			try {
				return new ResponseEntity<>(adminService.deleteGDO(gId),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//============================================================================================================================
		//                               Administrator
		//============================================================================================================================
				
	
		//list of all the Administrator
		@GetMapping("/admin")
		public List<Administrator> getAllAdmin()
		{
			System.out.println("in getAll Administrator ");
			return adminService.getAllAdmin();
		}
		//get  the Administrator by id
		@GetMapping("/admin/{aid}")
		public Administrator getAdministratorById(@PathVariable int aid)
		{
			System.out.println("in get Administrator by id: "+aid);
			return adminService.getAdministratorById(aid);
		}
		//add Administrator
		@PostMapping("/admin")
		public ResponseEntity<?> addNewAdministrator(@RequestBody Administrator administrator)
		{
			System.out.println("in add Administrator "+administrator);
			try {
				return new ResponseEntity<>(adminService.addNewAdministrator(administrator),HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		//update Administrator
		@PutMapping("/admin/{aId}")
		public ResponseEntity<?> updateAdministrator(@PathVariable int aId,@RequestBody Administrator administrator)
		{
			System.out.println("in update Administrator "+administrator);
			try {
				return new ResponseEntity<>(adminService.updateAdministrator(aId,administrator),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		//Activate Administrator
		@PutMapping("/admin/activate/{aId}")
		public ResponseEntity<?> activateAdministrator(@PathVariable int aId,@RequestBody Administrator administrator)
		{
			System.out.println("in Activate Administrator "+administrator);
			try {
				return new ResponseEntity<>(adminService.activateAdministrator(aId,administrator),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//delete Administrator
		@DeleteMapping("/admin/{aId}")
		public ResponseEntity<?> deleteAdministrator(@PathVariable int aId)
		{
			System.out.println("in delete Administrator "+aId);
			try {
				return new ResponseEntity<>(adminService.deleteAdministrator(aId),HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		//============================================================================================================================
		//                                  Education
		//============================================================================================================================

		// list of all the Education
		@GetMapping("/education")
		public List<Education> getAllEducation() {
			System.out.println("in getAll Education ");
			return adminService.getAllEducation();
		}

		// get the  Education by id
		@GetMapping("/education/{eid}")
		public Education getEducationById(@PathVariable int eid) {
			System.out.println("in get Education by id: " + eid);
			return adminService.getEducationById(eid);
		}

		// add Education
		@PostMapping("/education")
		public ResponseEntity<?> addNewEducation(@RequestBody Education education) {
			System.out.println("in add Education" + education);
			try {
				return new ResponseEntity<>(adminService.addNewEducation(education), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Education
		@PutMapping("/education/{eduId}")
		public ResponseEntity<?> updateEducation(@PathVariable int eduId, @RequestBody Education education) {
			System.out.println("in update Education" + education);
			try {
				return new ResponseEntity<>(adminService.updateEducation(eduId, education), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Education
		@DeleteMapping("/education/{eduId}")
		public ResponseEntity<?> deleteEducation(@PathVariable int eduId) {
			System.out.println("in delete Education " + eduId);
			try {
				return new ResponseEntity<>(adminService.deleteEducation(eduId), HttpStatus.OK);
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
			return adminService.getAllAssociation();
		}

		// get the  Association by id
		@GetMapping("/association/{eid}")
		public Association getAssociationById(@PathVariable int eid) {
			System.out.println("in get Association by id: " + eid);
			return adminService.getAssociationById(eid);
		}

		// add Association
		@PostMapping("/association")
		public ResponseEntity<?> addNewAssociation(@RequestBody Association association) {
			System.out.println("in add Association" + association);
			try {
				return new ResponseEntity<>(adminService.addNewAssociation(association), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Association
		@PutMapping("/association/{eduId}")
		public ResponseEntity<?> updateAssociation(@PathVariable int eduId, @RequestBody Association association) {
			System.out.println("in update Association" + association);
			try {
				return new ResponseEntity<>(adminService.updateAssociation(eduId, association), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Association
		@DeleteMapping("/association/{assoId}")
		public ResponseEntity<?> deleteAssociation(@PathVariable int assoId) {
			System.out.println("in delete Association " + assoId);
			try {
				return new ResponseEntity<>(adminService.deleteAssociation(assoId), HttpStatus.OK);
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
			return adminService.getAllEvent();
		}
		
		// get the  Event by id
		@GetMapping("/events/{eid}")
		public Event getEventById(@PathVariable int eid) {
			System.out.println("in get Event by id: " + eid);
			return adminService.getEventById(eid);
		}
		
		// add Event
		@PostMapping("/events")
		public ResponseEntity<?> addNewEvent(@RequestBody Event event) {
			System.out.println("in add Event" + event);
			try {
				return new ResponseEntity<>(adminService.addNewEvent(event), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Event
		@PutMapping("/events/{eventId}")
		public ResponseEntity<?> updateEvent(@PathVariable int eventId, @RequestBody Event event) {
			System.out.println("in update Event" + event);
			try {
				return new ResponseEntity<>(adminService.updateEvent(eventId, event), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Event
		@DeleteMapping("/events/{eventId}")
		public ResponseEntity<?> deleteEvent(@PathVariable int eventId) {
			System.out.println("in delete Event " + eventId);
			try {
				return new ResponseEntity<>(adminService.deleteEvent(eventId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		// ============================================================================================================================
		//                        Funds
		// ============================================================================================================================
		
		// list of all the Fund
		@GetMapping("/funds")
		public List<Fund> getAllFund() {
			System.out.println("in getAll Fund ");
			return adminService.getAllFund();
		}
		
		// get the  Fund by id
		@GetMapping("/funds/{fid}")
		public Fund getFundById(@PathVariable int fid) {
			System.out.println("in get Fund by id: " + fid);
			return adminService.getFundById(fid);
		}
		
		// add Fund
		@PostMapping("/funds")
		public ResponseEntity<?> addNewFund(@RequestBody Fund fund) {
			System.out.println("in add Fund" + fund);
			try {
				return new ResponseEntity<>(adminService.addNewFund(fund), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Fund
		@PutMapping("/funds/{fundId}")
		public ResponseEntity<?> updateFund(@PathVariable int fundId, @RequestBody Fund fund) {
			System.out.println("in update Fund" + fund);
			try {
				return new ResponseEntity<>(adminService.updateFund(fundId, fund), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Fund
		@DeleteMapping("/funds/{fundId}")
		public ResponseEntity<?> deleteFund(@PathVariable int fundId) {
			System.out.println("in delete Fund " + fundId);
			try {
				return new ResponseEntity<>(adminService.deleteFund(fundId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		// ============================================================================================================================
		//                        VillagersMaster
		// ============================================================================================================================
		
		// list of all the villagers
		@GetMapping("/villagers")
		public List<VillagersMaster> getAllVillagers() {
			System.out.println("in get Villagers Fund ");
			return adminService.getAllVillagers();
		}
		
		// get the  villagers by id
		@GetMapping("/villagers/{villagerId}")
		public VillagersMaster getVillagersById(@PathVariable int villagerId) {
			System.out.println("in get Villagers by id: " + villagerId);
			return adminService.getVillagersById(villagerId);
		}
		
		// add villagers
		@PostMapping("/villagers")
		public ResponseEntity<?> addNewVillagers(@RequestBody VillagersMaster villager) {
			System.out.println("in add Villager" + villager);
			try {
				return new ResponseEntity<>(adminService.addNewVillagers(villager), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update villagers
		@PutMapping("/villagers/{villagerId}")
		public ResponseEntity<?> updateVillagers(@PathVariable int villagerId, @RequestBody VillagersMaster villager) {
			System.out.println("in update Villager" + villager);
			try {
				return new ResponseEntity<>(adminService.updateVillagers(villagerId, villager), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete villagers
		@DeleteMapping("/villagers/{villagerId}")
		public ResponseEntity<?> deleteVillagers(@PathVariable int villagerId) {
			System.out.println("in delete Villlager " + villagerId);
			try {
				return new ResponseEntity<>(adminService.deleteVillagers(villagerId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}

		// ============================================================================================================================
		// 					Scheme
		// ============================================================================================================================

		// list of all the Scheme
		@GetMapping("/schemes")
		public List<Scheme> getAllScheme() {
			System.out.println("in getAll Scheme ");
			return adminService.getAllScheme();
		}

		// get the Scheme by id
		@GetMapping("/schemes/{sid}")
		public Scheme getSchemeById(@PathVariable int sid) {
			System.out.println("in get Scheme by id: " + sid);
			return adminService.getSchemeById(sid);
		}

		// add Scheme
		@PostMapping("/schemes")
		public ResponseEntity<?> addNewScheme(@RequestBody Scheme scheme) {
			System.out.println("in add Scheme" + scheme);
			try {
				return new ResponseEntity<>(adminService.addNewScheme(scheme), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Scheme
		@PutMapping("/schemes/{schemeId}")
		public ResponseEntity<?> updateScheme(@PathVariable int schemeId, @RequestBody Scheme scheme) {
			System.out.println("in update Scheme" + scheme);
			try {
				return new ResponseEntity<>(adminService.updateScheme(schemeId,  scheme), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Scheme
		@DeleteMapping("/schemes/{schemeId}")
		public ResponseEntity<?> deleteScheme(@PathVariable int schemeId) {
			System.out.println("in delete Scheme " + schemeId);
			try {
				return new ResponseEntity<>(adminService.deleteScheme(schemeId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}
		// ============================================================================================================================
		// 					Document
		// ============================================================================================================================
		
		// list of all the Document
		@GetMapping("/documents")
		public List<Document> getAllDocument() {
			System.out.println("in getAll Document ");
			return adminService.getAllDocument();
		}
		
		// get the Document by id
		@GetMapping("/documents/{docId}")
		public Document getDocumentById(@PathVariable int docId) {
			System.out.println("in get Document by id: " + docId);
			return adminService.getDocumentById(docId);
		}
		
		// add Document
	
		@PostMapping("/documents")
		public ResponseEntity<?> addNewDocument(@RequestBody Document document) {
			System.out.println("in add Document" + document);
			try {
				return new ResponseEntity<>(adminService.addNewDocument(document), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Document
		@PutMapping("/documents/{docId}")
		public ResponseEntity<?> updateDocument(@PathVariable int docId, @RequestBody Document document) {
			System.out.println("in update Document " + document);
			try {
				return new ResponseEntity<>(adminService.updateDocument(docId,  document), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Scheme
		@DeleteMapping("/documents/{docId}")
		public ResponseEntity<?> deleteDocument(@PathVariable int docId) {
			System.out.println("in delete Document " + docId);
			try {
				return new ResponseEntity<>(adminService.deleteDocument(docId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// ============================================================================================================================
		// 						GramPanchayatBody
		// ============================================================================================================================

		// list of all the Members
		@GetMapping("/member")
		public List<GramPanchayatBody> getAllMembers() {
			System.out.println("in getAll Members ");
			return adminService.getAllMembers();
		}

		// get the Members by id
		@GetMapping("/member/{memberId}")
		public GramPanchayatBody getMembersById(@PathVariable int memberId) {
			System.out.println("in get Members by id: " + memberId);
			return adminService.getMembersById(memberId);
		}

		// add Members
		@PostMapping("/member")
		public ResponseEntity<?> addNewMembers(@RequestBody GramPanchayatBody body) {
			System.out.println("in add Members " + body);
			try {
				return new ResponseEntity<>(adminService.addNewMembers(body), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Members
		@PutMapping("/member/{memberId}")
		public ResponseEntity<?> updateMembers(@PathVariable int memberId, @RequestBody GramPanchayatBody body) {
			System.out.println("in update Members " + body);
			try {
				return new ResponseEntity<>(adminService.updateMembers(memberId, body), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// Activate Members
		@PutMapping("/member/activate/{memberId}")
		public ResponseEntity<?> activateMembers(@PathVariable int memberId,
				@RequestBody GramPanchayatBody body) {
			System.out.println("in Activate Members " + body);
			try {
				return new ResponseEntity<>(adminService.activateMembers(memberId, body), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Members
		@DeleteMapping("/member/{memberId}")
		public ResponseEntity<?> deleteMembers(@PathVariable int memberId) {
			System.out.println("in delete Members " + memberId);
			try {
				return new ResponseEntity<>(adminService.deleteMembers(memberId), HttpStatus.OK);
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
			return adminService.getAllUser();
		}
		
		// get the User by id
		@GetMapping("/user/{userId}")
		public User getUserById(@PathVariable int userId) {
			System.out.println("in get User by id: " + userId);
			return adminService.getUserById(userId);
		}
		
		// add User
		@PostMapping("/user")
		public ResponseEntity<?> addNewUser(@RequestBody User user) {
			System.out.println("in add User " + user);
			try {
				return new ResponseEntity<>(adminService.addNewUser(user), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update User
		@PutMapping("/user/{userId}")
		public ResponseEntity<?> updateUser(@PathVariable int userId, @RequestBody User user) {
			System.out.println("in update User " + user);
			try {
				return new ResponseEntity<>(adminService.updateUser(userId, user), HttpStatus.OK);
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
				return new ResponseEntity<>(adminService.activateUser(userId, user), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Members
		@DeleteMapping("/user/{userId}")
		public ResponseEntity<?> deleteUser(@PathVariable int userId) {
			System.out.println("in delete User " + userId);
			try {
				return new ResponseEntity<>(adminService.deleteUser(userId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		// ============================================================================================================================
		// 						Bill
		// ============================================================================================================================
		
		// list of all the Bill
		@GetMapping("/bill")
		public List<Bill> getAllBill() {
			System.out.println("in getAll Bill ");
			return adminService.getAllBill();
		}
		
		// get the Bill by id
		@GetMapping("/bill/{billId}")
		public Bill getBillById(@PathVariable int billId) {
			System.out.println("in get User by id: " + billId);
			return adminService.getBillById(billId);
		}
		
		// add Bill
		@PostMapping("/bill")
		public ResponseEntity<?> addNewBill(@RequestBody Bill bill) {
			System.out.println("in add Bill " + bill);
			try {
				return new ResponseEntity<>(adminService.addNewBill(bill), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Bill
		@PutMapping("/bill/{billId}")
		public ResponseEntity<?> updateBill(@PathVariable int billId, @RequestBody Bill bill) {
			System.out.println("in update Bill " + billId);
			try {
				return new ResponseEntity<>(adminService.updateBill(billId, bill), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
				
		// delete Bill
		@DeleteMapping("/bill/{billId}")
		public ResponseEntity<?> deleteBill(@PathVariable int billId) {
			System.out.println("in delete Bill " + billId);
			try {
				return new ResponseEntity<>(adminService.deleteBill(billId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		// ============================================================================================================================
		// 						Application
		// ============================================================================================================================
		
		// list of all the Application
		@GetMapping("/application")
		public List<Application> getAllApplication() {
			System.out.println("in getAll Application ");
			return adminService.getAllApplication();
		}
		
		// get the Application by id
		@GetMapping("/application/{appId}")
		public Application getApplicationById(@PathVariable int appId) {
			System.out.println("in get Application by id: " + appId);
			return adminService.getApplicationById(appId);
		}
		
		// add Application
		@PostMapping("/application")
		public ResponseEntity<?> addNewApplication(@RequestBody Application application) {
			System.out.println("in add Application " + application);
			try {
				return new ResponseEntity<>(adminService.addNewApplication(application), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Application
		@PutMapping("/application/{appId}")
		public ResponseEntity<?> updateApplication(@PathVariable int appId, @RequestBody Application application) {
			System.out.println("in update Application " + appId);
			try {
				return new ResponseEntity<>(adminService.updateApplication(appId, application), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
		// delete Application
		@DeleteMapping("/application/{appId}")
		public ResponseEntity<?> deleteApplication(@PathVariable int appId) {
			System.out.println("in delete Application " + appId);
			try {
				return new ResponseEntity<>(adminService.deleteApplication(appId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
	
}
