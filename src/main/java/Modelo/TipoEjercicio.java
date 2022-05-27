/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alvaro Romo Villarreal
 */
@Entity
@Table(name = "TipoEjercicio", catalog = "ASPNet_Fitness", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEjercicio.findAll", query = "SELECT t FROM TipoEjercicio t"),
    @NamedQuery(name = "TipoEjercicio.findById", query = "SELECT t FROM TipoEjercicio t WHERE t.id = :id"),
    @NamedQuery(name = "TipoEjercicio.findByTipoEjercicio", query = "SELECT t FROM TipoEjercicio t WHERE t.tipoEjercicio = :tipoEjercicio")})
public class TipoEjercicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "tipo_ejercicio", length = 100)
    private String tipoEjercicio;
    @OneToMany(mappedBy = "idTipoEjercicio")
    private List<Ejercicio> ejercicioList;

    public TipoEjercicio() {
    }

    public TipoEjercicio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    @XmlTransient
    public List<Ejercicio> getEjercicioList() {
        return ejercicioList;
    }

    public void setEjercicioList(List<Ejercicio> ejercicioList) {
        this.ejercicioList = ejercicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEjercicio)) {
            return false;
        }
        TipoEjercicio other = (TipoEjercicio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TipoEjercicio[ id=" + id + " ]";
    }
    
}
