package com.marinhosoftware.carrinhocompras.model;

import java.util.ArrayDeque;

import org.springframework.web.bind.annotation.ModelAttribute;

public class ListaProdutos extends ArrayDeque<Produto> {
	private static final long serialVersionUID = 1L;
	
	@ModelAttribute("produtos")
	public ListaProdutos listaProdutos() {
		return new ListaProdutos();
	}

}
