/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class NacionalidadRenderer extends DefaultTableCellRenderer {

    Image image;

    public NacionalidadRenderer() {
        setHorizontalAlignment(SwingConstants.LEFT);

    }
    private final int ESPAÑA = 1;
    private final int REINO_UNIDO = 2;
    private final int ALEMANIA = 3;
    private final int AUSTRALIA = 4;
    private final int FILANDIA = 5;
    private final int DINAMARCA = 6;
    private final int MEXICO = 7;
    private final int BRASIL = 8;

    @Override
    public void setValue(Object aValue) {
        
        Integer result = (Integer)aValue;
        if ((aValue != null) && (aValue instanceof Integer)) {
           
          
        switch (result) {
            case ESPAÑA:
                setText("España");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/spain-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;

            case REINO_UNIDO:
                setText("Reino Unido");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/United-Kingdom-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case ALEMANIA:
                setText("Alemania");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Germany-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;

            case AUSTRALIA:
                setText("Australia");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Australia-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case FILANDIA:
                setText("Finlandia");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Finland-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;

            case DINAMARCA:
                setText("Dinamarca");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Denmark-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case MEXICO:
                setText("México");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Mexico-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case BRASIL:
                setText("Brasil");
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/Brazil-flag-icon.png"));
                    ImageIcon imagen = new ImageIcon(img);
                    setIcon(imagen);

                } catch (Exception e) {
                }
                break;

        }
    }
    }
}
