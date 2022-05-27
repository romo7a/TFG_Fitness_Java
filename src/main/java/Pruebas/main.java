/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Controlador.CRUD;
import Modelo.Ejercicio;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class main {
    public static void main(String[] args) {
        CRUD crud = new CRUD("App_fitness_casa");
        Ejercicio e = crud.ConsultarEjercicio(5);
        
        System.out.println("hola");
    }
}
