/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamos;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilities.ValidarCamposVacios;


/**
 *
 * @author adicnet
 */
public class Cliente extends javax.swing.JDialog {
    
    private utilities.ModelosTablaU modelot;
    private ValidarCamposVacios objectv;
    /**
     * Creates new form Cliente
     */
    public Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Component[] components = {NumeroId,nombre1,apellido1,Celular,direccion};
        Component[] componentst = {NumeroId,nombre1,nombre2,apellido1,Celular,direccion,detalles};
        this.objectv = new utilities.ValidarCamposVacios(components,componentst);
        String n[] = {"Identificacion","Nombres","Apellidos","Direccion","Celular","Detalle"};
       
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
        tidentificacion = new javax.swing.JComboBox();
        nombre2 = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        NumeroId = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        nombre1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        tidentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "CE", "TI" }));
        tidentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de identificacion"));
        tidentificacion.setName("Tipo de identificacion"); // NOI18N
        jPanel1.add(tidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 50));

        nombre2.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));
        nombre2.setName("Apellido");
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 40));

        Celular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular"));
        Celular.setName("Celular"); // NOI18N
        jPanel1.add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 180, 40));

        NumeroId.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero id"));
        NumeroId.setName("Numero id"); // NOI18N
        jPanel1.add(NumeroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 40));

        apellido1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apodo"));
        apellido1.setName("Apodo");
        jPanel1.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 40));

        direccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        direccion.setName("Direccion"); // NOI18N
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, 40));

        detalles.setColumns(20);
        detalles.setRows(5);
        detalles.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));
        detalles.setName("Detalles"); // NOI18N
        jScrollPane1.setViewportView(detalles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, 90));

        nombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        nombre1.setName("Nombre"); // NOI18N
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 40));

        jToggleButton1.setText("Guardar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(this.validarG()){
            this.guardar();
            this.limpiar();
            JOptionPane.showMessageDialog(this, "Se a guardado con exito");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField NumeroId;
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextArea detalles;
    private javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JComboBox tidentificacion;
    // End of variables declaration//GEN-END:variables

    private boolean validarG() {
        if(objectv.validacionCamposNulosB()){
            if(this.existeU()){
                return true;
            }  
            return false;
        }else{
            return false;
        }
    }

    private void guardarC() {      
        try {
            Prestamos.o.EjecutarMysql("INSERT INTO `mecanics`.`cliente` (`TipoIdentificacion`, `primeroNombre`, `segunNombre`, `primeroApellido`, `segundoApellido`, `numeroId`, `direccion`, `celular`, `detalles`) VALUES ('"+this.tidentificacion.getSelectedItem()+"', '"+this.nombre1.getText()+"', '"+this.nombre2.getText()+"', '"+this.apellido1.getText()+"', '', '"+this.NumeroId.getText()+"', '"+this.direccion.getText()+"', '"+this.Celular.getText()+"', '"+this.detalles.getText()+"')");            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardar() {
        this.guardarC();
        this.guardarCC();   
    }

    private void guardarCC() {
        List<Object[]> usuarios = this.modelot.getUsuarios();
        for(int i=0; i<usuarios.size();i++){
            Object[] get = usuarios.get(i);
       try {
            Prestamos.o.EjecutarMysql("INSERT INTO `mecanics`.`chofer` (`Identificacion`, `Nombres`, `Apellidos`, `Direccion`, `Celular`, `Detalle`, `clienteid`) VALUES ('"+get[0]+"', '"+get[1]+"', '"+get[2]+"', '"+get[3]+"', '"+get[4]+"', '"+get[5]+"', '"+this.NumeroId.getText()+"')");            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    }

    private boolean existeU() {
        try {
            ResultSet MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM  `cliente` WHERE  `numeroId` LIKE  '"+this.NumeroId.getText()+"'");
            if(MysqlConsulta.next()){
                JOptionPane.showMessageDialog(this, "Este cliente ya existe");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void limpiar() {
        this.objectv.reiniciarFormularior();
        this.modelot.vaciarTabla();
    }
    
}
