package org.candidate.test;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.candidate.ws.models.Candidate;
import org.candidate.ws.models.CandidateContactDetail;
import org.candidate.ws.models.CandidateDetail;
import org.candidate.ws.models.CandidateDisabilityDetail;
import org.candidate.ws.test.abstractclass.AbstractController;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;

public class SaveCandidateTest extends AbstractController{

	private static final Logger logger = LogManager.getLogger(SaveCandidateTest.class);
	
	@PersistenceContext
	private EntityManager manager;
	
	public String newCandidate() throws JsonProcessingException{
		
		CandidateDetail candidateDetail 
		= new CandidateDetail("not", "SC", "NO", "INDIAN", 1);
		CandidateContactDetail candidateContactDetail 
		= new CandidateContactDetail("245", 34, 4223, 0, 0, 789261, "singhsandhya@gmail.com");
		CandidateDisabilityDetail candidateDisabilityDetail 
		= new CandidateDisabilityDetail(1, "below 40", "abc123", Date.valueOf("1990-08-21"));
		Candidate candidate 
		= new Candidate("Rajiv", "Anup", "Shruti", "up261145", Date.valueOf("1987-01-25"), "MALE");
		candidate.setCandidateContactDetail(candidateContactDetail);
		candidate.setCandidateDisabilityDetail(candidateDisabilityDetail);
		candidate.setCandidateDetail(candidateDetail);
		return mapToJson(candidate);
		
	}
		
	@Test
	public void checkPath() throws Exception{
		
		mvc.perform(MockMvcRequestBuilders.post("/new/registeration")
				.header("Accept", "application/json").content(newCandidate())
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print());
		
	}
	
	@Test
	public void retrieveCandidate() throws JsonProcessingException{
		Candidate candidate = manager.find(Candidate.class, 26);
		logger.debug(mapToJson(candidate));
	}	
	
	@Test
	public void saveCandidate(){
		
	}	
	
}

