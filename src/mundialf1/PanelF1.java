/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialf1;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class PanelF1 extends javax.swing.JPanel {

    /**
     * Creates new form PanelF1
     */
    private final int ALONSO = 1;
    private final int HAMILTON = 2;
    private final int ROSBERG = 3;
    private final int VETTEL = 4;
    private final int HULKEMBERG = 5;
    private final int RICCIARDO = 6;
    private final int BOTTAS = 7;
    private final int BUTTON = 8;
    private final int MAGNUSSEN = 9;
    private final int PEREZ = 10;
    private final int MASSA = 11;
    private final int RAIKKONEN = 12;
    private Mundial mundial;

    public PanelF1() {
        initComponents();
    }

    public Mundial getMundial() {
        return mundial;
    }

    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }

    public void showData() {
        //Poner los datos de la misma manera. 
        jTextFieldIdPiloto.setText(String.valueOf(mundial.getIdPiloto()));
        jTextFieldNombre.setText(mundial.getNombrePiloto());
        jTextFieldNacionalidad.setText(String.valueOf(mundial.getNacionalidad()));
        jDateChooser1.setDate(mundial.getFechaNac());
        jTextFieldPuntTotales.setText(String.valueOf(mundial.getPuntosTotales()));
        jTextFieldPuntosUltCarrera.setText(String.valueOf(mundial.getPuntosUltimaCarrera()));
        jTextFieldCodEscuderia.setText(String.valueOf(mundial.getCodEscuderia()));
        jTextAreaObservaciones.setText(mundial.getObservaciones());

        int idPiloto = mundial.getIdPiloto();

        switch (idPiloto) {
            case ALONSO:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/alonsog.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case HAMILTON:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/hamiltong.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case ROSBERG:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/rosbergg.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case VETTEL:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/vettelg.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case HULKEMBERG:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/hulkenbergg.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case RICCIARDO:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/ricciardog.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case BOTTAS:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/bottasg.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case BUTTON:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/buttong.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case MAGNUSSEN:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/magnusseng.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case PEREZ:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/perezg.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case MASSA:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/massag.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
            case RAIKKONEN:
                try {
                    BufferedImage img = ImageIO.read(getClass().getResource("/resources/kimig.jpg"));
                    ImageIcon imagen = new ImageIcon(img);
                    jLabel2.setIcon(imagen);

                } catch (Exception e) {
                }
                break;
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
        jLabelIdPiloto = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelNacionalidad = new javax.swing.JLabel();
        jLabelFechaNac = new javax.swing.JLabel();
        jLabelPuntosUltimaCarrera = new javax.swing.JLabel();
        jLabelPuntosTotales = new javax.swing.JLabel();
        jLabelCodEscuderia = new javax.swing.JLabel();
        jTextFieldIdPiloto = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNacionalidad = new javax.swing.JTextField();
        jTextFieldPuntosUltCarrera = new javax.swing.JTextField();
        jTextFieldPuntTotales = new javax.swing.JTextField();
        jTextFieldCodEscuderia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservaciones = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabelIdPiloto.setText("Id Piloto:");

        jLabelNombre.setText("Nombre:");

        jLabelNacionalidad.setText("Nacionalidad:");

        jLabelFechaNac.setText("Fecha de nacimiento:");

        jLabelPuntosUltimaCarrera.setText("Puntúa en última carrera:");

        jLabelPuntosTotales.setText("Puntos totales:");

        jLabelCodEscuderia.setText("Código de escudería");

        jLabel1.setText("Observaciones:");

        jTextAreaObservaciones.setColumns(20);
        jTextAreaObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdPiloto)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelNacionalidad)
                            .addComponent(jLabelFechaNac)
                            .addComponent(jLabelPuntosTotales)
                            .addComponent(jLabelCodEscuderia))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPuntosUltimaCarrera))
                            .addComponent(jTextFieldIdPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPuntTotales, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPuntosUltCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 129, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdPiloto)
                            .addComponent(jTextFieldIdPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNacionalidad)
                                    .addComponent(jTextFieldNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelFechaNac))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPuntosTotales)
                            .addComponent(jTextFieldPuntTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodEscuderia)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodEscuderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPuntosUltimaCarrera)
                        .addComponent(jTextFieldPuntosUltCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 202, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodEscuderia;
    private javax.swing.JLabel jLabelFechaNac;
    private javax.swing.JLabel jLabelIdPiloto;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPuntosTotales;
    private javax.swing.JLabel jLabelPuntosUltimaCarrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservaciones;
    private javax.swing.JTextField jTextFieldCodEscuderia;
    private javax.swing.JTextField jTextFieldIdPiloto;
    private javax.swing.JTextField jTextFieldNacionalidad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPuntTotales;
    private javax.swing.JTextField jTextFieldPuntosUltCarrera;
    // End of variables declaration//GEN-END:variables
}
