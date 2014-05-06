/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class DateRenderer extends DefaultTableCellRenderer {

    public DateRenderer() {
        setHorizontalAlignment(SwingConstants.LEFT);
    }

    @Override
    public void setValue(Object aValue) {
        Object result = aValue;
        if ((aValue != null) && (aValue instanceof Date)) {
            Date dateValue = (Date) aValue;
            DateFormat formatofecha = DateFormat.getDateInstance(DateFormat.SHORT);
            result = formatofecha.format(dateValue);
        }
        super.setValue(result);
        
        
    }

}
