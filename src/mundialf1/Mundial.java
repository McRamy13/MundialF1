/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "mundial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mundial.findAll", query = "SELECT m FROM Mundial m"),
    @NamedQuery(name = "Mundial.findByIdPiloto", query = "SELECT m FROM Mundial m WHERE m.idPiloto = :idPiloto"),
    @NamedQuery(name = "Mundial.findByNombrePiloto", query = "SELECT m FROM Mundial m WHERE m.nombrePiloto = :nombrePiloto"),
    @NamedQuery(name = "Mundial.findByNacionalidad", query = "SELECT m FROM Mundial m WHERE m.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Mundial.findByFechaNac", query = "SELECT m FROM Mundial m WHERE m.fechaNac = :fechaNac"),
    @NamedQuery(name = "Mundial.findByPuntosUltimaCarrera", query = "SELECT m FROM Mundial m WHERE m.puntosUltimaCarrera = :puntosUltimaCarrera"),
    @NamedQuery(name = "Mundial.findByPuntosTotales", query = "SELECT m FROM Mundial m WHERE m.puntosTotales = :puntosTotales"),
    @NamedQuery(name = "Mundial.findByCodEscuderia", query = "SELECT m FROM Mundial m WHERE m.codEscuderia = :codEscuderia")})
public class Mundial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_piloto")
    private Integer idPiloto;
    @Column(name = "nombre_piloto")
    private String nombrePiloto;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Column(name = "puntos_ultima_carrera")
    private Boolean puntosUltimaCarrera;
    @Column(name = "puntos_totales")
    private Integer puntosTotales;
    @Lob
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "cod_escuderia")
    private Integer codEscuderia;

    public Mundial() {
    }

    public Mundial(Integer idPiloto) {
        this.idPiloto = idPiloto;
    }

    public Integer getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(Integer idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Boolean getPuntosUltimaCarrera() {
        return puntosUltimaCarrera;
    }

    public void setPuntosUltimaCarrera(Boolean puntosUltimaCarrera) {
        this.puntosUltimaCarrera = puntosUltimaCarrera;
    }

    public Integer getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(Integer puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getCodEscuderia() {
        return codEscuderia;
    }

    public void setCodEscuderia(Integer codEscuderia) {
        this.codEscuderia = codEscuderia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPiloto != null ? idPiloto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mundial)) {
            return false;
        }
        Mundial other = (Mundial) object;
        if ((this.idPiloto == null && other.idPiloto != null) || (this.idPiloto != null && !this.idPiloto.equals(other.idPiloto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mundialf1.Mundial[ idPiloto=" + idPiloto + " ]";
    }
    
}
