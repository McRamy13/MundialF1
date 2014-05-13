/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1.Renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class NombreRenderer extends DefaultTableCellRenderer { 
    public NombreRenderer() { 
        setHorizontalAlignment(SwingConstants.LEFT); 
    } 

    @Override 
    public void setValue(Object aValue) { 
        
        String nombreFernando = "Fernando Alonso Díaz";
        String result = String.valueOf(aValue); 
        if (result.equals(nombreFernando)) { 
          Font myFont = new Font("Tahoma", Font.BOLD, 12);
            setForeground(Color.red);
            setFont(myFont);
        } else {
            setForeground(Color.BLACK);
        }
        super.setValue(result); 
    } 
    
    

}