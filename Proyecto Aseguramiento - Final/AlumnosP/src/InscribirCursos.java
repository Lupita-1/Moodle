import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InscribirCursos extends javax.swing.JFrame {
    Logica l=new Logica(); 
    DefaultTableModel modelo; 
    
    public InscribirCursos() {
        initComponents();
        Color fondo=new Color(205, 103, 252);
        Color boton=new Color(141, 219, 255);
        this.getContentPane().setBackground(fondo);
        this.btnInscribir.setBackground(boton);
        this.btnCancelar.setBackground(boton);
        this.btnVolver.setBackground(boton);
        mostrarCursos(); 
    }
    
    public void mostrarCursos(){
        modelo=l.mostrarCursos();
        Tabla.setModel(modelo);
    }
    
    public void buscarCursos(String buscar){
        modelo=l.buscarCursos(buscar); 
        Tabla.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblMat = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnInscribir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InscirbirCursos");
        setName("InscibirCursos"); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNom.setText("Luis Jiménez Sánchez");

        lblMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMatricula.setText("Matrícula:");

        lblMat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMat.setText("16-003-9876");

        lblBusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBusqueda.setText("Ingrese el nombre de la materia a buscar: ");

        txtBusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        Tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int f, int c){
                return false;
            }
        };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setFocusable(false);
        Tabla.setName("Tabla"); // NOI18N
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        btnInscribir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnInscribir.setText("Inscribir Cursos");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnVolver.setText("Volver a principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblMatricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMat)
                    .addComponent(lblNom))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBusqueda)
                        .addGap(1, 1, 1)
                        .addComponent(txtBusqueda))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInscribir)
                            .addGap(46, 46, 46)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblNom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMat)
                    .addComponent(lblMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnCancelar)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new AlumnosPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        buscarCursos(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(this,"No se han agregado cursos.");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        int filaSel=Tabla.getSelectedRow();
        int id; 
        String nom;
        String sem;
        int grup;
        String prof;
        String turno;
        String hora;
        String salon;
        String plantel;
        if(filaSel>0){
            id=Integer.parseInt(String.valueOf(Tabla.getValueAt(filaSel, 0)));
            nom=String.valueOf(Tabla.getValueAt(filaSel, 1));
            sem=String.valueOf(Tabla.getValueAt(filaSel, 2));
            grup=Integer.parseInt(String.valueOf(Tabla.getValueAt(filaSel, 3))); ;
            prof=String.valueOf(Tabla.getValueAt(filaSel, 4));
            turno=String.valueOf(Tabla.getValueAt(filaSel, 5));
            hora=String.valueOf(Tabla.getValueAt(filaSel, 6));
            salon=String.valueOf(Tabla.getValueAt(filaSel, 7));
            plantel=String.valueOf(Tabla.getValueAt(filaSel, 8));
            guardarBD(id,nom,sem,grup,prof,turno,hora,salon,plantel);
        }else
            JOptionPane.showMessageDialog(this,"No se pueden agregar cursos porque no ha seleccionado ninguno");
    }//GEN-LAST:event_btnInscribirActionPerformed

    public void guardarBD(int i,String n,String s,int g,String p,String t,String h,String sa,String pl){
        String user="postgres"; 
        String pwd="1234567890"; 
        String url="jdbc:postgresql://localhost:5432/miscursos"; 
        try{
            Class.forName ("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,user,pwd);
            PreparedStatement ps=con.prepareStatement("INSERT INTO miscursos(id,nom,sem,grup,prof,turno,hora,salon,plantel) VALUES(?,?,?,?,?,?,?,?,?)"); 
            ps.setInt(1,i);
            ps.setString(2,""+n);
            ps.setString(3,""+s);
            ps.setInt(4,g);
            ps.setString(5,""+p);
            ps.setString(6,""+t);
            ps.setString(7,""+h);
            ps.setString(8,""+sa);
            ps.setString(9,""+pl);
            ps.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Curso inscrito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al inscribir curso "+ex.getMessage()); 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscribirCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}