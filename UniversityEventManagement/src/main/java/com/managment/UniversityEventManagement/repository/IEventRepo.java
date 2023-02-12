package com.managment.UniversityEventManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managment.UniversityEventManagement.model.EventManagement;

@Repository
public interface IEventRepo extends JpaRepository<EventManagement, Integer>{
	
	  //public List<EventManagement> findByEVENT_DATE(String EVENT_DATE);

	public List<EventManagement> findByEventdate(String event_date);
}
