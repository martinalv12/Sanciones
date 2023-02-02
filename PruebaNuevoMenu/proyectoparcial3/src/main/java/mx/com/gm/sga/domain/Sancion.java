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
@Table(name = "sancion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sancion.findAll", query = "SELECT s FROM Sancion s"),
    @NamedQuery(name = "Sancion.findByIdsancion", query = "SELECT s FROM Sancion s WHERE s.idsancion = :idsancion"),
    @NamedQuery(name = "Sancion.findByTipoSancion", query = "SELECT s FROM Sancion s WHERE s.tipoSancion = :tipoSancion"),
    @NamedQuery(name = "Sancion.findByArticulo", query = "SELECT s FROM Sancion s WHERE s.articulo = :articulo"),
    @NamedQuery(name = "Sancion.findByValor", query = "SELECT s FROM Sancion s WHERE s.valor = :valor")})
public class Sancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsancion")
    private Integer idsancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoSancion")
    private String tipoSancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "articulo")
    private String articulo;
    @Column(name = "valor")
    private Long valor;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "suspencion")
    private String suspencion;

    public Sancion() {
    }

    public Sancion(Integer idsancion) {
        this.idsancion = idsancion;
    }

    public Sancion(Integer idsancion, String tipoSancion, String articulo, String suspencion) {
        this.idsancion = idsancion;
        this.tipoSancion = tipoSancion;
        this.articulo = articulo;
        this.suspencion = suspencion;
    }

    public Integer getIdsancion() {
        return idsancion;
    }

    public void setIdsancion(Integer idsancion) {
        this.idsancion = idsancion;
    }

    public String getTipoSancion() {
        return tipoSancion;
    }

    public void setTipoSancion(String tipoSancion) {
        this.tipoSancion = tipoSancion;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getSuspencion() {
        return suspencion;
    }

    public void setSuspencion(String suspencion) {
        this.suspencion = suspencion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsancion != null ? idsancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sancion)) {
            return false;
        }
        Sancion other = (Sancion) object;
        if ((this.idsancion == null && other.idsancion != null) || (this.idsancion != null && !this.idsancion.equals(other.idsancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Sancion[ idsancion=" + idsancion + " ]";
    }
    
}
