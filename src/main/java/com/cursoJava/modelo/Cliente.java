package com.cursoJava.modelo;

public class Cliente {

    private String nombre;
    private String nif;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String nif, String direccion) {
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
    }

    public void metodoInit(){
        System.out.println("Se ha invocado al init de Cliente ...............");
    }

    public void metodoDestroy(){
        System.out.println("Se ha invocado al destroy de Cliente ...............");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + "nif=" + nif + "direccion=" + direccion + '}';
    }

}
