package Agenda;
import java.util.ArrayList;
import java.util.List;

public class AgendaClass {
	private List<ContatoClass> contatos;
	
	public AgendaClass() {
		contatos = new ArrayList<>();
	}
	
	// add contato
	public void adicionarContato(ContatoClass contato) {
		contatos.add(contato);
	}
	
	// remover contato
	public void removerContato(ContatoClass contato) {
		contatos.remove(contato);
	}
	
	// buscar contato
	public List<ContatoClass> buscarContato(String nome) {
		List<ContatoClass> resultado = new ArrayList<>();
		for (ContatoClass contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				resultado.add(contato);
			}
		}
		return resultado;
	}
}
