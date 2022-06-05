package Modelo.Uno;

import Modelo.Ejercicio;
import Modelo.Rutina;
import Modelo.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-05T12:33:25")
@StaticMetamodel(Rutina.class)
public class Rutina_ { 

    public static volatile SingularAttribute<Rutina, String> descripcion;
    public static volatile ListAttribute<Rutina, Usuarios> usuariosList;
    public static volatile ListAttribute<Rutina, Ejercicio> ejercicioList;
    public static volatile SingularAttribute<Rutina, Integer> id;
    public static volatile SingularAttribute<Rutina, String> nombre;

}