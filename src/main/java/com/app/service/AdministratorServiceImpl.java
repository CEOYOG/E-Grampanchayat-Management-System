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
public class AdministratorServiceImpl implements IAdministratorService {


	
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private AssociationRepository associationRepository;
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private UserRepository userRepository;
	

	
	
	
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

	
	
	
	
}
