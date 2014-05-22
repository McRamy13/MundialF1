/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1.Renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
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
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Integer numNacionalidad = (Integer) table.getValueAt(row, 2);
        int españa = 1;
        Font myFont = new Font("Tahoma", Font.BOLD, 12);
        JLabel jLabel = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);        
        if (numNacionalidad == españa) {
            jLabel.setForeground(Color.red);
            jLabel.setFont(myFont);
        } else {
            jLabel.setForeground(Color.BLACK);
        }
        return jLabel;
    }

}
