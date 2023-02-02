package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Ingresosancion;


public interface IngresosancionServiceRemote {

     public List<Ingresosancion> listarIngresosanciones();

    public Ingresosancion encontrarIngresoSancionPorId(Ingresosancion ingresosancion);

    public void registrarIngresoSancion(Ingresosancion ingresosancion);

    public void modificarIngresoSancion(Ingresosancion ingresosancion);

    public void eliminarIngresoSancion(Ingresosancion ingresosancion);
}