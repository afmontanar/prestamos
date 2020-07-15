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
import javax.swing.JOptionPane;
import utilities.ValidarCamposVacios;
import utilities.OperacionesFechas;

/**
 *
 * @author afmontanar
 */
public class HacerPrestamo extends javax.swing.JDialog {

    /**
     * Creates new form HistoriaVehiculos
     */
    private utilities.ModelosTabla modelot;
    private ValidarCamposVacios objectv;
    private Object idCliente;
    private String idChofer;
    private utilities.ModelosTabla modelotS;

    public HacerPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
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
        Apodo = new javax.swing.JTextField();
        dueno = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Fecha_limete_Pago = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        Totaldes = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JTextField();
        Intereses1 = new javax.swing.JTextField();
        Cantidad_cobrar1 = new javax.swing.JTextField();
        fecha1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        Monto_Diario_Pago1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hacer prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        Apodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Apodo"));
        Apodo.setName("Apodo");
        jPanel1.add(Apodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 180, 40));

        dueno.setBorder(javax.swing.BorderFactory.createTitledBorder("IdCliente"));
        jPanel1.add(dueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 50));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30, 40));

        Fecha_limete_Pago.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha_limite_pago"));
        Fecha_limete_Pago.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(Fecha_limete_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 40));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Total.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 240, 50));

        Totaldes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Totaldes.setBorder(javax.swing.BorderFactory.createTitledBorder("Total con descuento"));
        jPanel1.add(Totaldes, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 240, 50));

        nombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        nombre1.setName("nombre"); // NOI18N
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, 40));

        Cantidad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        Cantidad1.setName("Cantidad"); // NOI18N
        jPanel1.add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, 40));

        Intereses1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interes"));
        Intereses1.setName("Intereses"); // NOI18N
        jPanel1.add(Intereses1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 180, 40));

        Cantidad_cobrar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad_cobrar"));
        Cantidad_cobrar1.setName("Cantidad_cobrar"); // NOI18N
        jPanel1.add(Cantidad_cobrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 40));

        fecha1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        fecha1.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 180, 40));

        detalles.setColumns(20);
        detalles.setRows(5);
        detalles.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));
        detalles.setName("Detalles"); // NOI18N
        jScrollPane1.setViewportView(detalles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 90));

        Monto_Diario_Pago1.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto_Diario_Pago"));
        Monto_Diario_Pago1.setName("Monto_Diario_Pago"); // NOI18N
        jPanel1.add(Monto_Diario_Pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: Aca voy ha buscar el dueno
        Principal r = (Principal) super.getParent();
        r.setGrillaClienteVisibility(true,0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if(this.validarG()){
            this.guardar();
            this.limpiar();
            JOptionPane.showMessageDialog(this, "Se a guardado con exito");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private boolean validarG() {
        if(objectv.validacionCamposNulosB()){
            if(this.tienePrestamosVigentes()){
                return true;
            }  
            return false;
        }else{
            return false;
        }
    }
     void setCliente(Object nombre, Object identificacion) {
        this.dueno.setText(nombre + "");
        this.idCliente = identificacion;
    }
     
     void obtenerDChofer(String identificacion, String nombres) {
       // this.chofer.setText(nombres);
        this.idChofer = identificacion;
    }
     
      public void multiCxVu(String text) {
        
      }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apodo;
    private javax.swing.JTextField Cantidad1;
    private javax.swing.JTextField Cantidad_cobrar1;
    private com.toedter.calendar.JDateChooser Fecha_limete_Pago;
    private javax.swing.JTextField Intereses1;
    private javax.swing.JTextField Monto_Diario_Pago1;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Totaldes;
    private javax.swing.JTextArea detalles;
    private javax.swing.JLabel dueno;
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre1;
    // End of variables declaration//GEN-END:variables

    private boolean tienePrestamosVigentes() {
        try {
            ResultSet MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `prestamo` WHERE `idcliente`='"+dueno.getText()+"' and `cancelado`=1");
            while(MysqlConsulta.next()){
                 return (JOptionPane.showConfirmDialog(this, "Ya tiene un prestamo, deseas hacerle otro?")==0);
                      
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(GrillaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void guardar() {
        try {
            OperacionesFechas f = new OperacionesFechas(fecha1, Fecha_limete_Pago, null, null);
            int cantidadconintereses=(((Integer.parseInt(Cantidad1.getText()))*(Integer.parseInt(Intereses1.getText())))/100)+Integer.parseInt(Cantidad1.getText());
            int montopagodiario=f.diasHabiles();
            Prestamos.o.EjecutarMysql("INSERT INTO `prestamo`(`idcliente`, `nombre`, `apodo`, `fecha`, `cantidad`, `interes`, `cantidadcobrar`, `montodiariodepago`, `fechalimetepago`, `detalles`, `numeroprestamo`, `cancelado`) VALUES ('"+dueno.getText()+"','"+nombre1.getText()+"','"+Apodo.getText()+"','"+fecha1.getDateFormatString()+"','"+Cantidad1.getText()+"','"+Intereses1.getText()+"','"+cantidadconintereses+"',[value-8],[value-9],[value-10],[value-11],[value-12])");            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


   
}
