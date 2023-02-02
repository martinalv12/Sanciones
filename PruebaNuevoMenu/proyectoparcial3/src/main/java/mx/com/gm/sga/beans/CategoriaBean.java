package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Categoria;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;
import mx.com.gm.sga.servicio.CategoriaService;

@Named("categoriaBean")
@RequestScoped
public class CategoriaBean {

    @Inject
    private CategoriaService categoriaService;

    private Categoria categoriaSeleccionada;

    List<Categoria> categorias;

    public CategoriaBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        categorias = categoriaService.listarCategorias();
        categoriaSeleccionada = new Categoria();
    }

    public void editListener(RowEditEvent event) {
        Categoria categoria = (Categoria) event.getObject();
        categoriaService.modificarCategoria(categoria);
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Categoria getCategoriaSeleccionada() {
        return categoriaSeleccionada;
    }

    public void setCategoriaSeleccionada(Categoria categoriaSeleccionada) {
        this.categoriaSeleccionada = categoriaSeleccionada;
    }

    public void reiniciarCategoriaSeleccionada() {
        this.categoriaSeleccionada = new Categoria();
    }

    public void agregarCategoria() {
        categoriaService.registrarCategoria(this.categoriaSeleccionada);
        this.categoriaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarCategoria() {
        categoriaService.eliminarCategoria(this.categoriaSeleccionada);
        this.categoriaSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public CategoriaService getCategoriaService() {
        return categoriaService;
    }

    public void setCategoriaService(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
}
