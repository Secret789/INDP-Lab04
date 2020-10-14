package com.example.indp_lab04;

public class Estudiante {
    public int cui;
    public String apellidos;
    public String nombres;
    public Estudiante(int cui, String nombres, String apellidos){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cui = cui;
    }
    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
