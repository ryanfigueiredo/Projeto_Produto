package br.com.crud.projetomenu.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.crud.projetomenu.domain.Produto;

public class ProdutoDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Produto produto = new Produto();

		produto.setProduto("Galaxy note 8");
		produto.setPreco(3000.00);
		produto.setQuantidade(2);
		produto.flagTotal(produto.getPreco(), produto.getQuantidade());

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);

	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 4L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		System.out.println(produto.getProduto());
	}

	@Ignore
	@Test
	public void editar() {
		Long codigo = 4L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		// produto.setProduto("Iphone EX");
		produto.setQuantidade(10);
		// produto.setPreco(4500.00);
		produto.flagTotal(produto.getPreco(), produto.getQuantidade());
		produtoDAO.Editar(produto);
	}
	
	@Ignore
	@Test
	public void excluir() {
		Long cod = 43L;
		ProdutoDAO pdao = new ProdutoDAO();
		Produto prod = pdao.buscar(cod);
		
		pdao.Excluir(prod);
	}

}
