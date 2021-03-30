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

public interface IGDOService {

	
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
