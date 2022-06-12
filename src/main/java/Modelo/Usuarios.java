/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "Usuarios", catalog = "ASPNet_Fitness", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByApellido", query = "SELECT u FROM Usuarios u WHERE u.apellido = :apellido"),
    @NamedQuery(name = "Usuarios.findByEdad", query = "SELECT u FROM Usuarios u WHERE u.edad = :edad"),
    @NamedQuery(name = "Usuarios.findByDni", query = "SELECT u FROM Usuarios u WHERE u.dni = :dni"),
    @NamedQuery(name = "Usuarios.findByFechaNacimiento", query = "SELECT u FROM Usuarios u WHERE u.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "Nombre", length = 100)
    private String nombre;
    @Column(name = "Apellido", length = 100)
    private String apellido;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "DNI", length = 100)
    private String dni;
    @Column(name = "fecha_nacimiento", length = 100)
    private String fechaNacimiento;
    @Column(name = "direccion", length = 200)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Lob
    @Column(name = "IMAGEN_PERFIL")
    private byte[] imagenPerfil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Mediciones> medicionesList;
    @JoinColumn(name = "id_rutina", referencedColumnName = "id")
    @ManyToOne
    private Rutina idRutina;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Usuarios(Integer id, String email) {
        this.id = id;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(byte[] imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    @XmlTransient
    public List<Mediciones> getMedicionesList() {
        return medicionesList;
    }

    public void setMedicionesList(List<Mediciones> medicionesList) {
        this.medicionesList = medicionesList;
    }

    public Rutina getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(Rutina idRutina) {
        this.idRutina = idRutina;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Id usuario: " + this.id + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Direccion: " + this.direccion + ", e-mail: " + this.email + ", DNI: " + this.dni + ", Fecha_Nacimiento: " + this.fechaNacimiento +", rutina"+this.idRutina.getNombre();
    }

    public String toStringUserCSV() {
        return "Id usuario: " + this.id + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Direccion: " + this.direccion + ", e-mail: " + this.email + ", DNI: " + this.dni + ", Fecha_Nacimiento: " + this.fechaNacimiento;
    }

}
