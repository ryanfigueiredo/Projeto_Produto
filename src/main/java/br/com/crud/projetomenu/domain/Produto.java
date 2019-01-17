package br.com.crud.projetomenu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Produto extends GenericDomain {

	@Column(length = 50, nullable = false)
	private String produto;

	@Column()
	private Double total;

	@Column(nullable = false)
	private Double preco;

	@Column(nullable = false)
	private Byte quantidade;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Byte getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int i) {
		this.quantidade = (byte) i;
	}

	public void setQuantidade(Byte quantidade) {
		this.quantidade = quantidade;
	}

	public Double flagTotal(Double preco, Byte quantidade) {
		total = this.quantidade * this.preco;
		return total;
	}

}
