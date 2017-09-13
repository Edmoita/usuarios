package controle;

import java.util.List;

import dados.IRepositorioUsuarios;
import dados.Usuario;

public class ControladorUsuarios {

	private IRepositorioUsuarios repositorio;
	
	public ControladorUsuarios(IRepositorioUsuarios tipo){
		this.repositorio = tipo;
	}
	
	public void insere(Usuario u){
		repositorio.inserir(u);
	}
	
	public Usuario busca(Usuario u) {
		return repositorio.buscar(u);
	}
	
	public void altera(Usuario original, Usuario alterado) {
		repositorio.alterar(original, alterado);
	}
	
	public void remove(Usuario u) {
		repositorio.remover(u);
	}
	
	public List<Usuario> lista(){
		return repositorio.listar();
	}
	
}
