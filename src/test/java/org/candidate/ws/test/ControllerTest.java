package org.candidate.ws.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.candidate.ws.controllers.DefaultController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
public class ControllerTest extends TestConfig{
	
	@Mock
	private DefaultController controller;
	
	private MockMvc mvc;
	private static Logger logger = LogManager.getLogger();
	@Before
	public void setup(){
		logger.debug("Logger working");
		MockitoAnnotations.initMocks(this);
		this.mvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	@Test
	public void Test() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/new/registeration"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andDo(MockMvcResultHandlers.print());
		logger.debug("Logger working");
	}
}
