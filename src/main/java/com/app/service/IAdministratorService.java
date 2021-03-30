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

public interface IAdministratorService {

	
	
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
	
	
	//          User

	List<User> getAllUser();

	User getUserById(int userId);

	User addNewUser(User user);

	User updateUser(int userId, User user);

	User activateUser(int userId, User user);

	User deleteUser(int userId);
	

}
