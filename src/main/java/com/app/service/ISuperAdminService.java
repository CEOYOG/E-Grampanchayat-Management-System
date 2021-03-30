package com.app.service;

import java.util.List;

import com.app.pojos.Administrator;
import com.app.pojos.Application;
import com.app.pojos.Association;
import com.app.pojos.Bill;
import com.app.pojos.Document;
import com.app.pojos.Education;
import com.app.pojos.Event;
import com.app.pojos.Fund;
import com.app.pojos.GDO;
import com.app.pojos.GramPanchayatBody;
import com.app.pojos.Scheme;
import com.app.pojos.SuperAdmin;
import com.app.pojos.User;
import com.app.pojos.VillagersMaster;

public interface ISuperAdminService {

	//          SuperAdmin
	
	List<SuperAdmin> getAllSuperAdmin();

	SuperAdmin getSuperAdminById(int aid);

	SuperAdmin addNewSuperAdmin(SuperAdmin superAdmin);

	SuperAdmin updateSuperAdmin(int supAdminId, SuperAdmin superAdmin);

	SuperAdmin deleteSuperAdmin(int supAdminId);
	
	//           GDO

	List<GDO> getAllGDO();

	GDO getGDOById(int gid);

	GDO addNewGDO(GDO gdo);

	GDO updateGDO(int gId, GDO gdo);

	GDO deleteGDO(int gId);

	GDO activateGDO(int gId, GDO gdo);
	
	//           Administrator 

	List<Administrator> getAllAdmin();

	Administrator getAdministratorById(int aid);

	Administrator addNewAdministrator(Administrator administrator);

	Administrator updateAdministrator(int aId, Administrator administrator);

	Administrator activateAdministrator(int aId, Administrator administrator);

	Administrator deleteAdministrator(int aId);
	
	//            Education

	List<Education> getAllEducation();

	Education getEducationById(int eid);

	Education addNewEducation(Education education);

	Education updateEducation(int eduId, Education education);

	Education deleteEducation(int eduId);

	//				Association

	Association getAssociationById(int eid);

	Association addNewAssociation(Association association);

	Association updateAssociation(int assoId, Association association);

	Association deleteAssociation(int assoId);

	List<Association> getAllAssociation();
	
	//              Event

	List<Event> getAllEvent();

	Event getEventById(int eid);

	Event addNewEvent(Event event);

	Event updateEvent(int eventId, Event event);

	Event deleteEvent(int eventId);
	
	//                 Fund

	List<Fund> getAllFund();

	Fund getFundById(int fid);

	Fund addNewFund(Fund fund);

	Fund updateFund(int fundId, Fund fund);

	Fund deleteFund(int fundId);
	
	//              VillagersMaster

	List<VillagersMaster> getAllVillagers();

	VillagersMaster getVillagersById(int villagerId);

	VillagersMaster addNewVillagers(VillagersMaster villager);

	VillagersMaster updateVillagers(int villagerId, VillagersMaster villager);

	VillagersMaster deleteVillagers(int villagerId);
	
	//				Scheme

	List<Scheme> getAllScheme();

	Scheme getSchemeById(int sid);

	Scheme addNewScheme(Scheme scheme);

	Scheme updateScheme(int schemeId, Scheme scheme);

	Scheme deleteScheme(int schemeId);
	
	//                  GramPanchayatBody

	List<GramPanchayatBody> getAllMembers();

	GramPanchayatBody getMembersById(int memberId);

	GramPanchayatBody addNewMembers(GramPanchayatBody body);

	GramPanchayatBody updateMembers(int memberId, GramPanchayatBody body);

	GramPanchayatBody activateMembers(int memberId, GramPanchayatBody body);

	GramPanchayatBody deleteMembers(int memberId);
	
	//			Document

	List<Document> getAllDocument();

	Document getDocumentById(int docId);

	Document addNewDocument(Document document);

	Document updateDocument(int docId, Document document);

	Document deleteDocument(int docId);
	
	//          User

	List<User> getAllUser();

	User getUserById(int userId);

	User addNewUser(User user);

	User updateUser(int userId, User user);

	User activateUser(int userId, User user);

	User deleteUser(int userId);
	
	//             Bill

	List<Bill> getAllBill();

	Bill getBillById(int billId);

	Bill addNewBill(Bill bill);

	Bill updateBill(int billId, Bill bill);

	Bill deleteBill(int billId);
	
	//          Application

	List<Application> getAllApplication();

	Application getApplicationById(int appId);

	Application addNewApplication(Application application);

	Application updateApplication(int appId, Application application);

	Application deleteApplication(int appId);

}
