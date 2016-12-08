package registroestudiante;
import java.util.ArrayList;
import interfazestudiante.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
public class RegistroEstudiante {
    private ArrayList<Estudiante> estudiantes;
    static MenuRegistro abrir;
    public static void main(String[] args) {
        abrir = new MenuRegistro ();
        abrir.setVisible(true);
    }

    public RegistroEstudiante() {
        estudiantes = new ArrayList<>();
        
    }
    
    
    
    //crearEstudiante: método que se encarga de agregar un nuevo estudiante al registro (ArrayList)
    //Entradas: nombre, primer apellido, segundo apellido, tomo, año y folio
    //Salidas: ninguna
    //Restricicones: ninguna
    public void crearEstudiante(String nombre, String primerApellido,
                                String segundoApellido, String cedula, String tomo,
                                String anno, String folio, boolean poseeTitulo, String numeroDeTitulo){
        
        Estudiante estudiante = new Estudiante(nombre, primerApellido, segundoApellido, cedula,
                                               tomo, anno, folio, poseeTitulo, numeroDeTitulo);
        estudiantes.add(estudiante);
            
    }
    
    //editarEstudiante: método encargado de editar los datos de los estudiantes en registro (ArrayList)
    //Entradas: nombre, primer apellido, segundo apellido, tomo, año, folio e índice
    //Salidas: ninguna
    //Restricciones: ninguna
    public void editarEstudiante(String nombre, String primerApellido,
                                 String segundoApellido, String cedula, String tomo,
                                 String anno, String folio, boolean poseeTitulo, 
                                 String numeroDeTitulo, int indice){
       
       this.estudiantes.get(indice).setNombre(nombre);
       this.estudiantes.get(indice).setPrimerApellido(primerApellido);
       this.estudiantes.get(indice).setSegundoApellido(segundoApellido);
       this.estudiantes.get(indice).setTomo(tomo);
       this.estudiantes.get(indice).setAnno(anno);
       this.estudiantes.get(indice).setFolio(folio);
       this.estudiantes.get(indice).setPoseeTitulo(poseeTitulo);
       this.estudiantes.get(indice).setNumeroDeTitulo(numeroDeTitulo);
    }
    
    //eliminarEstudiante: método que se encarga de eliminar a un estudiante del registro
    //Entradas: índice del arraylist
    //Salidas: ninguna
    //Restricciones: ninguna
    public void eliminarEstudiante(int indice){
        estudiantes.remove(indice);
    }
    
    //getEstudiantes: método que devuelve todos el registro de estudiantes
    //Entradas: ninguna
    //Salidas: arraylist con los estudiantes
    //Restricciones: ninguna
    
    public ArrayList<Estudiante> getEstudiantes(){
        Collections.sort(estudiantes);
        return estudiantes;
    }
    
    
    //getEstudiantesConTitulo: método que devuelve los estudiantes que poseen título
    //Entradas: ninguna
    //Salidas: arraylist con los estudiantes que poseen título
    //Restricciones: ninguna
    public ArrayList<Estudiante> getEstudiantesConTitulo(){
        ArrayList<Estudiante> estudiantesConTitulo = new ArrayList<>();
        for(Estudiante e: estudiantes){
            if(e.isPoseeTitulo())
                estudiantesConTitulo.add(e);
        }
        Collections.sort(estudiantesConTitulo);
        return estudiantesConTitulo;
    }
    
    //getEstudiantesSinTitulo: método que devuelve los estudiantes que no poseen título
    //Entradas: ninguna
    //Salidas: arraylist con los estudiantes que no poseen título
    //Restricciones: ninguna
    public ArrayList<Estudiante> getEstudiantesSinTitulo(){
        ArrayList<Estudiante> estudiantesSinTitulo = new ArrayList<>();
        for(Estudiante e: estudiantes){
            if(!e.isPoseeTitulo())
                estudiantesSinTitulo.add(e);
        }
        Collections.sort(estudiantesSinTitulo);
        return estudiantesSinTitulo;
    }
    
    
    //getEstudiantePorCedula: método que se encarga de devolver, si es que existe, un estudiante
    //de acuerdo a una cédula brindada
    //Entradas: cedula
    //Salidas: objeto de tipo Estudiante
    //Restricciones: ninguna
    public Estudiante getEstudiantePorCedula(String cedula){
        for(Estudiante e: estudiantes){
            if(e.getCedula().equals(cedula))
                return e;
        }
        return null;
        
    }
    
    
    //getEstudiantesPorAnno: método que se encarga de devolver, si es que existe, los estudiantes
    //que posean un título dado un año por el usuario
    //Entradas: año
    //Salidas: arraylist con los estudiantes que pertenecen al año dado por el usuario
    //Restricciones: ninguna
    public ArrayList<Estudiante> getEstudiantesPorAnno(String anno){
       ArrayList<Estudiante> estudiantesAnno = new ArrayList<>();
       for(Estudiante e: estudiantes){
           if(e.getAnno().equals(anno))
               estudiantesAnno.add(e);
       }
       if(estudiantesAnno.isEmpty())
           return null;
       else{
           Collections.sort(estudiantesAnno);
           return estudiantesAnno;
       }
    }
    
    
    
    //Escribir: método que se encarga de guardar los datos del registro
    //Entradas: ninguna
    //Salidas: ninguna
    //Restricciones: ninguna
    
    public void Escribir()
    {
        try{
            FileOutputStream salidaEscritura;
            ObjectOutputStream entradaEscritura;
            salidaEscritura = new FileOutputStream("Estudiantes");
            entradaEscritura = new ObjectOutputStream(salidaEscritura);
                
            
         entradaEscritura.writeObject(estudiantes);
         entradaEscritura.close();
         salidaEscritura.close();
            System.out.println("Se ha guardado con éxito");
       }catch(IOException ioe){
            System.out.println("Se ha generado un error al guardar");
        }
    }
    
    
    //Leer: método que se encarga de cargar los datos del registro
    //Entradas: ninguna
    //Salidas: ninguna
    //Restricciones: ninguna
    public void Leer()
    {
      try
        {
            FileInputStream entradaLectura;
            ObjectInputStream salidaLectura;
            entradaLectura = new FileInputStream("Estudiantes");
            salidaLectura = new ObjectInputStream(entradaLectura); //Asignar a todos los arraylist
            estudiantes = (ArrayList) salidaLectura.readObject();
              
          
            entradaLectura.close();
            salidaLectura.close();
            
            System.out.println("Se ha leído con éxito");
         }catch(IOException ioe){
          }catch(ClassNotFoundException c){
             System.out.println("ha ocurrido un error al cargar los archivos");
          }  
    }
    
    
   
    
}
