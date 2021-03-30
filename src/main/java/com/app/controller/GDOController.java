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

import com.app.service.IGDOService;
import com.app.service.ISuperAdminService;
import com.app.pojos.*;

@RestController
@RequestMapping("/gdo")
public class GDOController {

	@Autowired
	private IGDOService igdoService;
	
	public GDOController() {
		System.out.println("In constructore of "+getClass().getName());
	}
	

		// ============================================================================================================================
		//                        Funds
		// ============================================================================================================================
		
		// list of all the Fund
		@GetMapping("/funds")
		public List<Fund> getAllFund() {
			System.out.println("in getAll Fund ");
			return igdoService.getAllFund();
		}
		
		// get the  Fund by id
		@GetMapping("/funds/{fid}")
		public Fund getFundById(@PathVariable int fid) {
			System.out.println("in get Fund by id: " + fid);
			return igdoService.getFundById(fid);
		}
		
		// add Fund
		@PostMapping("/funds")
		public ResponseEntity<?> addNewFund(@RequestBody Fund fund) {
			System.out.println("in add Fund" + fund);
			try {
				return new ResponseEntity<>(igdoService.addNewFund(fund), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Fund
		@PutMapping("/funds/{fundId}")
		public ResponseEntity<?> updateFund(@PathVariable int fundId, @RequestBody Fund fund) {
			System.out.println("in update Fund" + fund);
			try {
				return new ResponseEntity<>(igdoService.updateFund(fundId, fund), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Fund
		@DeleteMapping("/funds/{fundId}")
		public ResponseEntity<?> deleteFund(@PathVariable int fundId) {
			System.out.println("in delete Fund " + fundId);
			try {
				return new ResponseEntity<>(igdoService.deleteFund(fundId), HttpStatus.OK);
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
			return igdoService.getAllVillagers();
		}
		
		// get the  villagers by id
		@GetMapping("/villagers/{villagerId}")
		public VillagersMaster getVillagersById(@PathVariable int villagerId) {
			System.out.println("in get Villagers by id: " + villagerId);
			return igdoService.getVillagersById(villagerId);
		}
		
		// add villagers
		@PostMapping("/villagers")
		public ResponseEntity<?> addNewVillagers(@RequestBody VillagersMaster villager) {
			System.out.println("in add Villager" + villager);
			try {
				return new ResponseEntity<>(igdoService.addNewVillagers(villager), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update villagers
		@PutMapping("/villagers/{villagerId}")
		public ResponseEntity<?> updateVillagers(@PathVariable int villagerId, @RequestBody VillagersMaster villager) {
			System.out.println("in update Villager" + villager);
			try {
				return new ResponseEntity<>(igdoService.updateVillagers(villagerId, villager), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete villagers
		@DeleteMapping("/villagers/{villagerId}")
		public ResponseEntity<?> deleteVillagers(@PathVariable int villagerId) {
			System.out.println("in delete Villlager " + villagerId);
			try {
				return new ResponseEntity<>(igdoService.deleteVillagers(villagerId), HttpStatus.OK);
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
			return igdoService.getAllScheme();
		}

		// get the Scheme by id
		@GetMapping("/schemes/{sid}")
		public Scheme getSchemeById(@PathVariable int sid) {
			System.out.println("in get Scheme by id: " + sid);
			return igdoService.getSchemeById(sid);
		}

		// add Scheme
		@PostMapping("/schemes")
		public ResponseEntity<?> addNewScheme(@RequestBody Scheme scheme) {
			System.out.println("in add Scheme" + scheme);
			try {
				return new ResponseEntity<>(igdoService.addNewScheme(scheme), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Scheme
		@PutMapping("/schemes/{schemeId}")
		public ResponseEntity<?> updateScheme(@PathVariable int schemeId, @RequestBody Scheme scheme) {
			System.out.println("in update Scheme" + scheme);
			try {
				return new ResponseEntity<>(igdoService.updateScheme(schemeId,  scheme), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Scheme
		@DeleteMapping("/schemes/{schemeId}")
		public ResponseEntity<?> deleteScheme(@PathVariable int schemeId) {
			System.out.println("in delete Scheme " + schemeId);
			try {
				return new ResponseEntity<>(igdoService.deleteScheme(schemeId), HttpStatus.OK);
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
			return igdoService.getAllDocument();
		}
		
		// get the Document by id
		@GetMapping("/documents/{docId}")
		public Document getDocumentById(@PathVariable int docId) {
			System.out.println("in get Document by id: " + docId);
			return igdoService.getDocumentById(docId);
		}
		
		// add Document
	
		@PostMapping("/documents")
		public ResponseEntity<?> addNewDocument(@RequestBody Document document) {
			System.out.println("in add Document" + document);
			try {
				return new ResponseEntity<>(igdoService.addNewDocument(document), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Document
		@PutMapping("/documents/{docId}")
		public ResponseEntity<?> updateDocument(@PathVariable int docId, @RequestBody Document document) {
			System.out.println("in update Document " + document);
			try {
				return new ResponseEntity<>(igdoService.updateDocument(docId,  document), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		// delete Scheme
		@DeleteMapping("/documents/{docId}")
		public ResponseEntity<?> deleteDocument(@PathVariable int docId) {
			System.out.println("in delete Document " + docId);
			try {
				return new ResponseEntity<>(igdoService.deleteDocument(docId), HttpStatus.OK);
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
			return igdoService.getAllMembers();
		}

		// get the Members by id
		@GetMapping("/member/{memberId}")
		public GramPanchayatBody getMembersById(@PathVariable int memberId) {
			System.out.println("in get Members by id: " + memberId);
			return igdoService.getMembersById(memberId);
		}

		// add Members
		@PostMapping("/member")
		public ResponseEntity<?> addNewMembers(@RequestBody GramPanchayatBody body) {
			System.out.println("in add Members " + body);
			try {
				return new ResponseEntity<>(igdoService.addNewMembers(body), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}
		}

		// update Members
		@PutMapping("/member/{memberId}")
		public ResponseEntity<?> updateMembers(@PathVariable int memberId, @RequestBody GramPanchayatBody body) {
			System.out.println("in update Members " + body);
			try {
				return new ResponseEntity<>(igdoService.updateMembers(memberId, body), HttpStatus.OK);
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
				return new ResponseEntity<>(igdoService.activateMembers(memberId, body), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

			}

		}

		// delete Members
		@DeleteMapping("/member/{memberId}")
		public ResponseEntity<?> deleteMembers(@PathVariable int memberId) {
			System.out.println("in delete Members " + memberId);
			try {
				return new ResponseEntity<>(igdoService.deleteMembers(memberId), HttpStatus.OK);
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
			return igdoService.getAllBill();
		}
		
		// get the Bill by id
		@GetMapping("/bill/{billId}")
		public Bill getBillById(@PathVariable int billId) {
			System.out.println("in get User by id: " + billId);
			return igdoService.getBillById(billId);
		}
		
		// add Bill
		@PostMapping("/bill")
		public ResponseEntity<?> addNewBill(@RequestBody Bill bill) {
			System.out.println("in add Bill " + bill);
			try {
				return new ResponseEntity<>(igdoService.addNewBill(bill), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Bill
		@PutMapping("/bill/{billId}")
		public ResponseEntity<?> updateBill(@PathVariable int billId, @RequestBody Bill bill) {
			System.out.println("in update Bill " + billId);
			try {
				return new ResponseEntity<>(igdoService.updateBill(billId, bill), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
				
		// delete Bill
		@DeleteMapping("/bill/{billId}")
		public ResponseEntity<?> deleteBill(@PathVariable int billId) {
			System.out.println("in delete Bill " + billId);
			try {
				return new ResponseEntity<>(igdoService.deleteBill(billId), HttpStatus.OK);
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
			return igdoService.getAllApplication();
		}
		
		// get the Application by id
		@GetMapping("/application/{appId}")
		public Application getApplicationById(@PathVariable int appId) {
			System.out.println("in get Application by id: " + appId);
			return igdoService.getApplicationById(appId);
		}
		
		// add Application
		@PostMapping("/application")
		public ResponseEntity<?> addNewApplication(@RequestBody Application application) {
			System.out.println("in add Application " + application);
			try {
				return new ResponseEntity<>(igdoService.addNewApplication(application), HttpStatus.CREATED);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		
		// update Application
		@PutMapping("/application/{appId}")
		public ResponseEntity<?> updateApplication(@PathVariable int appId, @RequestBody Application application) {
			System.out.println("in update Application " + appId);
			try {
				return new ResponseEntity<>(igdoService.updateApplication(appId, application), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
		// delete Application
		@DeleteMapping("/application/{appId}")
		public ResponseEntity<?> deleteApplication(@PathVariable int appId) {
			System.out.println("in delete Application " + appId);
			try {
				return new ResponseEntity<>(igdoService.deleteApplication(appId), HttpStatus.OK);
			} catch (RuntimeException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
			
		}
		
		
	
}
