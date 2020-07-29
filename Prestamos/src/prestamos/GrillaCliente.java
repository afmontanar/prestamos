/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author afmontanar
 */
public class GrillaCliente extends javax.swing.JDialog {

    /**
     * Creates new form GrillaCliente
     */
    private utilities.ModelosTablaS modelot;
    private int elquepide;
    
    public GrillaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();   
        setLocationRelativeTo(null);
        String n[] = {"tipoid","idcliente","nombre","Apodo","Direccion","Detalles","Celular"};
        this.modelot = new utilities.ModelosTablaS(n, jTable1);
        jTable1.setModel(this.modelot);
        this.llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        identificacion = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Apodo = new javax.swing.JTextField();
        apellido2 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar dueno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 12, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 900, 350));

        identificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificacion"));
        identificacion.setName("Nombre"); // NOI18N
        identificacion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                identificacionCaretUpdate(evt);
            }
        });
        jPanel1.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 150, 40));

        Celular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular"));
        Celular.setName("Nombre"); // NOI18N
        Celular.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CelularCaretUpdate(evt);
            }
        });
        jPanel1.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 40));

        Apellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));
        Apellido.setName("Nombre"); // NOI18N
        Apellido.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nombre2CaretUpdate(evt);
            }
        });
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, 40));

        Apodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Apodo"));
        Apodo.setName("Nombre"); // NOI18N
        Apodo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                apellido1CaretUpdate(evt);
            }
        });
        jPanel1.add(Apodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 150, 40));

        apellido2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo apellido"));
        apellido2.setName("Nombre"); // NOI18N
        apellido2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                apellido2CaretUpdate(evt);
            }
        });
        jPanel1.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 150, 40));

        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        nombre.setName("Nombre"); // NOI18N
        nombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nombre1CaretUpdate(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 40));

        Direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        Direccion.setName("Nombre"); // NOI18N
        Direccion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DireccionCaretUpdate(evt);
            }
        });
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        jButton1.setText("LLenar tabla con datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nombre1CaretUpdate
        // TODO add your handling code here:
        this.buscar();
    }//GEN-LAST:event_nombre1CaretUpdate

    private void nombre2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nombre2CaretUpdate
        // TODO add your handling code here:
         this.buscar();
    }//GEN-LAST:event_nombre2CaretUpdate

    private void apellido1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_apellido1CaretUpdate
        // TODO add your handling code here:
         this.buscar();
    }//GEN-LAST:event_apellido1CaretUpdate

    private void apellido2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_apellido2CaretUpdate
        // TODO add your handling code here:
         this.buscar();
    }//GEN-LAST:event_apellido2CaretUpdate

    private void identificacionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_identificacionCaretUpdate
        // TODO add your handling code here:
        this.buscar();
    }//GEN-LAST:event_identificacionCaretUpdate

    private void DireccionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DireccionCaretUpdate
        // TODO add your handling code here:
        this.buscar();
    }//GEN-LAST:event_DireccionCaretUpdate

    private void CelularCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CelularCaretUpdate
        // TODO add your handling code here:
        this.buscar();
    }//GEN-LAST:event_CelularCaretUpdate

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            this.enviar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Apodo;
    private javax.swing.JTextField apellido2;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField Apellido;
    // End of variables declaration//GEN-END:variables

    private void buscar() {
        this.modelot.vaciarTabla();
        try {
            ResultSet MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `cliente` WHERE `primeroNombre` LIKE '%"+this.nombre.getText()+"%' AND "
                    + "`segunNombre` LIKE '%"+this.Apellido.getText()+"%' AND `primeroApellido` LIKE '%"+this.Apodo.getText()+"%' AND `segundoApellido`"
                    + " LIKE '%"+this.apellido2.getText()+"%' AND `numeroId` LIKE '%"+this.identificacion.getText()+"%' AND `direccion` LIKE '%"+this.Direccion.getText()+"%' AND `celular` LIKE '%"+this.Celular.getText()+"%' ");
            while(MysqlConsulta.next()){
                String d[]={MysqlConsulta.getString("primeroNombre"), MysqlConsulta.getString("segunNombre"),MysqlConsulta.getString("primeroApellido"),MysqlConsulta.getString("segundoApellido"),MysqlConsulta.getString("numeroId"),  MysqlConsulta.getString("direccion"),MysqlConsulta.getString("celular"),MysqlConsulta.getString("detalles")};
                this.modelot.ingresarUsuarioM(d);
            }
        this.modelot.reload();
        } catch (SQLException ex) {
            Logger.getLogger(GrillaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void enviarHv() {
        Principal r=(Principal) super.getParent();
        r.setHistoriaVehiculosCliente(this.modelot.getValueAt(this.jTable1.getSelectedRow(), 0),this.modelot.getValueAt(this.jTable1.getSelectedRow(), 4));
    }

    private void llenarTabla() {
        this.modelot.vaciarTabla();
        try {
            ResultSet MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `cliente`");
            while(MysqlConsulta.next()){
                String d[]={MysqlConsulta.getString("primeroNombre"), MysqlConsulta.getString("segunNombre"),MysqlConsulta.getString("primeroApellido"),MysqlConsulta.getString("segundoApellido"),MysqlConsulta.getString("numeroId"),  MysqlConsulta.getString("direccion"),MysqlConsulta.getString("celular"),MysqlConsulta.getString("detalles")};
                this.modelot.ingresarUsuarioM(d);
            }
        this.modelot.reload();
        } catch (SQLException ex) {
            Logger.getLogger(GrillaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void quienPide(int i) {
        this.elquepide=i;
        this.llenarTabla();
    }

    private void enviar() {
        if(this.elquepide==0){
            enviarHv();
        }
        if(this.elquepide==1){
            enviarHv1();
        }
    }

    private void enviarHv1() {
        Principal r=(Principal) super.getParent();
        r.setGrillaHistoriaVCli(this.modelot.getValueAt(this.jTable1.getSelectedRow(), 0),this.modelot.getValueAt(this.jTable1.getSelectedRow(), 4));  
    }
    
}
