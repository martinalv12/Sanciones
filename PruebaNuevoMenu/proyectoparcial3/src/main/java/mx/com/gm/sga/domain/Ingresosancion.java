/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "ingresosancion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingresosancion.findAll", query = "SELECT i FROM Ingresosancion i"),
    @NamedQuery(name = "Ingresosancion.findByIdingresosancion", query = "SELECT i FROM Ingresosancion i WHERE i.idingresosancion = :idingresosancion"),
    @NamedQuery(name = "Ingresosancion.findByEquipo", query = "SELECT i FROM Ingresosancion i WHERE i.equipo = :equipo"),
    @NamedQuery(name = "Ingresosancion.findByNumeroJugador", query = "SELECT i FROM Ingresosancion i WHERE i.numeroJugador = :numeroJugador")})
public class Ingresosancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idingresosancion")
    private Integer idingresosancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "equipo")
    private String equipo;
    @Column(name = "numeroJugador")
    private Integer numeroJugador;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "sancion")
    private String sancion;

    public Ingresosancion() {
    }

    public Ingresosancion(Integer idingresosancion) {
        this.idingresosancion = idingresosancion;
    }

    public Ingresosancion(Integer idingresosancion, String equipo, String sancion) {
        this.idingresosancion = idingresosancion;
        this.equipo = equipo;
        this.sancion = sancion;
    }

    public Integer getIdingresosancion() {
        return idingresosancion;
    }

    public void setIdingresosancion(Integer idingresosancion) {
        this.idingresosancion = idingresosancion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Integer getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(Integer numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public String getSancion() {
        return sancion;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idingresosancion != null ? idingresosancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingresosancion)) {
            return false;
        }
        Ingresosancion other = (Ingresosancion) object;
        if ((this.idingresosancion == null && other.idingresosancion != null) || (this.idingresosancion != null && !this.idingresosancion.equals(other.idingresosancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Ingresosancion[ idingresosancion=" + idingresosancion + " ]";
    }
    
}
