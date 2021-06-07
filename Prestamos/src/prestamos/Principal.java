/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;



/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class Principal extends javax.swing.JFrame {

    private Object poder;
    private final Cliente cliente;
    private final HacerPrestamo prestamos;
    private final GrillaCliente gcliente;
    private final GrillaChofer gchofer;
    private final ConsultaPrestamos BusqHv;
    private final DetallePagos depagos;
//    private final ConsultaPrestamos consultas;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.cliente = new Cliente(this, true);
        this.prestamos = new HacerPrestamo(this, true);
        this.gcliente = new GrillaCliente(this, true);
        this.gchofer = new GrillaChofer(this, true);
        this.BusqHv = new ConsultaPrestamos(this, true);
        this.depagos = new DetallePagos(this, true);
//        this.consultas= new ConsultaPrestamos(this, true);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        BusquedaHv = new javax.swing.JMenuItem();
        BusquedaHv1 = new javax.swing.JMenuItem();
        BusquedaHv2 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afhce curso activo fijo1.jpg"))); // NOI18N
        jDesktopPane2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 560);

        jPanel1.add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "1", "2", "3" }));

        jMenu4.setText("Inicio");

        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem1.setText("Hacer prestamo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        BusquedaHv.setText("Deudores");
        BusquedaHv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaHvActionPerformed(evt);
            }
        });
        jMenu4.add(BusquedaHv);

        BusquedaHv1.setText("Consultas");
        BusquedaHv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaHv1ActionPerformed(evt);
            }
        });
        jMenu4.add(BusquedaHv1);

        BusquedaHv2.setText("Operaciones");
        BusquedaHv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaHv2ActionPerformed(evt);
            }
        });
        jMenu4.add(BusquedaHv2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 1023, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 532, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.poder = this.cliente;
        this.cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.poder = this.prestamos;
        this.prestamos.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BusquedaHvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaHvActionPerformed
        // TODO add your handling code here:
        this.poder = this.prestamos;
        this.BusqHv.setVisible(true);
        this.BusqHv.llenarTabla();
    }//GEN-LAST:event_BusquedaHvActionPerformed

    private void BusquedaHv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaHv1ActionPerformed
        // TODO add your handling code here:
        this.poder = this.BusqHv;
        this.BusqHv.setVisible(true);
    }//GEN-LAST:event_BusquedaHv1ActionPerformed

    private void BusquedaHv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaHv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaHv2ActionPerformed

//    protected void setHistoriaVehiculosVisibility(boolean prendido){
//        this.cliente.setVisible(prendido);
//    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BusquedaHv;
    private javax.swing.JMenuItem BusquedaHv1;
    private javax.swing.JMenuItem BusquedaHv2;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void getGrillaChofer(String toString, int s) {
        this.gchofer.alimentarGrillaChofer(toString,s);
        this.gchofer.setVisible(true);
    }

    void prestamos(Object nombre, Object identificacion) {
        this.prestamos.setCliente(nombre, identificacion);
    }

    void gChoferAhv(String identificacion, String nombres) {
        this.prestamos.obtenerDChofer(identificacion,nombres);
    }

    void setGrillaClienteVisibility(boolean b, int i) {
        this.gcliente.quienPide(i);
        this.gcliente.setVisible(b);
    }

    void setGrillaHistoriaVCli(Object identificacion, Object nombre, Object apodo) {
        this.BusqHv.setCliente(nombre, identificacion,apodo);
    }

    void gChoferABhv(String identificacion, String nombres) {
        this.BusqHv.obtenerDChofer(identificacion,nombres);
    }

    void mostrarHv(String idCliente) {
        this.depagos.alimentarHv(idCliente);
        this.depagos.setVisible(true);
    }

    void setHacerPrestamos(Object identificacion, Object nombre, Object apodo) {
        this.prestamos.getGrillaCliente(identificacion,nombre,apodo);
    }
    
}
