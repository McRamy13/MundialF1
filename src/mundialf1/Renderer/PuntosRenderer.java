/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1.Renderer;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class PuntosRenderer extends DefaultTableCellRenderer {

    Image image;

    public PuntosRenderer() {
        setHorizontalAlignment(SwingConstants.CENTER);

    }

    @Override
    public void setValue(Object aValue) {

        boolean result = (boolean) aValue;
        if (result != false) {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("/resources/blue-ok-icon.png"));
                ImageIcon imagen = new ImageIcon(img);
                setText("");
                setIcon(imagen);
                
            } catch (Exception e) {
                //Controlar aquí el caso de imagen no encontrada
            }

        } else {
            try {
                BufferedImage img = ImageIO.read(getClass().getResource("/resources/blue-cross-icon.png"));
                ImageIcon imagen = new ImageIcon(img);
                setText("");
                setIcon(imagen);
                
            } catch (Exception e) {
            }
        }
    }
}
