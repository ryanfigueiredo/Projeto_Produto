package br.com.crud.projetomenu.bean;

import java.io.Serializable;
import java.util.List;

//import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.crud.projetomenu.dao.ProdutoDAO;
import br.com.crud.projetomenu.domain.Produto;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ProdutoBean implements Serializable {

	private Produto produto = new Produto();
	private List<Produto> produtos;

	public void salvar() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produto.flagTotal(produto.getPreco(), produto.getQuantidade());
			produtoDAO.salvar(produto);
			Messages.addGlobalInfo("Produto salvo com sucesso");
			System.out.println("Produto Salvo com sucesso");
			listar();
			novo();
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar salvar um novo produto");
			System.out.println("erro ao tentar salvar");
			erro.printStackTrace();
		}
	}
	
	public void excluir(ActionEvent evento){
		try {
			produto = (Produto) evento.getComponent().getAttributes().get("produtoSelecionado");
			System.out.println("metodo excluir chamado");
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtoDAO.Excluir(produto);
			
			produtos = produtoDAO.listar();

			Messages.addGlobalInfo("Cidade removida com sucesso");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar remover a cidade");
			erro.printStackTrace();
		}
	}

	public void editar() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produto.flagTotal(produto.getPreco(), produto.getQuantidade());
			produtoDAO.Editar(produto);
			Messages.addGlobalInfo("Produto editado com sucesso");
			System.out.println("Produto editado com sucesso");
			listar();
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar editar um produto");
			System.out.println("erro ao tentar editar");
			erro.printStackTrace();
		}
	}

	public void listar() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtos = produtoDAO.listar();
			System.out.println("metodo LISTAR CHAMADO");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar os produtos");
			System.out.println("ERRO LISTAR CHAMADO");
			erro.printStackTrace();

		}

	}

	public void novo() {
		produto = new Produto();
		System.out.println("metodo novo chamado");
	}

	public void buscar() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produto = produtoDAO.buscar(produto.getCodigo());
			if (produto == null) {
				System.out.println("produto não encontrado");
				Messages.addGlobalError("Produto não encontrado");
				novo();
				return;
			}

			else {
				System.out.println("produto encontrado: " + produto.getCodigo());
				System.out.println("produto encontrado: " + produto.getProduto());
			}

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Ocorreu um erro ao tentar buscar o produto");
			erro.printStackTrace();
		}
	}

	public void teste() {
		System.out.println("teste");
		System.out.println("nome do produto:" + produto.getProduto() + " - de preço: R$ " + produto.getPreco()
				+ "quantidade: " + produto.getQuantidade());
	}

	
	
		
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		
	}

}


