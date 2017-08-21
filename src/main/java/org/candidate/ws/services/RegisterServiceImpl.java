package org.candidate.ws.services;

import javax.transaction.Transactional;

import org.candidate.ws.dao.IfaceNewRegisteration;
import org.candidate.ws.models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RegisterServiceImpl implements IfaceRegisterService {

	@Autowired
	private IfaceNewRegisteration register;
	
	@Override
	public void Register(Candidate candidate) {
		if(candidate.getCandidateDetail().getIsCandidateHandicapped()==0)
			candidate.setCandidateDisabilityDetail(null);
		register.Register(candidate);
	}

}
