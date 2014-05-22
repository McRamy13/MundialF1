/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1.Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author usuario
 */
public class GestionMovimientos {

    String nombreFichero = "movimientos.txt";
    BufferedWriter bw = null;

    public void escribirArchivo(String texto) {
        try {
    //Crear un objeto BufferedWriter. Si ya existe el fichero, 
            //  se borra automáticamente su contenido anterior.
            bw = new BufferedWriter(new FileWriter(nombreFichero,true));
            
            //Escrbir en el fichero el texto con un salto de línea
            bw.write(texto + "\r\n");
        } catch (Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                //Cerrar el buffer
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }

}
