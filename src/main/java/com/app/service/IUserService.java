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

public interface IUserService {

	
	//           GDO

	List<GDO> getAllGDO();

	GDO getGDOById(int gid);

	//           Administrator 

	List<Administrator> getAllAdmin();

	Administrator getAdministratorById(int aid);

	
	
	//                 Fund

	List<Fund> getAllFund();

	Fund getFundById(int fid);

	
	//          User

	User getUserById(int userId);

	User addNewUser(User user);

	User updateUser(int userId, User user);

	
	//             Bill

	
	Bill getBillById(int billId);

	Bill addNewBill(Bill bill);

	//          Application

	Application getApplicationById(int appId);

	Application addNewApplication(Application application);

	
}
