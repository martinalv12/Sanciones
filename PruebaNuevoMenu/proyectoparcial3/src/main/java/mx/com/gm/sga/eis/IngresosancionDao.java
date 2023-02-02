/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Ingresosancion;

/**
 *
 * @author Usuario
 */
@Local
public interface IngresosancionDao {

    void create(Ingresosancion ingresosancion);

    void edit(Ingresosancion ingresosancion);

    void remove(Ingresosancion ingresosancion);

    Ingresosancion find(Object id);

    List<Ingresosancion> findAll();

    List<Ingresosancion> findRange(int[] range);

    int count();
    
}
