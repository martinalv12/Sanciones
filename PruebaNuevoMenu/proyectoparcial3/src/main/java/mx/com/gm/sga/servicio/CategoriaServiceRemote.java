package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Categoria;

@Remote
public interface CategoriaServiceRemote {

    public List<Categoria> listarCategorias();

    public Categoria encontrarCategoriaPorId(Categoria categoria);

    public Categoria encontrarCategoriaPorNombre(Categoria categoria);

    public void registrarCategoria(Categoria categoria);

    public void modificarCategoria(Categoria categoria);

    public void eliminarCategoria(Categoria categoria);
}