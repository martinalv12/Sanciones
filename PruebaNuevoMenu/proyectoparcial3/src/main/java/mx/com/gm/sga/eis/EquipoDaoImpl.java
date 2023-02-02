/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.eis;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.gm.sga.domain.Equipo;

/**
 *
 * @author Usuario
 */
@Stateless
public class EquipoDaoImpl extends AbstractFacade<Equipo> implements EquipoDao {

    @PersistenceContext(unitName = "SancionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoDaoImpl() {
        super(Equipo.class);
    }
    
}
