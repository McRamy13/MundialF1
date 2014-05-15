/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1.Renderer;

import javax.swing.table.DefaultTableCellRenderer;
import mundialf1.Clases.Escuderia;

/**
 *
 * @author usuario
 */
public class EscuderiaRenderer extends DefaultTableCellRenderer {

    @Override
    protected void setValue(Object value) {
        String nombreEscuderia = "";
        //Comprobar que no es un valor nulo, y asegurar que se trata de un objeto Producto
        if (value != null && (value instanceof Escuderia)) {
            //Convertir el valor recibido al tipo Producto
            Escuderia escuderia = (Escuderia) value;
            //Obtener el nombre del producto
            nombreEscuderia = escuderia.getNombreEscuderia();
        }
        //Asignar el nombre del producto como valor de la celda
        setText(nombreEscuderia);
    }

}
