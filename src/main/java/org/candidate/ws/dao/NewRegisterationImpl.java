package org.candidate.ws.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.candidate.ws.models.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class NewRegisterationImpl implements IfaceNewRegisteration {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void Register(Candidate canidate) {
		manager.persist(canidate);
	}

}
