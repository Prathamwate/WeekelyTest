package com.managment.UniversityEventManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managment.UniversityEventManagement.model.EventManagement;
import com.managment.UniversityEventManagement.repository.IEventRepo;

@Service
public class EventService {

	@Autowired
	private IEventRepo event_repo;

	public List<EventManagement> allEvent() {
		return  event_repo.findAll();
	}

	public List<EventManagement> allEventByDate(String event_date) {
	
		return event_repo.findByEventdate(event_date);
	}

	public void addEvent(EventManagement em) {
	    event_repo.save(em);
	}

	public void updateEvent(int eventId, EventManagement em) {
		EventManagement event=event_repo.findById(eventId).get();
		event.setEvent_name(em.getEvent_name());
		event.setLocation_of_event(em.getLocation_of_event());
		event.setEventdate(em.getEventdate());
		event.setStart_time(em.getStart_time());
		event.setEnd_time(em.getEnd_time());
		
		event_repo.save(event);
		
	}

	public void deleteEvent(int eventId) {
		event_repo.deleteById(eventId);
		
	}


	
	
	
}
