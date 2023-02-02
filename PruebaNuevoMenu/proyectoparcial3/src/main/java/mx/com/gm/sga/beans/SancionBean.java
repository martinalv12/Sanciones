package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Sancion;
import mx.com.gm.sga.servicio.SancionService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named("sancionBean")
@RequestScoped
public class SancionBean {

    @Inject
    private SancionService sancionService;

    private Sancion sancionSeleccionada;

    List<Sancion> sanciones;

    public SancionBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        sanciones = sancionService.listarSanciones();
        sancionSeleccionada = new Sancion();
    }

    public void editListener(RowEditEvent event) {
        Sancion sancion = (Sancion) event.getObject();
        sancionService.modificarSancion(sancion);
    }

    public List<Sancion> getSanciones() {
        return sanciones;
    }

    public void setSanciones(List<Sancion> sanciones) {
        this.sanciones = sanciones;
    }

    public Sancion getSancionSeleccionada() {
        return sancionSeleccionada;
    }

    public void setSancionSeleccionada(Sancion sancionSeleccionada) {
        this.sancionSeleccionada = sancionSeleccionada;
    }

    public void reiniciarSancionSeleccionada() {
        this.sancionSeleccionada = new Sancion();
    }

    public void agregarSancion() {
        sancionService.registrarSancion(this.sancionSeleccionada);
        this.sancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarSancion() {
        sancionService.eliminarSancion(this.sancionSeleccionada);
        this.sancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public SancionService getSancionService() {
        return sancionService;
    }

    public void setSancionService(SancionService sancionService) {
        this.sancionService = sancionService;
    }
}
