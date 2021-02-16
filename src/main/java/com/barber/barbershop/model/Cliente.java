package com.barber.barbershop.model;



import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String profissional;
	
	private String nome;
	
	private String endereco;

	private String bairro;
	
	private String cidade;
	
	private String cep;
	
	private LocalDate DataAgendamento;
	
	private String HoraAgendamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDate getDataAgendamento() {
		return DataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		DataAgendamento = dataAgendamento;
	}

	public String getHoraAgendamento() {
		return HoraAgendamento;
	}

	public void setHoraAgendamento(String horaAgendamento) {
		HoraAgendamento = horaAgendamento;
	}
	
	
}
