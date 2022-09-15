
package test;
import beans.Residuos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
public class OperacionesBD {
    
    public static void main(String[] args) {
        listarResiduos();
        
    }
    public static void  actualizarResiduo(int id_residuo,int precio_kg){
        
        DBConnection con = new DBConnection();
        
        String sql="UPDATE Residuos SET precio_kg='"+precio_kg+" ' WHERE id_residuo="+id_residuo;
        
          
        try{
            Statement st =con.getConnection().createStatement();
            st.executeUpdate(sql);       
      } catch (Exception ex){
          System.out.println(ex.getMessage());
      } finally {
            con.desconectar();
        }
    }
    
    
    public static void listarResiduos(){
        
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM residuos";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id_residuo = rs.getInt("id_residuo");
                String tipo = rs.getString("tipo");
                int precio_kg = rs.getInt("precio_kg");
                Residuos residuos = new Residuos(id_residuo,tipo,precio_kg);
                System.out.println(residuos.toString());
            }
            
            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
}


