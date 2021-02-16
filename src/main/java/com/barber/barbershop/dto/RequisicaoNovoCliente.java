package com.barber.barbershop.dto;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import javax.validation.constraints.Pattern;

import com.barber.barbershop.model.Cliente;

public class RequisicaoNovoCliente {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String profissional;
	
	private String nome;
	
	private String endereco;

	private String bairro;
	
	private String cidade;
	
	private String cep;
	
	@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}$")
	private String DataAgendamento;
	
	private String HoraAgendamento;

	public String getProfissional() {
		return profissional;
	}

	public void setProfissional(String profissional) {
		this.profissional = profissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDataAgendamento() {
		return DataAgendamento;
	}

	public void setDataAgendamento(String dataAgendamento) {
		DataAgendamento = dataAgendamento;
	}

	public String getHoraAgendamento() {
		return HoraAgendamento;
	}

	public void setHoraAgendamento(String horaAgendamento) {
		HoraAgendamento = horaAgendamento;
	}
	
	public Cliente toCliente(){
		Cliente cliente = new Cliente();
		cliente.setProfissional(profissional);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		cliente.setBairro(bairro);
		cliente.setCep(cep);
		cliente.setCidade(cidade);
		cliente.setDataAgendamento(LocalDate.parse(this.DataAgendamento, formatter));
		cliente.setHoraAgendamento(HoraAgendamento);
		return cliente;
	}
}
