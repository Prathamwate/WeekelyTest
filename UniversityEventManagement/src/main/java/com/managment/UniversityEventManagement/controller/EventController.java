package com.managment.UniversityEventManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.managment.UniversityEventManagement.model.EventManagement;
import com.managment.UniversityEventManagement.service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {
	
	@Autowired
	private EventService event_serive;
      
    @PostMapping("/AddEvent")
    public void addEvent(EventManagement em) {
    	event_serive.addEvent(em);
    }
	
	@GetMapping("/date/{event_date}")
	public List<EventManagement> allEventByDate(@PathVariable String event_date) {
		return event_serive.allEventByDate(event_date);
	}
	
	@PutMapping("/updateEvent/{eventId}")
	public void updateEvent(@PathVariable int eventId,@RequestBody EventManagement em) {
		event_serive.updateEvent(eventId,em);
	}
	
	@DeleteMapping("/deleteEvent/{eventId}")
	public void deleteEvent(@PathVariable int eventId) {
		event_serive.deleteEvent(eventId);
	}
	
	
	
	
}
