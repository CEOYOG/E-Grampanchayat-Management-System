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
public class UserServiceImpl implements IUserService {


	
	@Autowired
	private GDORepository gdoRepository;
	@Autowired
	private AdministratorRepository administratorRepository;
	
	@Autowired
	private FundRepository fundRepository;
	
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BillRepository billRepository;
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

	
	// =================================================================================================================
	// 					User
	// =================================================================================================================
	
	
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

	

	// =================================================================================================================
	// 						Bill
	// =================================================================================================================

	
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


	// =================================================================================================================
	// 								Application
	// =================================================================================================================
	

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

	
}
