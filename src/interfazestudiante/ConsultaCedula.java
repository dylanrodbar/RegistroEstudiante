package interfazestudiante;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registroestudiante.Estudiante;
import registroestudiante.RegistroEstudiante;
import registroestudiante.*;

public class ConsultaCedula extends javax.swing.JFrame {
    RegistroEstudiante registro = MenuRegistro.getRegistro();
    DefaultTableModel modelo;
    public ConsultaCedula() {
        initComponents();
        this.setSize(795, 370);
        this.setTitle("Consulta de estudiantes con título");
        
        
        ImageIcon imagenRegistroEstudiantes = new ImageIcon("src/Imagenes/RegistroEstudiantes.jpg");
        Icon iconoRegistroEstudiantes = new ImageIcon(imagenRegistroEstudiantes.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(iconoRegistroEstudiantes);
        
        ImageIcon imagenConsulta = new ImageIcon("src/Imagenes/Consulta.png");
        Icon iconoConsulta = new ImageIcon(imagenConsulta.getImage().getScaledInstance(labelConsulta.getWidth(), labelConsulta.getHeight(), Image.SCALE_DEFAULT));
        labelConsulta.setIcon(iconoConsulta);
        
        ImageIcon imagenMenu = new ImageIcon("src/Imagenes/Menu.png");
        Icon iconoMenu = new ImageIcon(imagenMenu.getImage().getScaledInstance(labelMenu.getWidth(), labelMenu.getHeight(), Image.SCALE_DEFAULT));
        labelMenu.setIcon(iconoMenu);
        
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Posee título");
        modelo.addColumn("Nombre");
        modelo.addColumn("Prim. apellido");
        modelo.addColumn("Seg. apellido");
        modelo.addColumn("Cédula");
        modelo.addColumn("Tomo");
        modelo.addColumn("Folio");
        modelo.addColumn("Año");
        modelo.addColumn("Num. título");
        
        tablaEstudiantes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        cedula = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(labelConsulta);
        labelConsulta.setBounds(556, 23, 89, 70);

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEstudiantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 99, 781, 91);
        getContentPane().add(cedula);
        cedula.setBounds(65, 53, 95, 20);

        labelCedula.setText("Cédula:");
        getContentPane().add(labelCedula);
        labelCedula.setBounds(10, 56, 51, 14);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar);
        botonBuscar.setBounds(178, 52, 65, 23);

        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });
        getContentPane().add(labelMenu);
        labelMenu.setBounds(682, 23, 89, 70);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 790, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultaMouseClicked
        Consulta abrir = new Consulta();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelConsultaMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if(cedula.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Ha dejado el espacio en blanco", "Error", 0);
        else{
            Estudiante estudiante = registro.getEstudiantePorCedula(cedula.getText());
            if(estudiante == null)
                JOptionPane.showMessageDialog(this, "La cédula no se encuentra en el sistema", "Error", 0);
            else{
                for(int n = 0; n<tablaEstudiantes.getRowCount(); n++)
                    modelo.removeRow(n);
                String Dato[] = new String[9];
                String datoPoseeTitulo = "";
                if(estudiante.isPoseeTitulo())
                    datoPoseeTitulo = "Si";
                else
                    datoPoseeTitulo = "No";

                Dato[0] = datoPoseeTitulo;
                Dato[1] = estudiante.getNombre();
                Dato[2] = estudiante.getPrimerApellido();
                Dato[3] = estudiante.getSegundoApellido();
                Dato[4] = estudiante.getCedula();
                Dato[5] = estudiante.getTomo();
                Dato[6] = estudiante.getFolio();
                Dato[7] = estudiante.getAnno();
                Dato[8] = estudiante.getNumeroDeTitulo();
                
                modelo.addRow(Dato);
                tablaEstudiantes.setDefaultRenderer (Object.class, new ColorCelda());
            }
                
        }
            
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
        MenuRegistro abrir = new MenuRegistro();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelMenuMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCedula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCedula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
