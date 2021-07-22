package com.marinhosoftware.carrinhocompras.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.thymeleaf.util.StringUtils;

import com.marinhosoftware.carrinhocompras.config.TesteConfig;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@Import(TesteConfig.class)
public class ProdutosControllerComSessaoTeste {
	/*
	@Test
	public void whenSubmit_thenSubsequentFormRequestContainsMostRecentTodo() throws Exception {
		
		mockMvc.perform(post("/sessionattributes/form")
	      .param("description", "newtodo"))
	      .andExpect(status().is3xxRedirection())
	      .andReturn();

	    MvcResult result = mockMvc.perform(get("/scopedproxy/form"))
	      .andExpect(status().isOk())
	      .andExpect(model().attributeExists("todo"))
	      .andReturn();
	    TodoItem item = (TodoItem) result.getModelAndView().getModel().get("todo");
	 
	    assertEquals("newtodo", item.getDescription());
	}
	
	   @Test
	    public void whenFirstRequest_thenContainsUnintializedTodo() throws Exception {
	        MvcResult result = mockMvc.perform(get("/scopedproxy/form"))
	          .andExpect(status().isOk())
	          .andExpect(model().attributeExists("todo"))
	          .andReturn();

	        TodoItem item = (TodoItem) result.getModelAndView().getModel().get("todo");
	 
	        assertTrue(StringUtils.isEmpty(item.getDescription()));
	    }
	
	public void  whenToExists_thenSubsequentFormRequestContainsesMos() {
		
	}
	*/
	
}
