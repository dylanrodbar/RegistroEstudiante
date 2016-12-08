package interfazestudiante;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import registroestudiante.ColorCelda;
import registroestudiante.Estudiante;
import registroestudiante.RegistroEstudiante;

public class ConsultaSinTitulo extends javax.swing.JFrame {
    RegistroEstudiante registro = MenuRegistro.getRegistro();
    DefaultTableModel modelo;
    public ConsultaSinTitulo() {
        initComponents();
        this.setSize(795, 370);
        this.setTitle("Consulta de estudiantes sin título");
        
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        labelMenu = new javax.swing.JLabel();
        labelConsulta = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEstudiantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 113, 779, 91);

        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });
        getContentPane().add(labelMenu);
        labelMenu.setBounds(587, 37, 89, 70);

        labelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(labelConsulta);
        labelConsulta.setBounds(461, 37, 89, 70);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 790, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<Estudiante> estudiantes = registro.getEstudiantesSinTitulo();
        for(Estudiante e: estudiantes){
           
        String Dato[] = new String[9];
        String datoPoseeTitulo = "";
        if(e.isPoseeTitulo())
            datoPoseeTitulo = "Si";
        else
            datoPoseeTitulo = "No";
            
        Dato[0] = datoPoseeTitulo;
        Dato[1] = e.getNombre();
        Dato[2] = e.getPrimerApellido();
        Dato[3] = e.getSegundoApellido();
        Dato[4] = e.getCedula();
        Dato[5] = e.getTomo();
        Dato[6] = e.getFolio();
        Dato[7] = e.getAnno();
        Dato[8] = e.getNumeroDeTitulo();
        modelo.addRow(Dato); 
        }
        tablaEstudiantes.setDefaultRenderer (Object.class, new ColorCelda());
    }//GEN-LAST:event_formWindowOpened

    private void labelConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultaMouseClicked
        Consulta abrir = new Consulta();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelConsultaMouseClicked

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
        MenuRegistro abrir = new MenuRegistro();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelMenuMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSinTitulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
