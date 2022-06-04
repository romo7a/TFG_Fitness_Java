/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JFrame;
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

}
