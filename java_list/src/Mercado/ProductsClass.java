package Mercado;

public class ProductsClass {
	String nomeProduto;
	int codigo;
	int qntdEstoque;
	double preco;
	
	public ProductsClass(String nomeProduto, int codigo, int qntdEstoque, double preco) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.qntdEstoque = qntdEstoque;
		this.preco = preco;
	}
	
	public void addProduto(int quantidadeAdd) {
		if (quantidadeAdd < 0) {
			System.out.println("Quantidade inválida.");
		} else {
			this.qntdEstoque += quantidadeAdd;
			System.out.println("O produto " + nomeProduto + " foi atualizado! \nEstoque: " + qntdEstoque);
		}
	}
	
	public void atualizarProduct(double newPrice) {
		if (newPrice < 0) {
			System.out.println("Valor incorreto.");
		} else {
			this.preco = newPrice;
			System.out.println("Preço do produto atualizado com sucesso! \nPreço atualizado: R$" + newPrice);
		}
	}
	
	public void removeProduct(int quantidadeRemoved) {
		if (quantidadeRemoved > 0 && quantidadeRemoved <= qntdEstoque) {
			this.qntdEstoque -= quantidadeRemoved;
			System.out.println("Quantidade de estoque atualizada com sucesso! \nFoi removido " + quantidadeRemoved + "unidades do produto" + codigo + "\nEstoque atual: " + qntdEstoque);
		}
	}
	
	public void Relatorio() {
		System.out.println("\n============= \nProduto: " + nomeProduto + "\nCódigo: " + codigo + "\nPreço: R$" + preco + "\nQuantidade em estoque: " + qntdEstoque + "\n");
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
