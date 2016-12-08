package registroestudiante;

import java.io.Serializable;

public class Estudiante implements Comparable<Estudiante>, Serializable{
  private String nombre;
  private String primerApellido;
  private String segundoApellido;
  private String tomo;
  private String anno;
  private String folio;
  private String cedula;
  private String numeroDeTitulo;
  private boolean poseeTitulo;

  public Estudiante(String nombre, String primerApellido, 
                    String segundoApellido, String cedula, String tomo, 
                    String anno, String folio, boolean poseeTitulo, String numeroDeTitulo) {
    this.nombre = nombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    this.cedula = cedula;
    this.tomo = tomo;
    this.anno = anno;
    this.folio = folio;
    this.poseeTitulo = poseeTitulo;
    this.numeroDeTitulo = numeroDeTitulo;
  }
  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTomo() {
        return tomo;
    }

    public void setTomo(String tomo) {
        this.tomo = tomo;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public boolean isPoseeTitulo() {
        return poseeTitulo;
    }

    public void setPoseeTitulo(boolean poseeTitulo) {
        this.poseeTitulo = poseeTitulo;
    }

    public String getNumeroDeTitulo() {
        return numeroDeTitulo;
    }

    public void setNumeroDeTitulo(String numeroDeTitulo) {
        this.numeroDeTitulo = numeroDeTitulo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public int compareTo(Estudiante o) {
        int resultado = primerApellido.compareTo(o.getPrimerApellido())*-1;
        if(resultado == 0)
            return segundoApellido.compareTo(o.getSegundoApellido());
        
        else
            return primerApellido.compareTo(o.getPrimerApellido());
        
    }
  
  

  
}

