package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Sancion;

@Local
public interface SancionService {

    public List<Sancion> listarSanciones();

    public Sancion encontrarSancionPorId(Sancion sancion);

    public void registrarSancion(Sancion sancion);

    public void modificarSancion(Sancion sancion);

    public void eliminarSancion(Sancion sancion);
}