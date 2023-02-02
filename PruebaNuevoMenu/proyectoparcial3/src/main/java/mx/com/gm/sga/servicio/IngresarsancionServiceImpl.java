package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Ingresosancion;
import mx.com.gm.sga.eis.IngresosancionDao;

@Stateless
public class IngresarsancionServiceImpl implements IngresosancionServiceRemote, IngresosancionService {
	
	@Inject
	private IngresosancionDao ingresosancionDao;

        @Override
	public List<Ingresosancion> listarIngresosanciones() {
		return ingresosancionDao.findAll();
	}

        @Override
	public Ingresosancion encontrarIngresoSancionPorId(Ingresosancion ingresosancion) {
		return ingresosancionDao.find(ingresosancion);
	}

        @Override
	public void registrarIngresoSancion(Ingresosancion ingresosancion) {
		ingresosancionDao.create(ingresosancion);
	}

        @Override
	public void modificarIngresoSancion(Ingresosancion ingresosancion) {
		ingresosancionDao.edit(ingresosancion);
	}

        @Override
	public void eliminarIngresoSancion(Ingresosancion ingresosancion) {
		ingresosancionDao.remove(ingresosancion);
	}

    
}