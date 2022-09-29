
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuarios;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController{
    @Override
    public String login(String username, String contrasena){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM usuarios WHERE username='"+username+"' AND contrasena = '"+contrasena+"'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String email = rs.getString("email");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String tipo_usuario = rs.getString("tipo_usuario");
                int total_ecopuntos = rs.getInt("total_ecopuntos");
                int saldo_ecopuntos = rs.getInt("saldo_ecopuntos");
                Usuarios usuario =new Usuarios(username,  contrasena, email, nombre, apellido,
                        direccion, telefono, tipo_usuario, total_ecopuntos, saldo_ecopuntos);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
        return "false";
    }
    @Override
    public String register(String username, String email, String contrasena, String nombre,
            String apellido, String direccion,String telefono, String tipo_usuario,int total_ecopuntos,
            int saldo_ecopuntos) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuarios values('" + username + "', '" + contrasena + "', '" + email
                + "', '" + nombre + "', '" + apellido + "', '" + direccion + "', '" + telefono + "', '"+tipo_usuario+"',"+total_ecopuntos+", "+saldo_ecopuntos+ ")";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuarios usuario = new Usuarios( username, contrasena,  email, nombre, apellido, direccion, telefono, tipo_usuario, total_ecopuntos, saldo_ecopuntos);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
}
