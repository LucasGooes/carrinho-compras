package com.marinhosoftware.carrinhocompras.model;

public class Produto {
	
	private Double preco;
	private String descricao;
	
	public Produto() {
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
