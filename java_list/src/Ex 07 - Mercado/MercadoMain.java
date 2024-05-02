package Mercado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MercadoMain {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<ProductsClass> products = new ArrayList<>();
		
		products.add(new ProductsClass("Leite", 1, 100, 3.99));
		products.add(new ProductsClass("Ovo", 2, 57, 10.99));
		products.add(new ProductsClass("Chocolate", 3, 24, 5.00));
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("\n----- Controle de Estoque de Produto -----");
			System.out.println("1. Adicionar produto");
	        System.out.println("2. Atualizar produto");
	        System.out.println("3. Remover produto");
	        System.out.println("4. Gerar relatório de estoque");
	        System.out.println("5. Sair");
	        System.out.print("Escolha uma opção: ");
	        int opcao = leitor.nextInt();
	        
	        switch (opcao) {
	        	case 1:
	        		System.out.print("Nome do produto: ");
                    String nomeProduto = leitor.next();
                    System.out.print("Código do produto: ");
                    int codigo = leitor.nextInt();
                    System.out.print("Preço do produto: R$");
                    double preco = leitor.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int qntdEstoque = leitor.nextInt();
                    products.add(new ProductsClass(nomeProduto, codigo, qntdEstoque, preco));
                    
                    break;
                    
	        	case 2:
	        		System.out.println("Digite o código do produto que deseja atualizar: ");
	        		int codigoAtt = leitor.nextInt();
	        		
	        		for (ProductsClass p : products) {
	        			if (p.getCodigo() == codigoAtt) {
	        				System.out.print("Novo preço do produto R$: ");
	        				
	        				double novoValor = leitor.nextDouble();
	        				p.atualizarProduct(novoValor);
	        				break;
	        			}
	        		}
	        		break;
	        		
	        	case 3:
	        		System.out.print("Digite o código do produto que deseja remover: ");
	        		
	        		int codigoRemove = leitor.nextInt();
	        		products.removeIf(p -> p.getCodigo() == codigoRemove);
	        		
	        		System.out.println("Produto " + codigoRemove + "foi removido com sucesso!");
	        		
	        		break;
	        		
	        	case 4: 
	        		for (ProductsClass p : products) {
	        			p.Relatorio();
	        		}
	        		break;
	        		
	        	case 5:
	        		System.out.print("Até logo...");
	        		continuar = false;
	        		
	        		break;
	        		
	        	default:
	        		System.out.println("Opção inválida! Tente novamente. ");
	        }
		}
	}
}
