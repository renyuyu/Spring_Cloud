package com.example.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

//		private MockMvc mvc;
//
//	@Before
//	public void setUp() throws Exception{
//		mvc = MockMvcBuilders.standaloneSetup(new HelloApplicationTests()).build();
//	}
//	@Test
//	public void contextLoads() throws Exception{
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Hello World")));
//	}

	@Test
	public void contextLoads() {
	}

}
