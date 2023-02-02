package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Ingresosancion;
import mx.com.gm.sga.servicio.IngresosancionService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named("ingresosancionBean")
@RequestScoped
public class IngresosancionBean {

    @Inject
    private IngresosancionService ingresosancionService;

    private Ingresosancion ingresosancionSeleccionada;

    List<Ingresosancion> ingresosanciones;

    public IngresosancionBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        ingresosanciones = ingresosancionService.listarIngresosanciones();
        ingresosancionSeleccionada = new Ingresosancion();
    }

    public void editListener(RowEditEvent event) {
        Ingresosancion ingresosancion = (Ingresosancion) event.getObject();
        ingresosancionService.modificarIngresoSancion(ingresosancion);
    }

    public List<Ingresosancion> getIngresoSancion() {
        return ingresosanciones;
    }

    public void setIngresoSancion(List<Ingresosancion> ingresosanciones) {
        this.ingresosanciones = ingresosanciones;
    }

    public Ingresosancion getIngresoSancionSeleccionada() {
        return ingresosancionSeleccionada;
    }

    public void setIngresoSancionSeleccionada(Ingresosancion ingresosancionSeleccionada) {
        this.ingresosancionSeleccionada = ingresosancionSeleccionada;
    }

    public void reiniciarIngresoSancionSeleccionada() {
        this.ingresosancionSeleccionada = new Ingresosancion();
    }

    public void agregarIngresoSancion() {
        ingresosancionService.registrarIngresoSancion(this.ingresosancionSeleccionada);
        this.ingresosancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarIngresoSancion() {
        ingresosancionService.eliminarIngresoSancion(this.ingresosancionSeleccionada);
        this.ingresosancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public IngresosancionService getIngresoSancionService() {
        return ingresosancionService;
    }

    public void setIngresoSancionService(IngresosancionService ingresosancionService) {
        this.ingresosancionService = ingresosancionService;
    }
}
