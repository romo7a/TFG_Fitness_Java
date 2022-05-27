/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alvaro Romo Villarreal
 */
@Entity
@Table(name = "Mediciones", catalog = "ASPNet_Fitness", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediciones.findAll", query = "SELECT m FROM Mediciones m"),
    @NamedQuery(name = "Mediciones.findById", query = "SELECT m FROM Mediciones m WHERE m.id = :id"),
    @NamedQuery(name = "Mediciones.findByPeso", query = "SELECT m FROM Mediciones m WHERE m.peso = :peso"),
    @NamedQuery(name = "Mediciones.findByAltura", query = "SELECT m FROM Mediciones m WHERE m.altura = :altura"),
    @NamedQuery(name = "Mediciones.findByCuello", query = "SELECT m FROM Mediciones m WHERE m.cuello = :cuello"),
    @NamedQuery(name = "Mediciones.findByHombros", query = "SELECT m FROM Mediciones m WHERE m.hombros = :hombros"),
    @NamedQuery(name = "Mediciones.findByPecho", query = "SELECT m FROM Mediciones m WHERE m.pecho = :pecho"),
    @NamedQuery(name = "Mediciones.findByCintura", query = "SELECT m FROM Mediciones m WHERE m.cintura = :cintura"),
    @NamedQuery(name = "Mediciones.findByMuslo", query = "SELECT m FROM Mediciones m WHERE m.muslo = :muslo"),
    @NamedQuery(name = "Mediciones.findByPantorrillas", query = "SELECT m FROM Mediciones m WHERE m.pantorrillas = :pantorrillas"),
    @NamedQuery(name = "Mediciones.findByBiceps", query = "SELECT m FROM Mediciones m WHERE m.biceps = :biceps"),
    @NamedQuery(name = "Mediciones.findByGluteos", query = "SELECT m FROM Mediciones m WHERE m.gluteos = :gluteos"),
    @NamedQuery(name = "Mediciones.findByFechaMedicion", query = "SELECT m FROM Mediciones m WHERE m.fechaMedicion = :fechaMedicion"),
    @NamedQuery(name = "Mediciones.findByImc", query = "SELECT m FROM Mediciones m WHERE m.imc = :imc")})
public class Mediciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "peso")
    private Long peso;
    @Column(name = "altura")
    private Long altura;
    @Column(name = "cuello")
    private Long cuello;
    @Column(name = "hombros")
    private Integer hombros;
    @Column(name = "pecho")
    private Integer pecho;
    @Column(name = "cintura")
    private Integer cintura;
    @Column(name = "muslo")
    private Integer muslo;
    @Column(name = "pantorrillas")
    private Integer pantorrillas;
    @Column(name = "biceps")
    private Integer biceps;
    @Column(name = "gluteos")
    private Integer gluteos;
    @Column(name = "fecha_medicion", length = 26)
    private String fechaMedicion;
    @Column(name = "imc")
    private Long imc;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios idUsuario;

    public Mediciones() {
    }

    public Mediciones(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public Long getAltura() {
        return altura;
    }

    public void setAltura(Long altura) {
        this.altura = altura;
    }

    public Long getCuello() {
        return cuello;
    }

    public void setCuello(Long cuello) {
        this.cuello = cuello;
    }

    public Integer getHombros() {
        return hombros;
    }

    public void setHombros(Integer hombros) {
        this.hombros = hombros;
    }

    public Integer getPecho() {
        return pecho;
    }

    public void setPecho(Integer pecho) {
        this.pecho = pecho;
    }

    public Integer getCintura() {
        return cintura;
    }

    public void setCintura(Integer cintura) {
        this.cintura = cintura;
    }

    public Integer getMuslo() {
        return muslo;
    }

    public void setMuslo(Integer muslo) {
        this.muslo = muslo;
    }

    public Integer getPantorrillas() {
        return pantorrillas;
    }

    public void setPantorrillas(Integer pantorrillas) {
        this.pantorrillas = pantorrillas;
    }

    public Integer getBiceps() {
        return biceps;
    }

    public void setBiceps(Integer biceps) {
        this.biceps = biceps;
    }

    public Integer getGluteos() {
        return gluteos;
    }

    public void setGluteos(Integer gluteos) {
        this.gluteos = gluteos;
    }

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public Long getImc() {
        return imc;
    }

    public void setImc(Long imc) {
        this.imc = imc;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Mediciones)) {
            return false;
        }
        Mediciones other = (Mediciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Mediciones[ id=" + id + " ]";
    }
    
}
