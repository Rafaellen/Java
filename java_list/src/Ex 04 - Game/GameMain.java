package Game;

public class GameMain {
	public static void main(String[] args) {
		GameClass p1 = new GameClass("Gabriela");
		p1.aumentarPontuacao(100);
		p1.aumentarNivel();
		p1.infosJogadores();
	}
}
