/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.TipoEjercicio;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class Utilidades {

//    private static String TEMA = "com.formdev.flatlaf.FlatLightLaf";
    private static String TEMA = "com.formdev.flatlaf.FlatIntelliJLaf";
//      private static String TEMA = "com.formdev.flatlaf.FlatDarkLaf";

    private ImageIcon imagen;
    private Icon icono;

    public Image iconToImage(Icon icon) {
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        BufferedImage bi = gc.createCompatibleImage(w, h);
        Graphics2D g = bi.createGraphics();

        icon.paintIcon(null, g, 0, 0);

        g.dispose();

        return bi;
    }

    public byte[] imageToByte(Image image) {
        BufferedImage bi = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            ImageIO.write(bi, "JPG", stream);
        } catch (IOException e) {
            System.out.println("Error al convertir imagen a bytes " + e.getMessage());
        }
        return stream.toByteArray();
    }

    public void cambiarTema(JFrame ventana) {
        try {
            javax.swing.UIManager.setLookAndFeel(TEMA);
            setUIFont();
            SwingUtilities.updateComponentTreeUI(ventana);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Inserte la libreria de apariencia para implementar toda la funcionalidad");
        }
    }

    private static void setUIFont() {
        try {
            Font f = Font.createFont(Font.TRUETYPE_FONT, new File(".\\recursos\\fonts\\Oxygen-Bold.ttf")).deriveFont(13f);
            java.util.Enumeration keys = UIManager.getDefaults().keys();
            while (keys.hasMoreElements()) {
                Object key = keys.nextElement();
                Object value = UIManager.get(key);
                if (value instanceof javax.swing.plaf.FontUIResource) {
                    UIManager.put(key, f);
                }
            }
        } catch (FontFormatException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearNuevoTipoEjercicio(CRUD crud) {
        try {

            String tipoEjercicio = JOptionPane.showInputDialog(null, "Interte un nuevo tipo de ejercicio", "Crear Nuevo Tipo de Ejercicio", JOptionPane.INFORMATION_MESSAGE);
            if (tipoEjercicio != null) {
                TipoEjercicio tipoEjInsert = new TipoEjercicio();
                tipoEjInsert.setTipoEjercicio(tipoEjercicio);
                crud.InsertarTipoEjercicio(tipoEjInsert);
                JOptionPane.showMessageDialog(null, "Tipo de Ejercicio \"" + tipoEjercicio + "\" creado correctamente ");
            } else {
                return;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fallo al crear el tipo de ejercicio");
        }

    }

    public boolean validarEmail(String email) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            // Válido
            return true;
        } else {
            // No válido
            return false;
        }
    }

    public void pintarImagen(JLabel lbl, String ruta) {
        lbl.setIcon(new ImageIcon());
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
    }

    /**
     * Crea un fichero historial con las consultas recibidas
     *
     * @param usuarios
     */
    public void crearFicheroUsuarios(DefaultListModel usuarios) {
        String fecha = LocalDateTime.now().toString().split("\\.")[0].replace("-", "_").replace(":", "_");
        File n_fichero = new File ("./DocumentosGenerados/Usuarios_"+fecha+".csv");
        FileWriter fr = null;
        try {
            fr = new FileWriter(n_fichero);
            PrintWriter pw = new PrintWriter(fr);
            for (int i = 0; i < usuarios.size(); i++) {
                String sinSalto = quitaSaltosLinea(usuarios.getElementAt(i).toString());
                pw.print(sinSalto + "\n");
            }
            fr.close();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * quita los saltos de línea para escribirlos escribirlos bien en el fichero
     * historial
     *
     * @param consulta
     * @return
     */
    public String quitaSaltosLinea(String consulta) {
        consulta = consulta.replace("\n", " ");
        return consulta;
    }
    
}
