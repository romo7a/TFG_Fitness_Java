package Modelo.Uno;

import Modelo.Mediciones;
import Modelo.Rutina;
import Modelo.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-12T12:58:38")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile ListAttribute<Usuarios, Mediciones> medicionesList;
    public static volatile SingularAttribute<Usuarios, String> fechaNacimiento;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, Rutina> idRutina;
    public static volatile SingularAttribute<Usuarios, byte[]> imagenPerfil;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> nombre;
    public static volatile SingularAttribute<Usuarios, Integer> edad;
    public static volatile SingularAttribute<Usuarios, String> dni;
    public static volatile SingularAttribute<Usuarios, String> email;

}