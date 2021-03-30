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
public class BodyMemberServiceImpl implements IBodyMemberService {


	@Autowired
	private GDORepository gdoRepository;
	@Autowired
	private AdministratorRepository administratorRepository;
	;
	@Autowired
	private FundRepository fundRepository;
	@Autowired
	private VillagersMasterRepository masterRepository;
	
	@Autowired
	private GramPanchayatBodyRepository bodyRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;

	

	
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
	public Application updateApplication(int appId, Application application) {
		Optional<Application> optApplication=applicationRepository.findById(appId);
		Application application2=optApplication.orElseThrow(()->
		new ActorException("Id is invalid .... Application not found"));
		
		return applicationRepository.save(application);
	}

	
	
	
	
	
	
	
}
