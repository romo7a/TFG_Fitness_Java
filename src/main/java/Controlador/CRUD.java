/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ejercicio;
import Modelo.Mediciones;
import Modelo.Rutina;
import Modelo.TipoEjercicio;
import Modelo.Usuarios;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class CRUD implements I_CRUD {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CRUD(String up) {
        try {
            emf = Persistence.createEntityManagerFactory(up);
            em = emf.createEntityManager();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
            System.exit(1);
        }
        
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
    public boolean InsertarMedicion(Mediciones medicion) {
        try {
            em.getTransaction().begin();
            em.persist(medicion);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarUsuario(Usuarios user) {
        try {
            em.getTransaction().begin();
            Usuarios u = em.merge(user);
            em.remove(u);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarUsuario(Usuarios user) {
        try {
            em.getTransaction().begin();

            // Primero buscamos que el usuario exista
            Usuarios user_update = em.find(Usuarios.class, user.getId());

            if (user_update == null) {
                return false;
            } else {
                // Si existe el producto 
                em.merge(user);
//                Lo actualizamos 
                em.getTransaction().commit();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public List<Mediciones> medicionesUser(int idUser) {
        Usuarios user = null;
        try {
            // Primero buscamos que el usuario exista
            user = em.find(Usuarios.class, idUser);

            return user.getMedicionesList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<Mediciones>();
        }

    }

    @Override
    public boolean InsertarTipoEjercicio(TipoEjercicio tipoEjercicio) {
        try {
            em.getTransaction().begin();
            em.persist(tipoEjercicio);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String consultarTipoEjercicio(int id_tipoEjercicio) {
        try {
            em.getTransaction().begin();
            TipoEjercicio tipo_ejercicio = em.find(TipoEjercicio.class, id_tipoEjercicio);
            return tipo_ejercicio.getTipoEjercicio();
        } catch (Exception e) {
            return " ";
        }

    }

    @Override
    public boolean eliminarEjercicio(Ejercicio ejercicio) {
        try {
            em.getTransaction().begin();
            Ejercicio e = em.merge(ejercicio);
            em.remove(e);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Ejercicio eliminado correctamente");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el ejercicio");
            return false;
        }
    }

    @Override
    public boolean eliminarTipoDeEjercicio(TipoEjercicio tipo_ejercicio) {
        try {
            em.getTransaction().begin();
            TipoEjercicio e = em.merge(tipo_ejercicio);
            em.remove(e);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Tipo de ejercicio eliminado correctamente");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el tipo de ejercicio, asegures?? de que no contiene ningun ejercicicio");
            return false;
        }
    }

    @Override
    public boolean eliminarRutina(Rutina rutina) {
        try {
            em.getTransaction().begin();
            Rutina r = em.merge(rutina);
            em.remove(r);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Rutina eliminada correctamente");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la rutina, revise que ning??n usuario est?? utilizando esta rutina de entrenamiento");
            return false;
        }
    }

    @Override
    public boolean eliminarMedicion(Mediciones medicion) {
        try {
            em.getTransaction().begin();
            Mediciones m = em.merge(medicion);
            em.remove(m);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Medici??n eliminada correctamente");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la medicion");
            return false;
        }
    }

}
