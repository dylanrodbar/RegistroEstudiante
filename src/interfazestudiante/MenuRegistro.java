package interfazestudiante;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import registroestudiante.*;

public class MenuRegistro extends javax.swing.JFrame {
    private static RegistroEstudiante registro;
    public MenuRegistro() {
        initComponents();
        registro = new RegistroEstudiante();
        registro.Leer();
        this.setSize(400, 330);
        this.setTitle("Registro de estudiantes");
        ImageIcon imagenRegistroEstudiantes = new ImageIcon("src/Imagenes/RegistroEstudiantes.jpg");
        Icon iconoRegistroEstudiantes = new ImageIcon(imagenRegistroEstudiantes.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(iconoRegistroEstudiantes);
        
        
        ImageIcon imagenRegistro = new ImageIcon("src/Imagenes/Registro.png");
        Icon iconoRegistro = new ImageIcon(imagenRegistro.getImage().getScaledInstance(labelRegistro.getWidth(), labelRegistro.getHeight(), Image.SCALE_DEFAULT));
        labelRegistro.setIcon(iconoRegistro);
        
        
        ImageIcon imagenConsulta = new ImageIcon("src/Imagenes/Consulta.png");
        Icon iconoConsulta = new ImageIcon(imagenConsulta.getImage().getScaledInstance(labelConsulta.getWidth(), labelConsulta.getHeight(), Image.SCALE_DEFAULT));
        labelConsulta.setIcon(iconoConsulta);
        
        ImageIcon imagenLibroSalir = new ImageIcon("src/Imagenes/Libro.png");
        Icon iconoLibroSalir = new ImageIcon(imagenLibroSalir.getImage().getScaledInstance(labelLibroSalir.getWidth(), labelLibroSalir.getHeight(), Image.SCALE_DEFAULT));
        labelLibroSalir.setIcon(iconoLibroSalir);
        
        this.repaint();
    }
    
    public static RegistroEstudiante getRegistro(){
        return MenuRegistro.registro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelConsulta = new javax.swing.JLabel();
        labelLibroSalir = new javax.swing.JLabel();
        labelRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelConsulta.setBackground(new java.awt.Color(255, 255, 255));
        labelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(labelConsulta);
        labelConsulta.setBounds(250, 180, 130, 100);

        labelLibroSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLibroSalirMouseClicked(evt);
            }
        });
        getContentPane().add(labelLibroSalir);
        labelLibroSalir.setBounds(10, 190, 100, 90);

        labelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistroMouseClicked(evt);
            }
        });
        getContentPane().add(labelRegistro);
        labelRegistro.setBounds(120, 180, 130, 100);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("REGISTRO DE ESTUDIANTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 340, 20);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Bienvenido(a), este registro pretende guardar los datos más básicos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 360, 20);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("relacionados con la asignación de un título a algún estudiante del cole-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 360, 14);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("gio. Por lo tanto, guardar dichos datos será más fácil y accesible para");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 350, 14);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("los usuarios de esta aplicación.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 170, 14);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 400, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroMouseClicked
        Registro abrir = new Registro ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelRegistroMouseClicked

    private void labelConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultaMouseClicked
        Consulta abrir = new Consulta ();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelConsultaMouseClicked

    private void labelLibroSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLibroSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelLibroSalirMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLibroSalir;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
