/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1.Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "escuderia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escuderia.findAll", query = "SELECT e FROM Escuderia e"),
    @NamedQuery(name = "Escuderia.findByCodEscuderia", query = "SELECT e FROM Escuderia e WHERE e.codEscuderia = :codEscuderia"),
    @NamedQuery(name = "Escuderia.findByNombreEscuderia", query = "SELECT e FROM Escuderia e WHERE e.nombreEscuderia = :nombreEscuderia"),
    @NamedQuery(name = "Escuderia.findByPresupuesto", query = "SELECT e FROM Escuderia e WHERE e.presupuesto = :presupuesto"),
    @NamedQuery(name = "Escuderia.findByFechaCreacion", query = "SELECT e FROM Escuderia e WHERE e.fechaCreacion = :fechaCreacion")})
public class Escuderia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_escuderia")
    private Integer codEscuderia;
    @Column(name = "nombre_escuderia")
    private String nombreEscuderia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "presupuesto")
    private BigDecimal presupuesto;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public Escuderia(Integer codEscuderia, String nombreEscuderia, BigDecimal presupuesto, Date fechaCreacion) {
        this.codEscuderia = codEscuderia;
        this.nombreEscuderia = nombreEscuderia;
        this.presupuesto = presupuesto;
        this.fechaCreacion = fechaCreacion;
    }
    
    public Escuderia() {
    }

    public Escuderia(Integer codEscuderia) {
        this.codEscuderia = codEscuderia;
    }

    public Integer getCodEscuderia() {
        return codEscuderia;
    }

    public void setCodEscuderia(Integer codEscuderia) {
        this.codEscuderia = codEscuderia;
    }

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEscuderia != null ? codEscuderia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escuderia)) {
            return false;
        }
        Escuderia other = (Escuderia) object;
        if ((this.codEscuderia == null && other.codEscuderia != null) || (this.codEscuderia != null && !this.codEscuderia.equals(other.codEscuderia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mundialf1.Clases.Escuderia[ codEscuderia=" + codEscuderia + " ]";
    }
    
}
