
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuarios;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController{
    @Override
    public String login(String email, String contrasena){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        String sql = "SELECT FROM usuarios WHERE email='"+email+"' AND contrasena = '"+contrasena+"'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id_usuario = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                int telefono = rs.getInt("telefono");
                String tipo_usuario = rs.getString("tipo_usuario");
                int total_ecopuntos = rs.getInt("total_ecopuntos");
                int saldo_ecopuntos = rs.getInt("saldo_ecopuntos");
                Usuarios usuario =new Usuarios(id_usuario, email, contrasena, nombre, apellido,
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
}