package interfazestudiante;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Consulta extends javax.swing.JFrame {

    public Consulta() {
        initComponents();
        this.setTitle("Consulta");
        this.setSize(400, 330);
        
        ImageIcon imagenRegistroEstudiantes = new ImageIcon("src/Imagenes/RegistroEstudiantes.jpg");
        Icon iconoRegistroEstudiantes = new ImageIcon(imagenRegistroEstudiantes.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(iconoRegistroEstudiantes);
        
        ImageIcon imagenMenu = new ImageIcon("src/Imagenes/Menu.png");
        Icon iconoMenu = new ImageIcon(imagenMenu.getImage().getScaledInstance(labelMenu.getWidth(), labelMenu.getHeight(), Image.SCALE_DEFAULT));
        labelMenu.setIcon(iconoMenu);
        
        ImageIcon imagenGeneral = new ImageIcon("src/Imagenes/ConsultaVentana.png");
        Icon iconoGeneral = new ImageIcon(imagenGeneral.getImage().getScaledInstance(labelGeneral.getWidth(), labelGeneral.getHeight(), Image.SCALE_DEFAULT));
        labelGeneral.setIcon(iconoGeneral);
        
        ImageIcon imagenCedula = new ImageIcon("src/Imagenes/ConsultaVentana.png");
        Icon iconoCedula = new ImageIcon(imagenCedula.getImage().getScaledInstance(labelCedula1.getWidth(), labelCedula1.getHeight(), Image.SCALE_DEFAULT));
        labelCedula1.setIcon(iconoCedula);
        
        ImageIcon imagenConTitulo = new ImageIcon("src/Imagenes/ConsultaVentana.png");
        Icon iconoConTitulo = new ImageIcon(imagenConTitulo.getImage().getScaledInstance(labelConTitulo1.getWidth(), labelConTitulo1.getHeight(), Image.SCALE_DEFAULT));
        labelConTitulo1.setIcon(iconoConTitulo);
        
        ImageIcon imagenSinTitulo = new ImageIcon("src/Imagenes/ConsultaVentana.png");
        Icon iconoSinTitulo = new ImageIcon(imagenSinTitulo.getImage().getScaledInstance(labelSinTitulo1.getWidth(), labelSinTitulo1.getHeight(), Image.SCALE_DEFAULT));
        labelSinTitulo1.setIcon(iconoSinTitulo);
        
        ImageIcon imagenAnno = new ImageIcon("src/Imagenes/ConsultaVentana.png");
        Icon iconoAnno = new ImageIcon(imagenAnno.getImage().getScaledInstance(labelAnno1.getWidth(), labelAnno1.getHeight(), Image.SCALE_DEFAULT));
        labelAnno1.setIcon(iconoAnno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        labelMenu = new javax.swing.JLabel();
        labelConsultaConTitulo = new javax.swing.JLabel();
        labelConsultaCedula = new javax.swing.JLabel();
        labelConsultaGenera = new javax.swing.JLabel();
        labelConsultaAnno = new javax.swing.JLabel();
        labelConsultaSinTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelConTitulo = new javax.swing.JLabel();
        labelSinTitulo = new javax.swing.JLabel();
        labelAnno = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelGeneral = new javax.swing.JLabel();
        labelCedula1 = new javax.swing.JLabel();
        labelConTitulo1 = new javax.swing.JLabel();
        labelSinTitulo1 = new javax.swing.JLabel();
        labelAnno1 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });
        getContentPane().add(labelMenu);
        labelMenu.setBounds(300, 210, 89, 82);

        labelConsultaConTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labelConsultaConTitulo.setForeground(new java.awt.Color(0, 204, 204));
        labelConsultaConTitulo.setText("Consulta de estudiantes con título");
        getContentPane().add(labelConsultaConTitulo);
        labelConsultaConTitulo.setBounds(30, 90, 200, 15);

        labelConsultaCedula.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labelConsultaCedula.setForeground(new java.awt.Color(0, 204, 204));
        labelConsultaCedula.setText("Consulta por cédula");
        getContentPane().add(labelConsultaCedula);
        labelConsultaCedula.setBounds(30, 50, 120, 15);

        labelConsultaGenera.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labelConsultaGenera.setForeground(new java.awt.Color(0, 204, 204));
        labelConsultaGenera.setText("Consulta general");
        getContentPane().add(labelConsultaGenera);
        labelConsultaGenera.setBounds(30, 10, 110, 15);

        labelConsultaAnno.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labelConsultaAnno.setForeground(new java.awt.Color(0, 204, 204));
        labelConsultaAnno.setText("Consulta por año de creación del título");
        getContentPane().add(labelConsultaAnno);
        labelConsultaAnno.setBounds(30, 170, 230, 15);

        labelConsultaSinTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        labelConsultaSinTitulo.setForeground(new java.awt.Color(0, 204, 204));
        labelConsultaSinTitulo.setText("Consulta de estudiantes sin título");
        getContentPane().add(labelConsultaSinTitulo);
        labelConsultaSinTitulo.setBounds(30, 130, 200, 15);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 10, 0, 30);

        labelConTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConTituloMouseClicked(evt);
            }
        });
        getContentPane().add(labelConTitulo);
        labelConTitulo.setBounds(240, 80, 0, 30);

        labelSinTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSinTituloMouseClicked(evt);
            }
        });
        getContentPane().add(labelSinTitulo);
        labelSinTitulo.setBounds(240, 120, 0, 30);

        labelAnno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAnnoMouseClicked(evt);
            }
        });
        getContentPane().add(labelAnno);
        labelAnno.setBounds(260, 160, 0, 30);

        labelCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCedulaMouseClicked(evt);
            }
        });
        getContentPane().add(labelCedula);
        labelCedula.setBounds(160, 50, 0, 30);

        labelGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGeneralMouseClicked(evt);
            }
        });
        getContentPane().add(labelGeneral);
        labelGeneral.setBounds(160, 0, 50, 40);

        labelCedula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCedula1MouseClicked(evt);
            }
        });
        getContentPane().add(labelCedula1);
        labelCedula1.setBounds(160, 40, 50, 40);

        labelConTitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConTitulo1MouseClicked(evt);
            }
        });
        getContentPane().add(labelConTitulo1);
        labelConTitulo1.setBounds(240, 60, 50, 40);

        labelSinTitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSinTitulo1MouseClicked(evt);
            }
        });
        getContentPane().add(labelSinTitulo1);
        labelSinTitulo1.setBounds(240, 110, 50, 40);

        labelAnno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAnno1MouseClicked(evt);
            }
        });
        getContentPane().add(labelAnno1);
        labelAnno1.setBounds(270, 154, 50, 40);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
        MenuRegistro abrir = new MenuRegistro();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelMenuMouseClicked

    private void labelCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCedulaMouseClicked
        ConsultaCedula abrir = new ConsultaCedula();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelCedulaMouseClicked

    private void labelConTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConTituloMouseClicked
        ConsultaConTitulo abrir = new ConsultaConTitulo();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelConTituloMouseClicked

    private void labelSinTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSinTituloMouseClicked
        ConsultaSinTitulo abrir = new ConsultaSinTitulo();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelSinTituloMouseClicked

    private void labelAnnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAnnoMouseClicked
        ConsultaAnno abrir = new ConsultaAnno();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelAnnoMouseClicked

    private void labelGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGeneralMouseClicked
        ConsultaGeneral abrir = new ConsultaGeneral();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelGeneralMouseClicked

    private void labelCedula1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCedula1MouseClicked
        ConsultaCedula abrir = new ConsultaCedula();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelCedula1MouseClicked

    private void labelConTitulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConTitulo1MouseClicked
        ConsultaConTitulo abrir = new ConsultaConTitulo();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelConTitulo1MouseClicked

    private void labelSinTitulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSinTitulo1MouseClicked
        ConsultaSinTitulo abrir = new ConsultaSinTitulo();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelSinTitulo1MouseClicked

    private void labelAnno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAnno1MouseClicked
        ConsultaAnno abrir = new ConsultaAnno();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelAnno1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAnno;
    private javax.swing.JLabel labelAnno1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedula1;
    private javax.swing.JLabel labelConTitulo;
    private javax.swing.JLabel labelConTitulo1;
    private javax.swing.JLabel labelConsultaAnno;
    private javax.swing.JLabel labelConsultaCedula;
    private javax.swing.JLabel labelConsultaConTitulo;
    private javax.swing.JLabel labelConsultaGenera;
    private javax.swing.JLabel labelConsultaSinTitulo;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelGeneral;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelSinTitulo;
    private javax.swing.JLabel labelSinTitulo1;
    // End of variables declaration//GEN-END:variables
}
