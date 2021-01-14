import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logica {
    public DefaultTableModel mostrarCursos(){
        String [] titulos={"ID","NOMBRE","SEMESTRE","GRUPO","PROFESOR","TURNO","HORA","SALON","PLANTEL"}; 
        String [] columnas=new String[9]; 
        DefaultTableModel modelo=new DefaultTableModel(null,titulos); 
        String sql="SELECT * FROM cursos"; 
        Connection cn=null;
        PreparedStatement ps=null; 
        ResultSet rs=null;
        try{
            cn=Conexion.conectar(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("prof"); 
                columnas[5]=rs.getString("turno");
                columnas[6]=rs.getString("hora"); 
                columnas[7]=rs.getString("salon"); 
                columnas[8]=rs.getString("plantel"); 
                modelo.addRow(columnas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
        finally{
            try{
                if(rs!=null)
                    rs.close();
                if(ps!=null)
                    ps.close();
                if(cn!=null)
                    cn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        return modelo; 
    }
    
    public DefaultTableModel buscarCursos(String buscar){
        String [] titulos={"ID","NOMBRE","SEMESTRE","GRUPO","PROFESOR","TURNO","HORA","SALON","PLANTEL"}; 
        String [] columnas=new String[9]; 
        DefaultTableModel modelo=new DefaultTableModel(null,titulos); 
        String sql="SELECT * FROM cursos WHERE nom LIKE '%"+buscar+"%'"; 
        Connection cn=null;
        PreparedStatement ps=null; 
        ResultSet rs=null;
        try{
            cn=Conexion.conectar(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("prof"); 
                columnas[5]=rs.getString("turno");
                columnas[6]=rs.getString("hora"); 
                columnas[7]=rs.getString("salon"); 
                columnas[8]=rs.getString("plantel"); 
                modelo.addRow(columnas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
        finally{
            try{
                if(rs!=null)
                    rs.close();
                if(ps!=null)
                    ps.close();
                if(cn!=null)
                    cn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        return modelo;
    }
    
    public DefaultTableModel mostrarMisCursos(){
        String [] titulos={"ID","NOMBRE","SEMESTRE","GRUPO","PROFESOR","TURNO","HORA","SALON","PLANTEL"}; 
        String [] columnas=new String[9]; 
        DefaultTableModel modelo=new DefaultTableModel(null,titulos); 
        String sql="SELECT * FROM miscursos"; 
        Connection cn=null;
        PreparedStatement ps=null; 
        ResultSet rs=null;
        try{
            cn=Conexion.conectarMisCursos(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("prof"); 
                columnas[5]=rs.getString("turno");
                columnas[6]=rs.getString("hora"); 
                columnas[7]=rs.getString("salon"); 
                columnas[8]=rs.getString("plantel"); 
                modelo.addRow(columnas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar "+ex.getMessage());
        }
        finally{
            try{
                if(rs!=null)
                    rs.close();
                if(ps!=null)
                    ps.close();
                if(cn!=null)
                    cn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        return modelo; 
    }
}