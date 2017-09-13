package dados;

import java.util.List;

public interface IRepositorioUsuarios {
	
	public void inserir(Usuario u);
	public Usuario buscar(Usuario u);
	public void alterar(Usuario original, Usuario alterado);
	public void remover(Usuario u);
	public List <Usuario> listar();
	
}
