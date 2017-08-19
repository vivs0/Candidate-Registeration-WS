package org.candidate.ws.dao;

import javax.transaction.Transactional;

import org.candidate.ws.models.Candidate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class NewRegisterationImpl implements IfaceNewRegisteration {

	@Override
	public int Register(Candidate canidate) {
		return 0;
	}

}
