/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1;

import java.text.NumberFormat;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class PresupuestoRenderer  extends DefaultTableCellRenderer { 

    public PresupuestoRenderer() { 
        setHorizontalAlignment(SwingConstants.RIGHT); 
    } 

    @Override 
    public void setValue(Object aValue) { 
        Object result = aValue; 
        if ((aValue != null) && (aValue instanceof Number)) { 
            Number numberValue = (Number) aValue; 
            NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
            result = formatter.format(numberValue.doubleValue()); 
        } 
        super.setValue(result); 
    } 

}
