package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Categoria;
import mx.com.gm.sga.eis.CategoriaDao;

@Stateless
public class CategoriaServiceImpl implements  CategoriaService {
	
	@Inject
	private CategoriaDao categoriaDao;

        @Override
	public List<Categoria> listarCategorias() {
		return categoriaDao.findAll();
	}

        @Override
	public Categoria encontrarCategoriaPorId(Categoria categoria) {
		return categoriaDao.find(categoria);
	}
        
        
        @Override
	public Categoria encontrarCategoriaPorNombre(Categoria categoria) {
		//return personaDao.findPersonaByEmail(persona);
                return null;
	}

        @Override
	public void registrarCategoria(Categoria categoria) {
		//montón de código
                
                
                categoriaDao.create(categoria);
	}

        @Override
	public void modificarCategoria(Categoria categoria) {
            // validaciones, reglas de negocio	
            categoriaDao.edit(categoria);
	}

        @Override
	public void eliminarCategoria(Categoria categoria) {
		// validaciones, reglas de negocio
            categoriaDao.remove(categoria);
	}
}