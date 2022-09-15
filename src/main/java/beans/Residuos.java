/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author servi
 */
public class Residuos {
    	private int id_residuo;
	private String tipo;
        private int precio_kg;

    public Residuos(int id_residuo, String tipo, int precio_kg) {
        this.id_residuo = id_residuo;
        this.tipo = tipo;
        this.precio_kg = precio_kg;
    }

    public int getId_residuo() {
        return id_residuo;
    }

    public void setId_residuo(int id_residuo) {
        this.id_residuo = id_residuo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio_kg() {
        return precio_kg;
    }

    public void setPrecio_kg(int precio_kg) {
        this.precio_kg = precio_kg;
    }

    @Override
    public String toString() {
        return "Residuos{" + "id_residuo=" + id_residuo + ", tipo=" + tipo + ", precio_kg=" + precio_kg + '}';
    }
        
        
    
}
