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
    private String username;
    private String contrasena;
    private String email;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String tipo_usuario;
    private int total_ecopuntos;
    private int saldo_ecopuntos;

    public Usuarios(String username, String contrasena, String email, String nombre, String apellido, String direccion, String telefono, String tipo_usuario, int total_ecopuntos, int saldo_ecopuntos) {
        this.username = username;
        this.contrasena = contrasena;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
        this.total_ecopuntos = total_ecopuntos;
        this.saldo_ecopuntos = saldo_ecopuntos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
        return "Usuarios{" + "username=" + username + ", contrasena=" + contrasena + ", email=" + email + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo_usuario=" + tipo_usuario + ", total_ecopuntos=" + total_ecopuntos + ", saldo_ecopuntos=" + saldo_ecopuntos + '}';
    }

   
    
    
    
}
