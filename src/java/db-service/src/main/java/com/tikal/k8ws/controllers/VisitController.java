package com.tikal.k8ws.controllers;

import com.tikal.k8ws.data.Visit;
import com.tikal.k8ws.data.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/") //
public class VisitController {

	@Autowired // This means to get the bean called VisitRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private VisitRepository visitRepository;

	@GetMapping(path="/visit") // Map ONLY GET Requests
	public @ResponseBody
	String recordVisit (@RequestParam String name) {

		Visit v = new Visit();
		v.setName(name);
		visitRepository.save(v);
		return "You are visitor number " + v.getId().toString();
	}

	@GetMapping(path="/visits")
	public @ResponseBody Iterable<Visit> getAllVisits() {
		// This returns a JSON or XML with the users
		return visitRepository.findAll();
	}
}
