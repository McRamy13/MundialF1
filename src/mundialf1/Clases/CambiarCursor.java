/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1.Clases;

/**
 *
 * @author usuario
 */
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CambiarCursor extends JFrame {

    public Cursor CursorPrograma;
    public Cursor CursorBoton;
    public JButton btnCursor = new JButton("javadhc.blogspot.com");

    public CambiarCursor() {
        super("CAMBIAR CURSOR POR UNO PERSONALIZADO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

        ImageIcon ImagenPrograma = new ImageIcon("resources/blue-cross-icon.jpg");
        ImageIcon ImagenBoton = new ImageIcon("resources/blue-check-icon.jpg");

        Toolkit TK = Toolkit.getDefaultToolkit();

        this.CursorPrograma = TK.createCustomCursor(ImagenPrograma.getImage(), new Point(2, 2), "Cursor 01");
        this.CursorBoton = TK.createCustomCursor(ImagenBoton.getImage(), new Point(2, 2), "Cursor 02");

        this.add(this.btnCursor);
        this.btnCursor.setCursor(CursorBoton);
        this.setCursor(CursorPrograma);
    }


}
