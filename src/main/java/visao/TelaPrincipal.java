package visao;

import java.util.List;

import controle.ControladorUsuarios;
import dados.IRepositorioUsuarios;
import dados.RepositorioListaUsuarios;
import dados.RepositorioVetorUsuarios;
import dados.Usuario;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		
		u1.setId(1);
		u1.setNome("Alan Turing");
		u1.setEmail("turing@cs.com");
		
		u2.setId(2);
		u2.setNome("Ada Lovelace");
		u2.setEmail("ada@cs.com");
		
		u3.setId(3);
		u3.setNome("Edsger Dijkstra");
		u3.setEmail("dijkstra@cs.com");
		
		IRepositorioUsuarios repositorioLista = new RepositorioListaUsuarios();
		IRepositorioUsuarios vetorUsuarios = new RepositorioVetorUsuarios();
		
		ControladorUsuarios controlador = new ControladorUsuarios(repositorioLista);
		
		controlador.insere(u1);
		controlador.insere(u2);
		controlador.insere(u3);
		
		List<Usuario> lista = controlador.lista();
		for (Usuario u : lista) {
			System.out.println("Id: " + u.getId());
			System.out.println("Nome: " + u.getNome());
			System.out.println("Email: " + u.getEmail() + "\n");
		}
		
		
	}
}
