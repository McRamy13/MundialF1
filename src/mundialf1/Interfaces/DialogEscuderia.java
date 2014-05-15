/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1.Interfaces;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import mundialf1.Clases.Escuderia;
import mundialf1.Renderer.EscuderiaListRenderer;

/**
 *
 * @author usuario
 */
public class DialogEscuderia extends javax.swing.JDialog {

    /**
     * Creates new form DialogEscudería
     */
    private Connection conexion = null;
    private final String DB_HOST = "localhost";
    private final String DB_NAME = "MundialF1";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "";
    private Escuderia escuderiaSelect = null;
    /**
     * Creates new form dialogListaProductos
     */
    public DialogEscuderia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        conectarBD();
        loadList();
    }

    public Escuderia getEscuderiaSelect() {
        return escuderiaSelect;
    }

    private void conectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://" + DB_HOST + "/" + DB_NAME,
                    DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se ha encontrado la librería MySQL", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (InstantiationException ex) {
            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se ha podido conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (SQLException ex) {
            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se ha podido conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void loadList() {
        //Crear un modelo para la lista
        DefaultListModel listModel = new DefaultListModel();
        jList1.setModel(listModel);
        jList1.setCellRenderer(new EscuderiaListRenderer());
        //Asignar el renderer para mostrar los objetos como se desea
        //jList1.setCellRenderer();
        

//        try {
//            Statement stmt = conexion.createStatement();
//            ResultSet rsProductos = stmt.executeQuery(
//                    "SELECT * FROM Escuderia");
//        } catch (SQLException ex) {
//            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
        try {
            Statement sentenciaSQL;
            sentenciaSQL = conexion.createStatement();
            ResultSet resultados = sentenciaSQL.executeQuery("SELECT * FROM Escuderia");
            while (resultados.next()) {
                
                int codEscuderia = resultados.getInt("cod_escuderia");
                
                String nomEscuderia = resultados.getString("nombre_escuderia");

                BigDecimal presupuesto = resultados.getBigDecimal("presupuesto");

                Date fechaCreacion = resultados.getDate("fecha_creacion");
                
                
                Escuderia escuderia = new Escuderia(codEscuderia,nomEscuderia,presupuesto,fechaCreacion);
                listModel.addElement(escuderia);
                //Mundial mundial = new Mundial(nomEscuderia,presupuesto,fechaCreacion);
               // listModel.addElement(mundial);
                System.out.println(nomEscuderia);
                System.out.println(presupuesto);
                System.out.println(fechaCreacion);
            }
            
            System.out.println(listModel.getSize());

            
            
        } catch (SQLException ex) {
            Logger.getLogger(DialogEscuderia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Se ha producido un error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //Guardar el producto que está seleccionado en la lista
        escuderiaSelect = (Escuderia)jList1.getSelectedValue();
        //Cerrar la ventana de diálogo
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogEscuderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEscuderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEscuderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEscuderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogEscuderia dialog = new DialogEscuderia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
