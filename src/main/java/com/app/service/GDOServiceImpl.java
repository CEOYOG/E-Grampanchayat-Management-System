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
public class GDOServiceImpl implements IGDOService {


	
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
	private BillRepository billRepository;
	@Autowired
	private ApplicationRepository applicationRepository;

	
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
