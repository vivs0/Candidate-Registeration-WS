package org.candidate.ws.test.abstractclass;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.candidate.ws.models.Candidate;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("deprecation")
public class AbstractEntityManager extends AbstractTest{
	
	private static final Logger logger = LogManager.getLogger(AbstractEntityManager.class);
	
	private static EntityManagerFactory emf;
	
	@PersistenceContext
	private EntityManager manager;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
}
