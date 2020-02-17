package com.cursoJava.modelo;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private double importe;
    private Date fecha;

    public Factura() {
    }

    public Factura(Cliente cliente, double importe, Date fecha) {
        this.cliente = cliente;
        this.importe = importe;
        this.fecha = fecha;
    }

    public void metodoInit(){
        System.out.println("Se ha invocado al init de Factura ...............");
    }

    public void metodoDestroy(){
        System.out.println("Se ha invocado al destroy de Factura ...............");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + " cliente=" + cliente + " importe=" + importe + " fecha=" + fecha + '}';
    }

}
