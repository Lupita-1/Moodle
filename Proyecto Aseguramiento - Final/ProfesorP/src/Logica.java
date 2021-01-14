import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logica {
    String [] titulos={"ID","NOMBRE","SEMESTRE","GRUPO","TURNO","HORA","SALON","PLANTEL"}; 
    String [] columnas=new String[8]; 
    DefaultTableModel modelo=new DefaultTableModel(null,titulos); 
    String sql;
    Connection cn=null;
    PreparedStatement ps=null; 
    ResultSet rs=null;
    
    public DefaultTableModel mostrarCursos(){    
        sql="SELECT * FROM cursosp"; 
        try{
            cn=Conexion.conectarP(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("turno");
                columnas[5]=rs.getString("hora"); 
                columnas[6]=rs.getString("salon"); 
                columnas[7]=rs.getString("plantel"); 
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
        String sql="SELECT * FROM cursosp WHERE nom LIKE '%"+buscar+"%'"; 
        try{
            cn=Conexion.conectarP(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("turno");
                columnas[5]=rs.getString("hora"); 
                columnas[6]=rs.getString("salon"); 
                columnas[7]=rs.getString("plantel"); 
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
        sql="SELECT * FROM miscursosp"; 
        try{
            cn=Conexion.conectarMisCursosP(); 
            ps=cn.prepareStatement(sql); 
            rs=ps.executeQuery(); 
            while(rs.next()){
                columnas[0]=rs.getString("id"); 
                columnas[1]=rs.getString("nom"); 
                columnas[2]=rs.getString("sem"); 
                columnas[3]=rs.getString("grup"); 
                columnas[4]=rs.getString("turno");
                columnas[5]=rs.getString("hora"); 
                columnas[6]=rs.getString("salon"); 
                columnas[7]=rs.getString("plantel"); 
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