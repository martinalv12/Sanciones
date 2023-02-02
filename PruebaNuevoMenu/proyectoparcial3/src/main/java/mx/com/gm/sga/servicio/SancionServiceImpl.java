package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Sancion;
import mx.com.gm.sga.eis.SancionDao;

@Stateless
public class SancionServiceImpl implements SancionServiceRemote, SancionService {
	
	@Inject
	private SancionDao sancionDao;

        @Override
	public List<Sancion> listarSanciones() {
		return sancionDao.findAll();
	}

        @Override
	public Sancion encontrarSancionPorId(Sancion sancion) {
		return sancionDao.find(sancion);
	}

        @Override
	public void registrarSancion(Sancion sancion) {
		sancionDao.create(sancion);
	}

        @Override
	public void modificarSancion(Sancion sancion) {
		sancionDao.edit(sancion);
	}

        @Override
	public void eliminarSancion(Sancion sancion) {
		sancionDao.remove(sancion);
	}
}