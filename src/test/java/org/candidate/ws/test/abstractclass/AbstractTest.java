package org.candidate.ws.test.abstractclass;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings(value = { "deprecation" })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/applicationContext.xml","classpath:/SpringMVC.xml"})
@TransactionConfiguration(defaultRollback=true, transactionManager="transactionManager")
@Transactional(transactionManager="transactionManager")
public abstract class AbstractTest {

}
