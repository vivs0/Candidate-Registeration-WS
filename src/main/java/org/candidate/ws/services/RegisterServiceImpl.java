package org.candidate.ws.services;

import javax.transaction.Transactional;

import org.candidate.ws.models.Candidate;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RegisterServiceImpl implements IfaceRegisterService {

	@Override
	public int Register(Candidate canidate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
