package interfazestudiante;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registroestudiante.*;

public class Registro extends javax.swing.JFrame {
    RegistroEstudiante registro = MenuRegistro.getRegistro();
    DefaultTableModel modelo;
    int filaSeleccionada;
    public Registro() {
        initComponents();
        this.setSize(795, 370);
        filaSeleccionada = -1;
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Prim. apellido");
        modelo.addColumn("Seg. apellido");
        modelo.addColumn("Cédula");
        modelo.addColumn("Tomo");
        modelo.addColumn("Folio");
        modelo.addColumn("Año");
        modelo.addColumn("Num. título");
        modelo.addColumn("Posee título");
        
        ImageIcon imagenMenu = new ImageIcon("src/Imagenes/Menu.png");
        Icon iconoMenu = new ImageIcon(imagenMenu.getImage().getScaledInstance(labelMenu.getWidth(), labelMenu.getHeight(), Image.SCALE_DEFAULT));
        labelMenu.setIcon(iconoMenu);
        
        ImageIcon imagenRegistroEstudiantes = new ImageIcon("src/Imagenes/RegistroEstudiantes.jpg");
        Icon iconoRegistroEstudiantes = new ImageIcon(imagenRegistroEstudiantes.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(iconoRegistroEstudiantes);
        
        ImageIcon imagenGuardar = new ImageIcon("src/Imagenes/Guardar.png");
        Icon iconoGuardar = new ImageIcon(imagenGuardar.getImage().getScaledInstance(labelGuardar.getWidth(), labelGuardar.getHeight(), Image.SCALE_DEFAULT));
        labelGuardar.setIcon(iconoGuardar);
        
        
        
        this.setTitle("Registro");
        //ImageIcon imagenGuardar = new ImageIcon("src/Imagenes/Guardar.jpg");
        //Icon iconoGuardar = new ImageIcon(imagenGuardar.getImage().getScaledInstance(labelGuardar.getWidth(), labelGuardar.getHeight(), Image.SCALE_DEFAULT));
        //labelGuardar.setIcon(iconoGuardar);
        tablaEstudiantes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        numeroTitulo = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelPrimerApellido = new javax.swing.JLabel();
        labelSegundoApellido = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelAnno = new javax.swing.JLabel();
        labelTomo = new javax.swing.JLabel();
        labelFolio = new javax.swing.JLabel();
        labelNumeroTitulo = new javax.swing.JLabel();
        comboPoseeTitulo = new javax.swing.JComboBox<>();
        labelPoseeTitulo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        primerApellido = new javax.swing.JTextField();
        segundoApellido = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        tomo = new javax.swing.JTextField();
        folio = new javax.swing.JTextField();
        anno = new javax.swing.JTextField();
        botonAnnadir = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        labelGuardar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        labelMenu = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(numeroTitulo);
        numeroTitulo.setBounds(480, 60, 80, 20);

        labelNombre.setText("Nombre:");
        getContentPane().add(labelNombre);
        labelNombre.setBounds(10, 20, 80, 14);

        labelPrimerApellido.setText("Primer apellido:");
        getContentPane().add(labelPrimerApellido);
        labelPrimerApellido.setBounds(10, 60, 110, 14);

        labelSegundoApellido.setText("Segundo apellido:");
        getContentPane().add(labelSegundoApellido);
        labelSegundoApellido.setBounds(10, 120, 120, 14);

        labelCedula.setText("Cédula:");
        getContentPane().add(labelCedula);
        labelCedula.setBounds(230, 20, 60, 14);

        labelAnno.setText("Año:");
        getContentPane().add(labelAnno);
        labelAnno.setBounds(380, 20, 40, 14);

        labelTomo.setText("Tomo:");
        getContentPane().add(labelTomo);
        labelTomo.setBounds(230, 60, 50, 14);

        labelFolio.setText("Folio:");
        getContentPane().add(labelFolio);
        labelFolio.setBounds(230, 120, 50, 14);

        labelNumeroTitulo.setText("Número de título:");
        getContentPane().add(labelNumeroTitulo);
        labelNumeroTitulo.setBounds(380, 60, 140, 14);

        comboPoseeTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        getContentPane().add(comboPoseeTitulo);
        comboPoseeTitulo.setBounds(450, 120, 38, 20);

        labelPoseeTitulo.setText("Posee título:");
        getContentPane().add(labelPoseeTitulo);
        labelPoseeTitulo.setBounds(380, 120, 100, 14);
        getContentPane().add(nombre);
        nombre.setBounds(80, 20, 80, 20);
        getContentPane().add(primerApellido);
        primerApellido.setBounds(100, 60, 80, 20);
        getContentPane().add(segundoApellido);
        segundoApellido.setBounds(110, 120, 80, 20);
        getContentPane().add(cedula);
        cedula.setBounds(280, 20, 77, 20);
        getContentPane().add(tomo);
        tomo.setBounds(280, 60, 78, 20);
        getContentPane().add(folio);
        folio.setBounds(280, 120, 77, 20);
        getContentPane().add(anno);
        anno.setBounds(430, 20, 80, 20);

        botonAnnadir.setText("Añadir");
        botonAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnnadirActionPerformed(evt);
            }
        });
        getContentPane().add(botonAnnadir);
        botonAnnadir.setBounds(58, 175, 80, 23);

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(botonNuevo);
        botonNuevo.setBounds(179, 175, 80, 23);

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar);
        botonModificar.setBounds(299, 175, 90, 23);

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar);
        botonEliminar.setBounds(420, 175, 80, 23);

        labelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(labelGuardar);
        labelGuardar.setBounds(670, 120, 110, 100);

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaEstudiantes);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 250, 780, 90);

        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });
        getContentPane().add(labelMenu);
        labelMenu.setBounds(670, 0, 110, 100);
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 780, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnnadirActionPerformed
        if(nombre.getText().equals("") || primerApellido.getText().equals("") || segundoApellido.getText().equals("")
          || cedula.getText().equals("") || tomo.getText().equals("") || folio.getText().equals("")
          || anno.getText().equals("") || numeroTitulo.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "Ha dejado el espacio en blanco", "Error", 0);
        }
        
        else{
        try{
            
        Integer.parseInt(anno.getText());
        Integer.parseInt(cedula.getText());
        Integer.parseInt(tomo.getText());
        Integer.parseInt(folio.getText());
        Integer.parseInt(numeroTitulo.getText());
        boolean poseeTitulo = comboPoseeTitulo.getSelectedItem().toString().equals("Sí");
        String Dato[] = new String[9];
        Dato[0] = nombre.getText();
        Dato[1] = primerApellido.getText();
        Dato[2] = segundoApellido.getText();
        Dato[3] = cedula.getText();
        Dato[4] = tomo.getText();
        Dato[5] = folio.getText();
        Dato[6] = anno.getText();
        Dato[7] = numeroTitulo.getText();
        Dato[8] = comboPoseeTitulo.getSelectedItem().toString();
        modelo.addRow(Dato);
        registro.crearEstudiante(nombre.getText(), primerApellido.getText(), segundoApellido.getText(), cedula.getText(), tomo.getText(), 
                                 anno.getText(), folio.getText(), poseeTitulo, numeroTitulo.getText());
        Registro abrir = new Registro ();
        abrir.setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(this, "El estudiante se ha añadido correctamente", "Información", 1);

        }
        catch(Exception e){
           JOptionPane.showMessageDialog(this, "Los espacios 'Año', 'Cédula', 'Folio', 'Tomo' y 'Número de título' deben ser números", "Error", 0);
        }
        }
        
    }//GEN-LAST:event_botonAnnadirActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        nombre.setText("");
        primerApellido.setText("");
        segundoApellido.setText("");
        cedula.setText("");
        tomo.setText("");
        folio.setText("");
        anno.setText("");
        numeroTitulo.setText("");
        nombre.requestFocus();
        
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if(filaSeleccionada < 0)
            JOptionPane.showMessageDialog(this, "No ha seleccionado un estudiante", "Error", 0);
        
        else if(nombre.getText().equals("") || primerApellido.getText().equals("") || segundoApellido.getText().equals("")
          || cedula.getText().equals("") || tomo.getText().equals("") || folio.getText().equals("")
          || anno.getText().equals("") || numeroTitulo.getText().equals("")){
            
            
            JOptionPane.showMessageDialog(this, "Ha dejado el espacio en blanco", "Error", 0);
        } 
        
        else if(filaSeleccionada >= 0){
         try{
            
            Integer.parseInt(anno.getText());
            Integer.parseInt(cedula.getText());
            Integer.parseInt(tomo.getText());
            Integer.parseInt(folio.getText());
            Integer.parseInt(numeroTitulo.getText());
            boolean poseeTitulo = comboPoseeTitulo.getSelectedItem().toString().equals("Sí");
            registro.editarEstudiante(nombre.getText(), primerApellido.getText(), segundoApellido.getText(), cedula.getText(), tomo.getText(), 
                                 anno.getText(), folio.getText(), poseeTitulo, numeroTitulo.getText(), filaSeleccionada);
            Registro abrir = new Registro ();
            abrir.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "El estudiante se ha modificado correctamente", "Información", 1);    
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(this, "Los espacios 'Año', 'Cédula', 'Folio', 'Tomo' y 'Número de título' deben ser números", "Error", 0);
         }
        }
        
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void tablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudiantesMouseClicked
       filaSeleccionada = tablaEstudiantes.getSelectedRow();
        
       nombre.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 0).toString());
       primerApellido.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 1).toString());
       segundoApellido.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 2).toString());
       cedula.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 3).toString());
       tomo.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 4).toString());
       folio.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 5).toString());
       anno.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 6).toString());
       numeroTitulo.setText(tablaEstudiantes.getValueAt(filaSeleccionada, 7).toString());
       comboPoseeTitulo.removeAllItems();
       if(tablaEstudiantes.getValueAt(filaSeleccionada, 8).toString().equals("Sí")){
           comboPoseeTitulo.addItem("Sí");
           comboPoseeTitulo.addItem("No");
       }
            
       else{
           comboPoseeTitulo.addItem("No");
           comboPoseeTitulo.addItem("Sí");
       }
        
    }//GEN-LAST:event_tablaEstudiantesMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(filaSeleccionada >= 0){
            modelo.removeRow(filaSeleccionada);
            registro.eliminarEstudiante(filaSeleccionada);
            Registro abrir = new Registro ();
            abrir.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "El estudiante se ha eliminado correctamente", "Información", 1);
        }
        
        else
           JOptionPane.showMessageDialog(this, "No ha seleccionado un estudiante", "Error", 0); 
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ArrayList<Estudiante> estudiantes = registro.getEstudiantes();
        for(Estudiante e: estudiantes){
           boolean poseeTitulo = comboPoseeTitulo.getSelectedItem().toString().equals("Sí");
        String Dato[] = new String[9];
        String datoPoseeTitulo = "";
        if(e.isPoseeTitulo())
            datoPoseeTitulo = "Sí";
        else
            datoPoseeTitulo = "No";
            
        Dato[0] = e.getNombre();
        Dato[1] = e.getPrimerApellido();
        Dato[2] = e.getSegundoApellido();
        Dato[3] = e.getCedula();
        Dato[4] = e.getTomo();
        Dato[5] = e.getFolio();
        Dato[6] = e.getAnno();
        Dato[7] = e.getNumeroDeTitulo();
        Dato[8] = datoPoseeTitulo;
        modelo.addRow(Dato); 
        }
    }//GEN-LAST:event_formWindowOpened

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
        registro.Escribir();
        MenuRegistro abrir = new MenuRegistro();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelMenuMouseClicked

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        registro.Escribir();
        JOptionPane.showMessageDialog(this, "Los datos se han guardado correctamente", "Información", 1);
    }//GEN-LAST:event_labelGuardarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anno;
    private javax.swing.JButton botonAnnadir;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> comboPoseeTitulo;
    private javax.swing.JTextField folio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAnno;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumeroTitulo;
    private javax.swing.JLabel labelPoseeTitulo;
    private javax.swing.JLabel labelPrimerApellido;
    private javax.swing.JLabel labelSegundoApellido;
    private javax.swing.JLabel labelTomo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroTitulo;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTextField tomo;
    // End of variables declaration//GEN-END:variables
}
