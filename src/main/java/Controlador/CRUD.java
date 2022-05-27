/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ejercicio;
import Modelo.Rutina;
import Modelo.TipoEjercicio;
import Modelo.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class CRUD implements I_CRUD {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CRUD(String up) {
        emf = Persistence.createEntityManagerFactory(up);
        em = emf.createEntityManager();
    }

    @Override
    public List<Usuarios> ConsultarUsuario() {
        List<Usuarios> list_users = null;
        try {
            String jpql = "from Usuarios u";
            Query q = em.createQuery(jpql);
            list_users = (List<Usuarios>) q.getResultList();
        } catch (NoResultException e) {
        }
        return list_users;
    }

    @Override
    public List<Rutina> ListarRutinas() {
        List<Rutina> list_rutinas = null;

        try {
            String jpql = "from Rutina u";
            Query q = em.createQuery(jpql);
            list_rutinas = (List<Rutina>) q.getResultList();

        } catch (NoResultException e) {
        }

        return list_rutinas;
    }

    @Override
    public boolean InsertarUser(Usuarios user) {
        boolean exito = false;
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public List<Ejercicio> ListarEjercicios() {
        List<Ejercicio> list_ejercicio = null;

        try {
            String jpql = "from Ejercicio e";
            Query q = em.createQuery(jpql);
            list_ejercicio = (List<Ejercicio>) q.getResultList();

        } catch (NoResultException e) {
        }

        return list_ejercicio;
    }

    @Override
    public List<TipoEjercicio> ListarTipoEjercicios() {
        List<TipoEjercicio> list_tipo_ejercicio = null;

        try {
            String jpql = "from TipoEjercicio e";
            Query q = em.createQuery(jpql);
            list_tipo_ejercicio = (List<TipoEjercicio>) q.getResultList();

        } catch (NoResultException e) {
        }

        return list_tipo_ejercicio;
    }

    @Override
    public boolean InsertarEjercicio(Ejercicio ejercicio) {
        try {
            em.getTransaction().begin();
            em.persist(ejercicio);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public Ejercicio ConsultarEjercicio(int id_ejercicio) {
        try {
            Ejercicio e = em.find(Ejercicio.class, id_ejercicio);
            if (e != null) {
                return e;
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el ejercicio de la BBDD " + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean InsertarRutina(Rutina rutina) {
        try {
            em.getTransaction().begin();
            em.persist(rutina);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Rutina ConsultarRutina(int id_rutina) {
        try {
            Rutina rut = em.find(Rutina.class, id_rutina);
            if (rut != null) {
                return rut;
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el ejercicio de la BBDD " + e.getMessage());
        }
        return null;
    }

}