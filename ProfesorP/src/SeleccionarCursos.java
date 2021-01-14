import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SeleccionarCursos extends javax.swing.JFrame {
    Logica l=new Logica(); 
    DefaultTableModel modelo; 
        
    public SeleccionarCursos() {
        initComponents();
        Color fondo=new Color(166, 240, 92);
        Color boton=new Color(252, 67, 182);
        this.getContentPane().setBackground(fondo);
        this.btnSeleccionar.setBackground(boton);
        this.btnCancelar.setBackground(boton);
        this.btnVolver.setBackground(boton);
        mostrarCursosP(); 
    }
    
    public void mostrarCursosP(){
        modelo=l.mostrarCursos();
        Tabla.setModel(modelo);
    }
    
    public void buscarCursosP(String buscar){
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        lblBusqueda = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SeleccionarCursos");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setText("Nombre: ");

        lblNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNom.setText("Adriana Pérez");

        lblMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMatricula.setText("Matrícula:");

        lblMat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMat.setText("Prof-003-1132");

        Tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setFocusable(false);
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        lblBusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBusqueda.setText("Ingrese el nombre de la materia a buscar: ");

        txtBusqueda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        btnSeleccionar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSeleccionar.setText("Seleccionar curso");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(lblMat))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lblNom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(lblMat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnCancelar)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        int filaSel=Tabla.getSelectedRow();
        int id; 
        String nom;
        String sem;
        int grup;
        String turno;
        String hora;
        String salon;
        String plantel;
        if(filaSel>0){
            id=Integer.parseInt(String.valueOf(Tabla.getValueAt(filaSel, 0)));
            nom=String.valueOf(Tabla.getValueAt(filaSel, 1));
            sem=String.valueOf(Tabla.getValueAt(filaSel, 2));
            grup=Integer.parseInt(String.valueOf(Tabla.getValueAt(filaSel, 3))); ;
            turno=String.valueOf(Tabla.getValueAt(filaSel, 4));
            hora=String.valueOf(Tabla.getValueAt(filaSel, 5));
            salon=String.valueOf(Tabla.getValueAt(filaSel, 6));
            plantel=String.valueOf(Tabla.getValueAt(filaSel, 7));
            guardarBD(id,nom,sem,grup,turno,hora,salon,plantel);
        }else
            JOptionPane.showMessageDialog(this,"No se pueden agregar cursos porque no ha seleccionado ninguno");
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JOptionPane.showMessageDialog(this,"No se han agregado cursos.");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new ProfesoresPrincipal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        buscarCursosP(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased
    
    public void guardarBD(int i,String n,String s,int g,String t,String h,String sa,String pl){
        String user="postgres"; 
        String pwd="1234567890"; 
        String url="jdbc:postgresql://localhost:5432/miscursosp"; 
        try{
            Class.forName ("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(url,user,pwd);
            PreparedStatement ps=con.prepareStatement("INSERT INTO miscursosp(id,nom,sem,grup,turno,hora,salon,plantel) VALUES(?,?,?,?,?,?,?,?)"); 
            ps.setInt(1,i);
            ps.setString(2,""+n);
            ps.setString(3,""+s);
            ps.setInt(4,g);
            ps.setString(5,""+t);
            ps.setString(6,""+h);
            ps.setString(7,""+sa);
            ps.setString(8,""+pl);
            ps.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Curso seleccionado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al seleccionar curso "+ex.getMessage()); 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
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