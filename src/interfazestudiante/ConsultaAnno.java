package interfazestudiante;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registroestudiante.ColorCelda;
import registroestudiante.Estudiante;
import registroestudiante.RegistroEstudiante;

public class ConsultaAnno extends javax.swing.JFrame {
    RegistroEstudiante registro = MenuRegistro.getRegistro();
    DefaultTableModel modelo;
    public ConsultaAnno() {
        initComponents();
        this.setSize(795, 370);
        this.setTitle("Consulta por año de creación del título");
        
        
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

        labelMenu = new javax.swing.JLabel();
        labelConsulta = new javax.swing.JLabel();
        labelAnno = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        anno = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });
        getContentPane().add(labelMenu);
        labelMenu.setBounds(636, 49, 89, 70);

        labelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultaMouseClicked(evt);
            }
        });
        getContentPane().add(labelConsulta);
        labelConsulta.setBounds(510, 49, 89, 70);

        labelAnno.setText("Año:");
        getContentPane().add(labelAnno);
        labelAnno.setBounds(10, 100, 51, 14);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar);
        botonBuscar.setBounds(178, 96, 65, 23);

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEstudiantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 151, 771, 91);
        getContentPane().add(anno);
        anno.setBounds(65, 97, 95, 20);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 790, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if(anno.getText().equals(""))
        JOptionPane.showMessageDialog(this, "Ha dejado el espacio en blanco", "Error", 0);
        else{
            ArrayList<Estudiante> estudiantesAnno = registro.getEstudiantesPorAnno(anno.getText());
            if(estudiantesAnno == null)
            JOptionPane.showMessageDialog(this, "No existen estudiantes registrados en el año digitado", "Error", 0);
            else{
                for(int n = 0; n<tablaEstudiantes.getRowCount(); n++)
                    modelo.removeRow(n);
                for(Estudiante estudiante: estudiantesAnno){
                String datoPoseeTitulo = "";
                if(estudiante.isPoseeTitulo())
                datoPoseeTitulo = "Si";
                else
                datoPoseeTitulo = "No";

                String Dato[] = new String[9];
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
                }
                tablaEstudiantes.setDefaultRenderer (Object.class, new ColorCelda());
            }

        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAnno().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anno;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAnno;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
