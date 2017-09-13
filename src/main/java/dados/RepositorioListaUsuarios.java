package dados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioListaUsuarios implements IRepositorioUsuarios {

	private List<Usuario> lista = new LinkedList<Usuario>();

	public void inserir(Usuario u) {
		lista.add(u);
		
	}

	public Usuario buscar(Usuario u) {
		int posicao = lista.indexOf(u);
		return lista.get(posicao);
	}

	public void alterar(Usuario original, Usuario alterado) {
		remover(original);
		inserir(alterado);
	}

	public void remover(Usuario u) {
		lista.remove(u);
		
	}

	public List<Usuario> listar() {
		return lista;
	}
	
}
