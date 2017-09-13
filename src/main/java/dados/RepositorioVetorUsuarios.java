package dados;

import java.util.List;
import java.util.Vector;

public class RepositorioVetorUsuarios implements IRepositorioUsuarios {

	private List<Usuario> vetor = new Vector<Usuario>();

	public void inserir(Usuario u) {
		vetor.add(u);
		
	}

	public Usuario buscar(Usuario u) {
		int posicao = vetor.indexOf(u);
		return vetor.get(posicao);
	}

	public void alterar(Usuario original, Usuario alterado) {
		remover(original);
		inserir(alterado);
	}

	public void remover(Usuario u) {
		vetor.remove(u);
		
	}

	public List<Usuario> listar() {
		return vetor;
	}	
	
}
