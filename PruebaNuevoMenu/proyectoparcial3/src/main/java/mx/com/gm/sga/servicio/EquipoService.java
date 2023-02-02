package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Equipo;

@Local
public interface EquipoService {

    public List<Equipo> listarEquipos();

    public Equipo encontrarEquipoPorId(Equipo equipo);

    public Equipo encontrarEquipoPorNombre(Equipo equipo);

    public void registrarEquipo(Equipo equipo);

    public void modificarEquipo(Equipo equipo);

    public void eliminarEquipo(Equipo equipo);
}