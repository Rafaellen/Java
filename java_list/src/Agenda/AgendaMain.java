package Agenda;
import java.util.List;

public class AgendaMain {
	public static void main(String[] args) {
		AgendaClass agenda = new AgendaClass();
		
		ContatoClass c1 = new ContatoClass("Gabriel", "(41) 997635218");
		ContatoClass c2 = new ContatoClass("Marcia", "(41) 988524531");
		
		agenda.adicionarContato(c1);
		agenda.adicionarContato(c2);
		
		List<ContatoClass> resultados = agenda.buscarContato("Marcia");
		
		for (ContatoClass contato : resultados) {
			System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone());
		}
	}
}
