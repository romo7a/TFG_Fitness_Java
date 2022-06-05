package Modelo.Uno;

import Modelo.Ejercicio;
import Modelo.Rutina;
import Modelo.TipoEjercicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-05T12:33:25")
@StaticMetamodel(Ejercicio.class)
public class Ejercicio_ { 

    public static volatile SingularAttribute<Ejercicio, String> descripcion;
    public static volatile SingularAttribute<Ejercicio, TipoEjercicio> idTipoEjercicio;
    public static volatile SingularAttribute<Ejercicio, String> descanso;
    public static volatile ListAttribute<Ejercicio, Rutina> rutinaList;
    public static volatile SingularAttribute<Ejercicio, byte[]> imagen;
    public static volatile SingularAttribute<Ejercicio, Integer> id;
    public static volatile SingularAttribute<Ejercicio, String> nombre;

}