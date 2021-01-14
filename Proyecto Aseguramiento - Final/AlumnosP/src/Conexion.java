import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection con; 
    private static boolean conectado=false;
    private static String user="postgres"; 
    private static String pwd="1234567890"; 
    private static String url="jdbc:postgresql://localhost:5432/cursos"; 
    private static String url2="jdbc:postgresql://localhost:5432/miscursos"; 
    
    public static Connection conectar(){
        try{
            if(conectado==false){
                Class.forName ("org.postgresql.Driver");
                con=DriverManager.getConnection(url,user,pwd); 
            }
            return con; 
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+ex.getMessage());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+ex.getMessage());
        }
        return con;
    }
    
    public static Connection conectarMisCursos(){
        try{
            if(conectado==false){
                Class.forName ("org.postgresql.Driver");
                con=DriverManager.getConnection(url2,user,pwd); 
            }
            return con; 
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+ex.getMessage());
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+ex.getMessage());
        }
        return con;
    }
}