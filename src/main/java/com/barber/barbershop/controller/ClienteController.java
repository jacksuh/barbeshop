package com.barber.barbershop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barber.barbershop.dto.RequisicaoNovoCliente;
import com.barber.barbershop.model.Cliente;
import com.barber.barbershop.repository.ClienteRepository;

@Controller
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public String agendado(Model model) {
		List<Cliente> cliente = clienteRepository.findAll();
		model.addAttribute("clientes", cliente);
		return "cliente/agendado";
	}
	
	
	@GetMapping("formulario")
	public String formulario(){
		return "cliente/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoCliente  requisicao){
		Cliente cliente = requisicao.toCliente();
		clienteRepository.save(cliente);
		return "redirect:/cliente";
	}
	
	
	@GetMapping("/delete/{id}")
	public String excluir(@PathVariable("id") long id, Model model){
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Id Invalido" + id));
		clienteRepository.delete(cliente);
		return "redirect:/cliente";
	}
	
	@GetMapping("/edit/{id}")
	public String update(@PathVariable("id") long id, Model model){
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Id Invalido" + id));
		model.addAttribute("clientes", cliente);
		return "cliente/update";
	}
	
	@PostMapping("/update/{id}")
	public String updateCliente(@PathVariable("id") long id, @Valid Cliente 
			cliente, BindingResult result, Model model){
		if(result.hasErrors()){
			cliente.setId(id);
			return "cliente/update";
		}
		
		clienteRepository.save(cliente);
		return "redirect:/cliente";
		
	}
}
