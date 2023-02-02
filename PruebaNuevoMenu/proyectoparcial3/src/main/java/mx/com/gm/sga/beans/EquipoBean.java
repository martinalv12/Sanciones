package mx.com.gm.sga.beans;


import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Equipo;
import mx.com.gm.sga.servicio.EquipoService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named("equipoBean")
@RequestScoped
public class EquipoBean {

    @Inject
    private EquipoService equipoService;

    private Equipo equipoSeleccionado;

    List<Equipo> equipos;

    public EquipoBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        equipos = equipoService.listarEquipos();
        equipoSeleccionado = new Equipo();
    }

    public void editListener(RowEditEvent event) {
        Equipo equipo = (Equipo) event.getObject();
        equipoService.modificarEquipo(equipo);
    }

    public List<Equipo> getEquipos() {
        return equipos;        
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Equipo getEquipoSeleccionado() {
        return equipoSeleccionado;
    }

    public void setEquipoSeleccionado(Equipo equipoSeleccionado) {
        this.equipoSeleccionado = equipoSeleccionado;
    }

    public void reiniciarEquipoSeleccionado() {
        this.equipoSeleccionado = new Equipo();
    }

    public void agregarEquipo() {
        equipoService.registrarEquipo(this.equipoSeleccionado);
        this.equipoSeleccionado = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarEquipo() {
        equipoService.eliminarEquipo(this.equipoSeleccionado);
        this.equipoSeleccionado = null;
        //actualizamos la lista
        this.inicializar();
    }

    public EquipoService getEquipoService() {
        return equipoService;
    }

    public void setEquipoService(EquipoService equipoService) {
        this.equipoService = equipoService;
    }
}
