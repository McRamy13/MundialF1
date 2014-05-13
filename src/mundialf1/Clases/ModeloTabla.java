/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundialf1.Clases;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import mundialf1.Interfaces.Mundial;
//import javax.swing.table.AbstractTimport mundialf1.Mimport un.Interfacemundialf1.Mundial;
//sdial;
//ableModel;

/**
 *
 * @author usuario
 */
public class ModeloTabla extends AbstractTableModel{
    
    List<Mundial> list;
    public void setDataList(List<Mundial> list){
        this.list = list;
    }
    @Override
    public int getRowCount() {
        return list.size();
        
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Mundial mundial = list.get(rowIndex);
       switch(columnIndex){
           case 0:
               return mundial.getNombrePiloto();
           case 1:
               return mundial.getFechaNac();
           case 2: 
               return mundial.getNacionalidad();
           case 3:
               return mundial.getPuntosTotales();
           case 4:
               return mundial.getPuntosUltimaCarrera();
           default:
               return null;
       }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0:
               return "Nombre piloto";
           case 1:
               return "Fecha Nacimiento";
           case 2: 
               return "Nacionalidad";
           case 3:
               return "Puntos Totales";
           case 4:
               return "Puntúa en la última carrera";
           default:
               return "";
       }
    }
    
}
