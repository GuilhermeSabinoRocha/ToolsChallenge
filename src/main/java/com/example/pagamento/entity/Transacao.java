package com.example.pagamento.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Transacao")
public class Transacao {
	
	private String cartao;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "DescricaoId")
	private Descricao descricao;
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "FormaPagamentoId")
	private FormaPagamento formaPagamento;
	
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Descricao getDescricao() {
		return descricao;
	}
	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
	
}
