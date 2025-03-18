package Proyecto;

import java.util.Arrays;

public class Juego {


    String nombre = "";

    String genero = "";

    int nota;

    int anyoLanzamiento;

    String consola = "";

    String desarollador = "";

    
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getGenero() {
        return genero;
    }

    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public int getNota() {
        return nota;
    }

    
    public void setNota(int nota) {
        this.nota = nota;
    }

    
    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

   
    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    
    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

   
    public String getDesarollador() {
        return desarollador;
    }

    public void setDesarollador(String desarollador) {
        this.desarollador = desarollador;
    }

    
    public Juego(String nombre, String genero, int nota, int anyoLanzamiento, String consola, String desarollador) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
        this.anyoLanzamiento = anyoLanzamiento;
        this.consola = consola;
        this.desarollador = desarollador;
    }

    
   
  
}

