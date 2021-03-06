/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

import Modelo.Ejercicio;
import Modelo.Mediciones;
import Modelo.Rutina;
import Modelo.TipoEjercicio;
import Modelo.Usuarios;
import java.util.List;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public interface I_CRUD {

    public List<Usuarios> ConsultarUsuario();

    public List<Rutina> ListarRutinas();

    public boolean InsertarUser(Usuarios user);

    public List<Ejercicio> ListarEjercicios();

    public List<TipoEjercicio> ListarTipoEjercicios();

    public boolean InsertarEjercicio(Ejercicio ejercicio);

    public Ejercicio ConsultarEjercicio(int id_ejercicio);

    public boolean InsertarRutina(Rutina rutina);

    public boolean InsertarTipoEjercicio(TipoEjercicio tipoEjercicio);

    public boolean InsertarMedicion(Mediciones medicion);

    public boolean eliminarUsuario(Usuarios user);

    public boolean actualizarUsuario(Usuarios user);

    public String consultarTipoEjercicio(int id_tipoEjercicio);

    public List<Mediciones> medicionesUser(int idUser);

    public boolean eliminarEjercicio(Ejercicio ejercicio);

    public boolean eliminarTipoDeEjercicio(TipoEjercicio tipo_ejercicio);

    public boolean eliminarRutina(Rutina rutina);

    public boolean eliminarMedicion(Mediciones medicion);

}
