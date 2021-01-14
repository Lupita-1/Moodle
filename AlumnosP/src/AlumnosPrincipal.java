
import java.awt.Color;

public class AlumnosPrincipal extends javax.swing.JFrame {
    public AlumnosPrincipal() {
        initComponents();
        Color fondo=new Color(144, 241, 163);
        Color boton=new Color(144, 241, 224);
        this.getContentPane().setBackground(fondo);
        this.btnInscribir.setBackground(boton);
        this.btnSalir.setBackground(boton);
        this.btnVer.setBackground(boton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblMat = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnInscribir = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlumnosPrincipal");
        setName("AlumnosPrincipal"); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNom.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNom.setText("Luis Jiménez Sánchez");

        lblMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMatricula.setText("Matrícula:");

        lblMat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMat.setText("16-003-9876");

        lblImg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alumno.jpg"))); // NOI18N
        lblImg.setText("jLabel1");

        btnInscribir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnInscribir.setText("Inscribir Cursos");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnVer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnVer.setText("Ver cursos");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInscribir)
                        .addGap(32, 32, 32)
                        .addComponent(btnVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblMatricula))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNom)
                            .addComponent(lblMat))
                        .addGap(18, 18, 18)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(lblNom))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatricula)
                            .addComponent(lblMat))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnVer)
                    .addComponent(btnSalir))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        InscribirCursos inscribir=new InscribirCursos(); 
        inscribir.setVisible(true);
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        MisCursos mc=new MisCursos(); 
        mc.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}