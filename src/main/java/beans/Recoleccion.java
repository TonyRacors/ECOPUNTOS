/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;

/**
 *
 * @author servi
 */
public class Recoleccion {
    private int n_solicitud;
    private Date fecha;
    private int id_residuo;
    private int id_usuario;
    private int cantidad_kg;
    private int venta_material;
    private int ecoPuntos_ganados;

    public Recoleccion(int n_solicitud, Date fecha, int id_residuo, int id_usuario, int cantidad_kg, int venta_material, int ecoPuntos_ganados) {
        this.n_solicitud = n_solicitud;
        this.fecha = fecha;
        this.id_residuo = id_residuo;
        this.id_usuario = id_usuario;
        this.cantidad_kg = cantidad_kg;
        this.venta_material = venta_material;
        this.ecoPuntos_ganados = ecoPuntos_ganados;
    }

    public int getN_solicitud() {
        return n_solicitud;
    }

    public void setN_solicitud(int n_solicitud) {
        this.n_solicitud = n_solicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_residuo() {
        return id_residuo;
    }

    public void setId_residuo(int id_residuo) {
        this.id_residuo = id_residuo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getCantidad_kg() {
        return cantidad_kg;
    }

    public void setCantidad_kg(int cantidad_kg) {
        this.cantidad_kg = cantidad_kg;
    }

    public int getVenta_material() {
        return venta_material;
    }

    public void setVenta_material(int venta_material) {
        this.venta_material = venta_material;
    }

    public int getEcoPuntos_ganados() {
        return ecoPuntos_ganados;
    }

    public void setEcoPuntos_ganados(int ecoPuntos_ganados) {
        this.ecoPuntos_ganados = ecoPuntos_ganados;
    }

    @Override
    public String toString() {
        return "Recoleccion{" + "n_solicitud=" + n_solicitud + ", fecha=" + fecha + ", id_residuo=" + id_residuo + ", id_usuario=" + id_usuario + ", cantidad_kg=" + cantidad_kg + ", venta_material=" + venta_material + ", ecoPuntos_ganados=" + ecoPuntos_ganados + '}';
    }

    
    
    
}
