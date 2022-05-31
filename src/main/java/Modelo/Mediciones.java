/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso", precision = 10, scale = 2)
    private BigDecimal peso;
    @Column(name = "altura", precision = 10, scale = 2)
    private BigDecimal altura;
    @Column(name = "cuello", precision = 10, scale = 2)
    private BigDecimal cuello;
    @Column(name = "hombros", precision = 10, scale = 2)
    private BigDecimal hombros;
    @Column(name = "pecho", precision = 10, scale = 2)
    private BigDecimal pecho;
    @Column(name = "cintura", precision = 10, scale = 2)
    private BigDecimal cintura;
    @Column(name = "muslo", precision = 10, scale = 2)
    private BigDecimal muslo;
    @Column(name = "pantorrillas", precision = 10, scale = 2)
    private BigDecimal pantorrillas;
    @Column(name = "biceps", precision = 10, scale = 2)
    private BigDecimal biceps;
    @Column(name = "gluteos", precision = 10, scale = 2)
    private BigDecimal gluteos;
    @Column(name = "fecha_medicion", length = 26)
    private String fechaMedicion;
    @Column(name = "imc", precision = 10, scale = 2)
    private BigDecimal imc;
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

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getCuello() {
        return cuello;
    }

    public void setCuello(BigDecimal cuello) {
        this.cuello = cuello;
    }

    public BigDecimal getHombros() {
        return hombros;
    }

    public void setHombros(BigDecimal hombros) {
        this.hombros = hombros;
    }

    public BigDecimal getPecho() {
        return pecho;
    }

    public void setPecho(BigDecimal pecho) {
        this.pecho = pecho;
    }

    public BigDecimal getCintura() {
        return cintura;
    }

    public void setCintura(BigDecimal cintura) {
        this.cintura = cintura;
    }

    public BigDecimal getMuslo() {
        return muslo;
    }

    public void setMuslo(BigDecimal muslo) {
        this.muslo = muslo;
    }

    public BigDecimal getPantorrillas() {
        return pantorrillas;
    }

    public void setPantorrillas(BigDecimal pantorrillas) {
        this.pantorrillas = pantorrillas;
    }

    public BigDecimal getBiceps() {
        return biceps;
    }

    public void setBiceps(BigDecimal biceps) {
        this.biceps = biceps;
    }

    public BigDecimal getGluteos() {
        return gluteos;
    }

    public void setGluteos(BigDecimal gluteos) {
        this.gluteos = gluteos;
    }

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public BigDecimal getImc() {
        return imc;
    }

    public void setImc(BigDecimal imc) {
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
