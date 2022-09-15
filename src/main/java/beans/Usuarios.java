/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author servi
 */
public class Usuarios {
    private int id_usuario;
    private String email;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String tipo_usuario;
    private int total_ecopuntos;
    private int saldo_ecopuntos;

    public Usuarios(int id_usuario, String email, String contrasena, String nombre, String apellido, String direccion, int telefono, String tipo_usuario, int total_ecopuntos, int saldo_ecopuntos) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
        this.total_ecopuntos = total_ecopuntos;
        this.saldo_ecopuntos = saldo_ecopuntos;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getTotal_ecopuntos() {
        return total_ecopuntos;
    }

    public void setTotal_ecopuntos(int total_ecopuntos) {
        this.total_ecopuntos = total_ecopuntos;
    }

    public int getSaldo_ecopuntos() {
        return saldo_ecopuntos;
    }

    public void setSaldo_ecopuntos(int saldo_ecopuntos) {
        this.saldo_ecopuntos = saldo_ecopuntos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id_usuario=" + id_usuario + ", email=" + email + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo_usuario=" + tipo_usuario + ", total_ecopuntos=" + total_ecopuntos + ", saldo_ecopuntos=" + saldo_ecopuntos + '}';
    }
    
    
    
}
