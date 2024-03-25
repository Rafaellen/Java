package Biblioteca;

public class BibliotecaClass {
	String titulo;
	String autor;
	Integer ano;
	
	public BibliotecaClass(String titulo, String autor, Integer ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	
	public void exibirInfos() {
		System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno de lançamento: " + ano);
	}
}
