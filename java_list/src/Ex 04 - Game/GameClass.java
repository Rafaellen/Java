package Game;

public class GameClass {
	private String nome;
	private double pontuacao;
	private int nivel;
	
	
	public GameClass(String nome) {
		this.nome = nome;
		this.pontuacao =  0;
		this.nivel = 1;
	}
	
	public void aumentarPontuacao(int points) {
		this.pontuacao += points;
	}
	
	public void aumentarNivel() {
		this.nivel += 1;
	}
	
	public void infosJogadores() {
		System.out.println("Nome: " + nome + "\nPontuação: " + pontuacao + "\nNível: " + nivel);
	}
	
}
