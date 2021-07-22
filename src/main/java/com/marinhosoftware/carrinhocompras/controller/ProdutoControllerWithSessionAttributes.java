package com.marinhosoftware.carrinhocompras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.marinhosoftware.carrinhocompras.model.ListaProdutos;
import com.marinhosoftware.carrinhocompras.model.Produto;

@SessionAttributes("produtos")
@Controller
@RequestMapping("/sessionattributes")
public class ProdutoControllerWithSessionAttributes {
	
	@GetMapping("form")
	public String showForm(Model model, @ModelAttribute("produtos") ListaProdutos produtos) {
	    if (!produtos.isEmpty()) {
	        model.addAttribute("produto", produtos.peekLast());
	    } else {
	        model.addAttribute("produto", new Produto());
	    }
	    return "sessionattributes/form";
	}
	
	@PostMapping("adicionar")
	public RedirectView adicionar(@ModelAttribute Produto produto, @ModelAttribute("produtos") ListaProdutos produtos, RedirectAttributes attributes) {
		produtos.add(produto);
		System.out.println("entrou nesse método");
		attributes.addFlashAttribute("produtos", produtos);
		return new RedirectView("/sessionattributes/todos");
	}
	
	@GetMapping("todos")
	public String mostrarNotas(Model model, @ModelAttribute("produtos") ListaProdutos produtos) {
		if (!produtos.isEmpty()) {
			model.addAttribute("produto", produtos.peekLast());
		} else {
			model.addAttribute("produto", new Produto());
		}
		return "sessionattributes/todos";
	}
	
	@ModelAttribute("produtos")
	public ListaProdutos listaProdutos() {
		return new ListaProdutos();
	}	
	
}
