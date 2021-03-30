package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.*;
import com.app.exceptions.ActorException;
import com.app.pojos.*;



@Service
@Transactional
public class SuperAdminServiceImpl implements ISuperAdminService {


	@Autowired
	private SuperAdminRepository superAdminRepo;
	@Autowired
	private GDORepository gdoRepository;
	@Autowired
	private AdministratorRepository administratorRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private AssociationRepository associationRepository;
	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private FundRepository fundRepository;
	@Autowired
	private VillagersMasterRepository masterRepository;
	@Autowired
	private SchemeRepository schemeRepository;
	@Autowired
	private GramPanchayatBodyRepository bodyRepository;
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BillRepository billRepository;
	@Autowired
	private ApplicationRepository applicationRepository;

	
	//=================================================================================================================
	//                    Super Admin
	//=================================================================================================================

	@Override
	public List<SuperAdmin> getAllSuperAdmin() {
		return superAdminRepo.findAll();
	}

	@Override
	public SuperAdmin getSuperAdminById(int aid) {
		Optional<SuperAdmin> optCustomer=superAdminRepo.findById(aid);
		SuperAdmin admin=optCustomer.orElseThrow(()->
		new ActorException("Id is invalid .... Super Admin not found"));
		return admin;
	}

	
	@Override
	public SuperAdmin addNewSuperAdmin(SuperAdmin superAdmin) {
		
		return superAdminRepo.save(superAdmin);
	}

	@Override
	public SuperAdmin updateSuperAdmin(int supAdminId, SuperAdmin superAdmin) {
		Optional<SuperAdmin> optAdmin=superAdminRepo.findById(supAdminId);
		SuperAdmin admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Super Admin not found"));
		
		return superAdminRepo.save(superAdmin);
	}

	@Override
	public SuperAdmin deleteSuperAdmin(int supAdminId) {
		Optional<SuperAdmin> optAdmin=superAdminRepo.findById(supAdminId);
		SuperAdmin admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Super Admin not found"));
		superAdminRepo.deleteById(supAdminId);
		return admin;
	}

	
	//=================================================================================================================
	//                   GDO
	//=================================================================================================================

	
	@Override
	public List<GDO> getAllGDO() {
		return gdoRepository.findAll();
	}

	@Override
	public GDO getGDOById(int gid) {
		Optional<GDO> optGdo=gdoRepository.findById(gid);
		GDO gdo=optGdo.orElseThrow(()->
		new ActorException("Id is invalid .... GDO not found"));
		return gdo;
	}

	@Override
	public GDO addNewGDO(GDO gdo) {
		return gdoRepository.save(gdo);
	}

	@Override
	public GDO updateGDO(int gId, GDO gdo) {
		Optional<GDO> optGdo=gdoRepository.findById(gId);
		GDO admin=optGdo.orElseThrow(()->
		new ActorException("Id is invalid .... GDO not found"));
		
		return gdoRepository.save(gdo);
	}

	@Override
	public GDO deleteGDO(int gId) {
		Optional<GDO> optGdo=gdoRepository.findById(gId);
		GDO gdo=optGdo.orElseThrow(()->
		new ActorException("Id is invalid .... GDO not found"));
		gdoRepository.deleteById(gId);
		return gdo;
	}

	@Override
	public GDO activateGDO(int gId, GDO gdo) {
		Optional<GDO> optGdo=gdoRepository.findById(gId);
		GDO admin=optGdo.orElseThrow(()->
		new ActorException("Id is invalid .... GDO not found"));
		
		return gdoRepository.save(gdo);
	}
	
	//=================================================================================================================
	//                   Administrator
	//=================================================================================================================


	@Override
	public List<Administrator> getAllAdmin() {
		return administratorRepository.findAll();
	}

	@Override
	public Administrator getAdministratorById(int aid) {
		Optional<Administrator> optAdmin=administratorRepository.findById(aid);
		Administrator admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Administrator not found"));
		return admin;
	}

	@Override
	public Administrator addNewAdministrator(Administrator administrator) {
		return administratorRepository.save(administrator);
	}

	@Override
	public Administrator updateAdministrator(int aId, Administrator administrator) {
		Optional<Administrator> optAdmin=administratorRepository.findById(aId);
		Administrator admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Administrator not found"));
		
		return administratorRepository.save(administrator);
	}

	@Override
	public Administrator activateAdministrator(int aId, Administrator administrator) {
		Optional<Administrator> optAdmin=administratorRepository.findById(aId);
		Administrator admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Administrator not found"));
		
		return administratorRepository.save(administrator);
	}

	@Override
	public Administrator deleteAdministrator(int aId) {
		Optional<Administrator> optAdmin=administratorRepository.findById(aId);
		Administrator admin=optAdmin.orElseThrow(()->
		new ActorException("Id is invalid .... Administrator not found"));
		administratorRepository.deleteById(aId);
		return admin;
	}
	
	//=================================================================================================================
	//                   Education
	//=================================================================================================================


	@Override
	public List<Education> getAllEducation() {
		return educationRepository.findAll();
	}

	@Override
	public Education getEducationById(int eid) {
		Optional<Education> optEducation=educationRepository.findById(eid);
		Education education=optEducation.orElseThrow(()->
		new ActorException("Id is invalid .... Education not found"));
		return education;
	}

	@Override
	public Education addNewEducation(Education education) {
		return educationRepository.save(education);
	}

	@Override
	public Education updateEducation(int eduId, Education education) {
		Optional<Education> optEducation=educationRepository.findById(eduId);
		Education edu=optEducation.orElseThrow(()->
		new ActorException("Id is invalid .... Education not found"));
		
		return educationRepository.save(education);
	}

	@Override
	public Education deleteEducation(int eduId) {
		Optional<Education> optEducation=educationRepository.findById(eduId);
		Education education=optEducation.orElseThrow(()->
		new ActorException("Id is invalid .... Education not found"));
		educationRepository.deleteById(eduId);
		return education;
	}


	//=================================================================================================================
	//                   Association
	//=================================================================================================================

	
	
	@Override
	public Association getAssociationById(int assoId) {
		Optional<Association> optAssociation=associationRepository.findById(assoId);
		Association association=optAssociation.orElseThrow(()->
		new ActorException("Id is invalid .... Association not found"));
		return association;
	}

	@Override
	public Association addNewAssociation(Association association) {
		return associationRepository.save(association);
	}

	@Override
	public Association updateAssociation(int assoId, Association association) {
		Optional<Association> optAssociation=associationRepository.findById(assoId);
		Association asso=optAssociation.orElseThrow(()->
		new ActorException("Id is invalid .... Association not found"));
		
		return associationRepository.save(association);
	}

	@Override
	public Association deleteAssociation(int assoId) {
		Optional<Association> optAssociation=associationRepository.findById(assoId);
		Association association=optAssociation.orElseThrow(()->
		new ActorException("Id is invalid .... Association not found"));
		associationRepository.deleteById(assoId);
		return association;
	}

	@Override
	public List<Association> getAllAssociation() {
		return associationRepository.findAll();
	}

	
	//=================================================================================================================
	//                   Event
	//=================================================================================================================

	
	@Override
	public List<Event> getAllEvent() {
		return eventRepository.findAll();
	}

	@Override
	public Event getEventById(int eid) {
		Optional<Event> optEvent=eventRepository.findById(eid);
		Event event=optEvent.orElseThrow(()->
		new ActorException("Id is invalid .... Event not found"));
		return event;
	}

	@Override
	public Event addNewEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event updateEvent(int eventId, Event event) {
		Optional<Event> optEvent=eventRepository.findById(eventId);
		Event event2=optEvent.orElseThrow(()->
		new ActorException("Id is invalid .... Event not found"));
		
		return eventRepository.save(event);
	}

	@Override
	public Event deleteEvent(int eventId) {
		Optional<Event> optEvent=eventRepository.findById(eventId);
		Event event=optEvent.orElseThrow(()->
		new ActorException("Id is invalid .... Event not found"));
		eventRepository.deleteById(eventId);
		return event;
	}

	
	//=================================================================================================================
	//                   Fund
	//=================================================================================================================

	@Override
	public List<Fund> getAllFund() {
		return fundRepository.findAll();
	}

	@Override
	public Fund getFundById(int fid) {
		Optional<Fund> optFund=fundRepository.findById(fid);
		Fund fund=optFund.orElseThrow(()->
		new ActorException("Id is invalid .... Fund not found"));
		return fund;
	}

	@Override
	public Fund addNewFund(Fund fund) {
		return fundRepository.save(fund);
	}

	@Override
	public Fund updateFund(int fundId, Fund fund) {
		Optional<Fund> optFund=fundRepository.findById(fundId);
		Fund fund2=optFund.orElseThrow(()->
		new ActorException("Id is invalid .... Fund not found"));
		
		return fundRepository.save(fund);
	}

	@Override
	public Fund deleteFund(int fundId) {
		Optional<Fund> optFund=fundRepository.findById(fundId);
		Fund fund=optFund.orElseThrow(()->
		new ActorException("Id is invalid .... Fund not found"));
		fundRepository.deleteById(fundId);
		return fund;
	}


	//=================================================================================================================
	//                   VillagersMaster
	//=================================================================================================================

	
	@Override
	public List<VillagersMaster> getAllVillagers() {
		return masterRepository.findAll();
	}

	@Override
	public VillagersMaster getVillagersById(int villagerId) {
		Optional<VillagersMaster> optVillagersMaster=masterRepository.findById(villagerId);
		VillagersMaster villagersMaster=optVillagersMaster.orElseThrow(()->
		new ActorException("Id is invalid .... Villager not found"));
		return villagersMaster;
	}

	@Override
	public VillagersMaster addNewVillagers(VillagersMaster villager) {
		return masterRepository.save(villager);
	}

	@Override
	public VillagersMaster updateVillagers(int villagerId, VillagersMaster villager) {
		Optional<VillagersMaster> optVillagersMaster=masterRepository.findById(villagerId);
		VillagersMaster villagersMaster=optVillagersMaster.orElseThrow(()->
		new ActorException("Id is invalid .... Villager not found"));
		
		return masterRepository.save(villager);
	}

	@Override
	public VillagersMaster deleteVillagers(int villagerId) {
		Optional<VillagersMaster> optVillagersMaster=masterRepository.findById(villagerId);
		VillagersMaster villagersMaster=optVillagersMaster.orElseThrow(()->
		new ActorException("Id is invalid .... Villager not found"));
		masterRepository.deleteById(villagerId);
		return villagersMaster;
	}

	
	// =================================================================================================================
	// 						Scheme
	// =================================================================================================================

	@Override
	public List<Scheme> getAllScheme() {
		return schemeRepository.findAll();
	}

	@Override
	public Scheme getSchemeById(int sid) {
		Optional<Scheme> optScheme=schemeRepository.findById(sid);
		Scheme scheme=optScheme.orElseThrow(()->
		new ActorException("Id is invalid .... Scheme not found"));
		return scheme;
	}

	@Override
	public Scheme addNewScheme(Scheme scheme) {
		return schemeRepository.save(scheme);
	}

	@Override
	public Scheme updateScheme(int schemeId, Scheme scheme) {
		Optional<Scheme> optScheme=schemeRepository.findById(schemeId);
		Scheme scheme2=optScheme.orElseThrow(()->
		new ActorException("Id is invalid .... Scheme not found"));
		
		return schemeRepository.save(scheme);
	}

	@Override
	public Scheme deleteScheme(int schemeId) {
		Optional<Scheme> optScheme=schemeRepository.findById(schemeId);
		Scheme scheme=optScheme.orElseThrow(()->
		new ActorException("Id is invalid .... Scheme not found"));
		schemeRepository.deleteById(schemeId);
		return scheme;
	}
	
	// =================================================================================================================
	// 					GramPanchayatBody
	// =================================================================================================================

	@Override
	public List<GramPanchayatBody> getAllMembers() {
		return bodyRepository.findAll();
	}

	@Override
	public GramPanchayatBody getMembersById(int memberId) {
		Optional<GramPanchayatBody> optGramPanchayatBody=bodyRepository.findById(memberId);
		GramPanchayatBody body=optGramPanchayatBody.orElseThrow(()->
		new ActorException("Id is invalid .... Member not found"));
		return body;
	}

	@Override
	public GramPanchayatBody addNewMembers(GramPanchayatBody body) {
		return bodyRepository.save(body);
	}

	@Override
	public GramPanchayatBody updateMembers(int memberId, GramPanchayatBody body) {
		Optional<GramPanchayatBody> optGramPanchayatBody=bodyRepository.findById(memberId);
		GramPanchayatBody body2=optGramPanchayatBody.orElseThrow(()->
		new ActorException("Id is invalid .... Member not found"));
		
		return bodyRepository.save(body);
	}

	@Override
	public GramPanchayatBody activateMembers(int memberId, GramPanchayatBody body) {
		Optional<GramPanchayatBody> optGramPanchayatBody=bodyRepository.findById(memberId);
		GramPanchayatBody body2=optGramPanchayatBody.orElseThrow(()->
		new ActorException("Id is invalid .... Member not found"));
		
		return bodyRepository.save(body);
	}

	@Override
	public GramPanchayatBody deleteMembers(int memberId) {
		Optional<GramPanchayatBody> optGramPanchayatBody=bodyRepository.findById(memberId);
		GramPanchayatBody body=optGramPanchayatBody.orElseThrow(()->
		new ActorException("Id is invalid .... Member not found"));
		bodyRepository.deleteById(memberId);
		return body;
	}

	
	// =================================================================================================================
	// 					Document
	// =================================================================================================================

	@Override
	public List<Document> getAllDocument() {
		return documentRepository.findAll();
	}

	@Override
	public Document getDocumentById(int docId) {
		Optional<Document> optDocument=documentRepository.findById(docId);
		Document document=optDocument.orElseThrow(()->
		new ActorException("Id is invalid .... Document not found"));
		return document;
	}

	@Override
	public Document addNewDocument(Document document) {
		
		return documentRepository.save(document);
	}

	@Override
	public Document updateDocument(int docId, Document document) {
		Optional<Document> optDocument=documentRepository.findById(docId);
		Document document2=optDocument.orElseThrow(()->
		new ActorException("Id is invalid .... Document not found"));
		
		return documentRepository.save(document);
	}

	@Override
	public Document deleteDocument(int docId) {
		Optional<Document> optDocument=documentRepository.findById(docId);
		Document document=optDocument.orElseThrow(()->
		new ActorException("Id is invalid .... Document not found"));
		documentRepository.deleteById(docId);
		return document;
	}

	// =================================================================================================================
	// 					User
	// =================================================================================================================
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int userId) {
		Optional<User> optUser=userRepository.findById(userId);
		User user=optUser.orElseThrow(()->
		new ActorException("Id is invalid .... User not found"));
		return user;
	}

	@Override
	public User addNewUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(int userId, User user) {
		Optional<User> optUser=userRepository.findById(userId);
		User user2=optUser.orElseThrow(()->
		new ActorException("Id is invalid .... User not found"));
		return userRepository.save(user);
	}

	@Override
	public User activateUser(int userId, User user) {
		Optional<User> optUser=userRepository.findById(userId);
		User user2=optUser.orElseThrow(()->
		new ActorException("Id is invalid .... User not found"));
		return userRepository.save(user);
	}

	@Override
	public User deleteUser(int userId) {
		Optional<User> optUser=userRepository.findById(userId);
		User user=optUser.orElseThrow(()->
		new ActorException("Id is invalid .... User not found"));
		userRepository.deleteById(userId);
		return user;
	}

	// =================================================================================================================
	// 						Bill
	// =================================================================================================================

	@Override
	public List<Bill> getAllBill() {
		return billRepository.findAll();
	}

	@Override
	public Bill getBillById(int billId) {
		Optional<Bill> optBill=billRepository.findById(billId);
		Bill bill=optBill.orElseThrow(()->
		new ActorException("Id is invalid .... Bill not found"));
		return bill;
	}

	@Override
	public Bill addNewBill(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public Bill updateBill(int billId, Bill bill) {
		Optional<Bill> optBill=billRepository.findById(billId);
		Bill bill2=optBill.orElseThrow(()->
		new ActorException("Id is invalid .... Bill not found"));
		
		return billRepository.save(bill);
	}

	@Override
	public Bill deleteBill(int billId) {
		Optional<Bill> optBill=billRepository.findById(billId);
		Bill bill=optBill.orElseThrow(()->
		new ActorException("Id is invalid .... Bill not found"));
		billRepository.deleteById(billId);
		return bill;
	}

	// =================================================================================================================
	// 								Application
	// =================================================================================================================
	
	@Override
	public List<Application> getAllApplication() {
		return applicationRepository.findAll();
	}

	@Override
	public Application getApplicationById(int appId) {
		Optional<Application> optApplication=applicationRepository.findById(appId);
		Application application=optApplication.orElseThrow(()->
		new ActorException("Id is invalid .... Application not found"));
		return application;
	}

	@Override
	public Application addNewApplication(Application application) {
		
		return applicationRepository.save(application);
	}

	@Override
	public Application updateApplication(int appId, Application application) {
		Optional<Application> optApplication=applicationRepository.findById(appId);
		Application application2=optApplication.orElseThrow(()->
		new ActorException("Id is invalid .... Application not found"));
		
		return applicationRepository.save(application);
	}

	@Override
	public Application deleteApplication(int appId) {
		Optional<Application> optApplication=applicationRepository.findById(appId);
		Application  application=optApplication.orElseThrow(()->
		new ActorException("Id is invalid .... Application not found"));
		//application.setUser(null);
		applicationRepository.deleteById(appId);
		return application;
	}
	
	
	
	
	
	
	
}
