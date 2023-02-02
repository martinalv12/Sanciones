package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Equipo;

@Remote
public interface EquipoServiceRemote {

    public List<Equipo> listarEquipos();

    public Equipo encontrarEquipoPorId(Equipo equipo);

    public Equipo encontrarEquipoPorNombre(Equipo equipo);

    public void registrarEquipo(Equipo equipo);

    public void modificarEquipo(Equipo equipo);

    public void eliminarEquipo(Equipo equipo);
}