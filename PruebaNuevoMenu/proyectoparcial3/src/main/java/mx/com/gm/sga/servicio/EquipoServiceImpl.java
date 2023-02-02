package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Equipo;
import mx.com.gm.sga.eis.EquipoDao;

@Stateless
public class EquipoServiceImpl implements  EquipoService {
	
	@Inject
	private EquipoDao equipoDao;

        @Override
	public List<Equipo> listarEquipos() {
		return equipoDao.findAll();
	}

        @Override
	public Equipo encontrarEquipoPorId(Equipo equipo) {
		return equipoDao.find(equipo);
	}
        
        
        @Override
	public Equipo encontrarEquipoPorNombre(Equipo equipo) {
		//return personaDao.findPersonaByEmail(persona);
                return null;
	}

        @Override
	public void registrarEquipo(Equipo equipo) {
		//montón de código
                
                
                equipoDao.create(equipo);
	}

        @Override
	public void modificarEquipo(Equipo equipo) {
            // validaciones, reglas de negocio	
            equipoDao.edit(equipo);
	}

        @Override
	public void eliminarEquipo(Equipo equipo) {
		// validaciones, reglas de negocio
            equipoDao.remove(equipo);
	}
}