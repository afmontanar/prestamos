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


/**
 *
 * @author afmontanar
 */
public class ConsultaPrestamos extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaHv
     */
    private Object idCliente;
    private utilities.ModelosTablaS modelot;
    private String idChofer;

    public ConsultaPrestamos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String n[] = {"idCliente", "nombre", "apodo", "Fecha", "interes", "cantidadcobrar", "abonar"};
        this.modelot = new utilities.ModelosTablaS(n, jTable2);
        jTable2.setModel(this.modelot);
        this.llenarTabla();
        this.idChofer = "";
        this.idCliente = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rutaf = new javax.swing.JTextField();
        Deuda = new javax.swing.JTextField();
        cliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fechai = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        nombre = new javax.swing.JTextField();
        cantidadPrestada = new javax.swing.JTextField();
        fechaf = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        AbonarSeleccionados = new javax.swing.JButton();
        apodo1 = new javax.swing.JTextField();
        interes1 = new javax.swing.JTextField();
        rutai1 = new javax.swing.JTextField();
        totalDeuda = new javax.swing.JTextField();
        fechaprestamo = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        AbonarSeleccionados1 = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rutaf.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden ruta f"));
        rutaf.setName("rutaf"); // NOI18N
        rutaf.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rutafCaretUpdate(evt);
            }
        });
        jPanel1.add(rutaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, 40));

        Deuda.setBorder(javax.swing.BorderFactory.createTitledBorder("Deuda"));
        Deuda.setName("Deuda");
        Deuda.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                DeudaCaretUpdate(evt);
            }
        });
        jPanel1.add(Deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 40));

        cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("IdCliente"));
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, 50));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 30, 40));

        fechai.setBorder(javax.swing.BorderFactory.createTitledBorder(" Fecha Inicial de pago"));
        fechai.setDateFormatString("yyyy/MM/dd");
        fechai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaiPropertyChange(evt);
            }
        });
        jPanel1.add(fechai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 180, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /*
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        */
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 870, 230));

        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        nombre.setName("nombre"); // NOI18N
        nombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nombreCaretUpdate(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 40));

        cantidadPrestada.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad Prestada"));
        cantidadPrestada.setName("cantidadPrestada"); // NOI18N
        cantidadPrestada.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cantidadPrestadaCaretUpdate(evt);
            }
        });
        jPanel1.add(cantidadPrestada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, 40));

        fechaf.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha final pago"));
        fechaf.setDateFormatString("yyyy-MM-dd");
        fechaf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechafPropertyChange(evt);
            }
        });
        jPanel1.add(fechaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 180, 40));

        jCheckBox1.setText("Incluir busqueda de fechas");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        AbonarSeleccionados.setText("Abonar todos");
        AbonarSeleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonarSeleccionadosActionPerformed(evt);
            }
        });
        jPanel1.add(AbonarSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        apodo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apodo"));
        apodo1.setName("Apodo");
        apodo1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                apodo1CaretUpdate(evt);
            }
        });
        jPanel1.add(apodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 180, 40));

        interes1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interes"));
        interes1.setName("interes"); // NOI18N
        interes1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                interes1CaretUpdate(evt);
            }
        });
        jPanel1.add(interes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 180, 40));

        rutai1.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden ruta i"));
        rutai1.setName("rutai"); // NOI18N
        rutai1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rutai1CaretUpdate(evt);
            }
        });
        jPanel1.add(rutai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 40));

        totalDeuda.setBorder(javax.swing.BorderFactory.createTitledBorder("Total deuda"));
        totalDeuda.setName("rutaf"); // NOI18N
        totalDeuda.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                totalDeudaCaretUpdate(evt);
            }
        });
        jPanel1.add(totalDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 180, 40));

        fechaprestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha del prestamo"));
        fechaprestamo.setDateFormatString("yyyy-MM-dd");
        fechaprestamo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaprestamoPropertyChange(evt);
            }
        });
        jPanel1.add(fechaprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 180, 40));

        jButton4.setText("Reiniciar busqueda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        AbonarSeleccionados1.setText("Abonar seleccionados");
        AbonarSeleccionados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonarSeleccionados1ActionPerformed(evt);
            }
        });
        jPanel1.add(AbonarSeleccionados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutafCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rutafCaretUpdate
        // TODO add your handling code here:
        this.busquedaHv();
    }//GEN-LAST:event_rutafCaretUpdate

    private void DeudaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_DeudaCaretUpdate
        // TODO add your handling code here:
        this.busquedaHv();
    }//GEN-LAST:event_DeudaCaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Principal r = (Principal) super.getParent();
        r.setGrillaClienteVisibility(true, 2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nombreCaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_nombreCaretUpdate

    private void cantidadPrestadaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cantidadPrestadaCaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_cantidadPrestadaCaretUpdate

    private void AbonarSeleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonarSeleccionadosActionPerformed
        // TODO add your handling code here:
        this.reiniciarFormulario();
    }//GEN-LAST:event_AbonarSeleccionadosActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            EnviarConsultarHv();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void apodo1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_apodo1CaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_apodo1CaretUpdate

    private void interes1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_interes1CaretUpdate
        // TODO add your handling code here:
        busquedaHv();
    }//GEN-LAST:event_interes1CaretUpdate

    private void rutai1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rutai1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_rutai1CaretUpdate

    private void totalDeudaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_totalDeudaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_totalDeudaCaretUpdate

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AbonarSeleccionados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonarSeleccionados1ActionPerformed
        // TODO add your handling code here:
        System.out.println(this.modelot.getRowCount());
        if(this.modelot.getRowCount()>0){
            for (int i = 0; i < this.modelot.getRowCount(); i++) {
                boolean valueAt = (boolean) this.modelot.getValueAt(i, 6);
                if(valueAt){
                    ResultSet MysqlConsulta2 = null;
                    try {
                        MysqlConsulta2 = Prestamos.o.MysqlConsulta("SELECT `numeroprestamo` FROM `prestamo` WHERE `idcliente`='"+this.modelot.getValueAt(i, 0)+"' and `cancelado` = 0");
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsultaPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ResultSet MysqlConsulta = null;
                    try {
                        MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT `montodiariodepago` FROM `prestamo` WHERE `numeroprestamo`='"+MysqlConsulta2.getString("numeroprestamo")+"'");
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsultaPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                    try {
                        //tiene que saber primero cuanto es el pago consultando en la tablade prestamo
                        java.util.Calendar c1 = java.util.Calendar.getInstance();
                        java.util.Calendar c = new java.util.GregorianCalendar();
                        String dia = Integer.toString(c.get(java.util.Calendar.DATE));
                        String mes = Integer.toString(c.get(java.util.Calendar.MONTH));
                        String annio = Integer.toString(c.get(java.util.Calendar.YEAR));
                        Prestamos.o.EjecutarMysql("INSERT INTO `pagos`(`numeroPrestamo`, `pagodelDia`, `fecha`, `detalle`, `numeroPago`) VALUES ('"+MysqlConsulta2.getString("numeroprestamo")+"','"+MysqlConsulta2.getString("montodiariodepago")+"','"+annio+"/"+mes+"/"+dia+"',[value-4],[value-5])");            
                    } catch (SQLException ex) {
                        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }      
        }
    }//GEN-LAST:event_AbonarSeleccionados1ActionPerformed

    private void fechaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaiPropertyChange
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
                this.busquedaHv();
            }
        
    }//GEN-LAST:event_fechaiPropertyChange

    private void fechafPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechafPropertyChange
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
                this.busquedaHv();
            }
    }//GEN-LAST:event_fechafPropertyChange

    private void fechaprestamoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaprestamoPropertyChange
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
                this.busquedaHv();
            }
    }//GEN-LAST:event_fechaprestamoPropertyChange

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbonarSeleccionados;
    private javax.swing.JButton AbonarSeleccionados1;
    private javax.swing.JTextField Deuda;
    private javax.swing.JTextField apodo1;
    private javax.swing.JTextField cantidadPrestada;
    private javax.swing.JLabel cliente;
    private com.toedter.calendar.JDateChooser fechaf;
    private com.toedter.calendar.JDateChooser fechai;
    private com.toedter.calendar.JDateChooser fechaprestamo;
    private javax.swing.JTextField interes1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rutaf;
    private javax.swing.JTextField rutai1;
    private javax.swing.JTextField totalDeuda;
    // End of variables declaration//GEN-END:variables

    private void busquedaHv() {
        this.modelot.vaciarTabla();
        String i = ((javax.swing.JTextField) fechai.getDateEditor().getUiComponent()).getText();
        String f = ((javax.swing.JTextField) fechaf.getDateEditor().getUiComponent()).getText();
        String fp = ((javax.swing.JTextField) fechaprestamo.getDateEditor().getUiComponent()).getText();
        ResultSet MysqlConsulta = null;
        System.out.println("fecha inicial:"+i);
        try {
            //ResultSet MysqlConsulta = NewMain.o.MysqlConsulta("SELECT * FROM `historiaVehiculo` WHERE `nombre` LIKE '%"+this.nombre.getText()+"%' AND `placa` LIKE '%"+this.placa.getText()+"%' AND `dueno` LIKE '%"+this.dueno.getText()+"%' AND `chofer` LIKE '%"+this.chofer.getText()+"%' AND `fecha` => '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"' AND `fecha` =< '" + i + " "+this.horai.getSelectedItem()+":"+this.minutoi.getSelectedItem()+":"+this.segundoi.getSelectedItem()+"' AND  `valorTotal` LIKE '%"+this.valtotal.getText()+"%' AND `valorTotalConDescuento` LIKE '%"+this.valdesc.getText()+"'%");
            if (jCheckBox1.isSelected()) {
                MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `prestamo` WHERE `nombre` LIKE '%" + this.nombre.getText() + "%' AND `idcliente` LIKE '%" + this.cliente.getText() + "%' AND `apodo` LIKE '%" + this.apodo1+ "%' AND `cantidad` LIKE '%" + this.cantidadPrestada + "%' AND (`fechainiciopago` >= '" + i + "' and `fechalimetepago` <= '" + f + "') AND (`fecha` = '" + fp + "')");
            } else {
                MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `prestamo` WHERE `nombre` LIKE '%" + this.nombre.getText() + "%' AND `idcliente` LIKE '%" + this.cliente.getText() + "%' AND `apodo` LIKE '%" + this.apodo1 + "%' AND `cantidad` LIKE '%" + this.cantidadPrestada + "%' AND `interes` LIKE '%" + this.interes1.getText() + "%'");
            }
            int valorTotalDeudas=0;
            while (MysqlConsulta.next()) {
                    valorTotalDeudas =+Integer.parseInt(MysqlConsulta.getString("cantidadcobrar"));
                    String darFormatoALaCantidad = this.darFormatoALaCantidad(MysqlConsulta.getString("cantidadcobrar"));
                    Object a[] = {MysqlConsulta.getString("idCliente"), MysqlConsulta.getString("nombre"), MysqlConsulta.getString("apodo"), MysqlConsulta.getString("Fecha"), MysqlConsulta.getString("interes")+"%", darFormatoALaCantidad, false};
                this.modelot.ingresarUsuario(a);
            }
        } catch (SQLException ex) {
            try {
                int valorTotalDeudas=0;
                while (MysqlConsulta.next()) {
                    valorTotalDeudas =+Integer.parseInt(MysqlConsulta.getString("cantidadcobrar"));
                        String darFormatoALaCantidad = this.darFormatoALaCantidad(MysqlConsulta.getString("cantidadcobrar"));
                        Object a[] = {MysqlConsulta.getString("idCliente"), MysqlConsulta.getString("nombre"), MysqlConsulta.getString("apodo"), MysqlConsulta.getString("Fecha"), MysqlConsulta.getString("interes")+"%", darFormatoALaCantidad, false};
                    this.modelot.ingresarUsuario(a);
                }
//                String a[] = {MysqlConsulta.getString("indice"), MysqlConsulta.getString("nombre"), MysqlConsulta.getString("placa"), MysqlConsulta.getString("dueno"), MysqlConsulta.getString("chofer"), "0000-00-00 00:00:00", MysqlConsulta.getString("valorTotal"), MysqlConsulta.getString("valorTotalConDescuento")};
//                this.modelot.ingresarUsuario(a);
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(rootPane, "A ocurrido un error inexperado");
            }
        }
        this.modelot.reload();
    }

   void llenarTabla() {
        this.modelot.vaciarTabla();
//        String i = ((javax.swing.JTextField) fechai.getDateEditor().getUiComponent()).getText();
        int valorTotalDeudas=0;
        ResultSet MysqlConsulta = null;
        try {
            MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `prestamo` WHERE `cancelado` = 0");
            while (MysqlConsulta.next()) {
                try {
                    valorTotalDeudas =+Integer.parseInt(MysqlConsulta.getString("cantidadcobrar"));
                    String darFormatoALaCantidad = this.darFormatoALaCantidad(MysqlConsulta.getString("cantidadcobrar"));
//                    {"idCliente", "nombre", "apodo", "Fecha", "interes", "cantidadcobrar"};
                    Object a[] = {MysqlConsulta.getString("idCliente"), MysqlConsulta.getString("nombre"), MysqlConsulta.getString("apodo"), MysqlConsulta.getString("Fecha"), MysqlConsulta.getString("interes")+"%", darFormatoALaCantidad, false};
                    this.modelot.ingresarUsuario(a);
                   
                } catch (SQLException ex) {
//                    try {
//                        String darFormatoALaCantidad = this.darFormatoALaCantidad(MysqlConsulta.getString("cantidadcobrar"));
//                        String a[] = {MysqlConsulta.getString("idCliente"), MysqlConsulta.getString("nombre"), MysqlConsulta.getString("apodo"), MysqlConsulta.getString("Fecha"), MysqlConsulta.getString("interes"),darFormatoALaCantidad};
//                        this.modelot.ingresarUsuario(a);
//                    } catch (SQLException ex1) {
                        JOptionPane.showMessageDialog(rootPane, "A ocurrido un error inexperado");
//                    }
                }
            }
            String darFormatoALaCantidad = this.darFormatoALaCantidad(valorTotalDeudas+"");
            totalDeuda.setText(darFormatoALaCantidad+"");
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPrestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.modelot.reload();
    }

    void setCliente(Object nombre, Object identificacion, Object apodo) {
        this.cliente.setText((String)identificacion );
        this.nombre.setText((String)""+nombre);
        this.apodo1.setText((String)apodo);
        this.busquedaHv();
    }

    void obtenerDChofer(String identificacion, String nombres) {
//        this.chofer.setText(nombres);
        this.idChofer = identificacion;
        this.busquedaHv();
    }

    private void reiniciarFormulario() {
//        this.chofer.setText("");
        this.cliente.setText("");
        this.fechaf.setDate(null);
        this.fechai.setDate(null);
//        this.horaf.setSelectedItem("00");
//        this.minutof.setSelectedItem("00");
//        this.segundof.setSelectedItem("00");
//        this.horai.setSelectedItem("00");
        this.idChofer = "";
        this.idCliente = "";
        this.nombre.setText("");
        this.Deuda.setText("");
        this.modelot.vaciarTabla();
        this.llenarTabla();
        this.jCheckBox1.setSelected(false);
    }

    private void EnviarConsultarHv() {
        int selectedRow = jTable2.getSelectedRow();
        Principal parent = (Principal) super.getParent();
        parent.mostrarHv(jTable2.getValueAt(selectedRow, 0) + "", jTable2.getValueAt(selectedRow, 1) + "", jTable2.getValueAt(selectedRow, 2) + "", jTable2.getValueAt(selectedRow, 3) + "", jTable2.getValueAt(selectedRow, 4) + "", jTable2.getValueAt(selectedRow, 5) + "", jTable2.getValueAt(selectedRow, 6) + "", jTable2.getValueAt(selectedRow, 7) + "");
    }
    
     private String darFormatoALaCantidad(String num) {
        String x1 = "0";
        long x;
        int neg = 0;
        num = num.replaceAll("[.]", "");
        if (!num.equals("0")) {
            try {
                x = Long.parseLong(num);
                if (x < 0) {
                    x = x * (-1);
                    neg = 1;
                }
                if (x < 1000) {
                    x1 = "" + x;
                }
                if (x >= 1000 && x <= 999999) {
                    long miles;
                    miles = x / 1000;
                    x1 = "" + miles + "." + num.substring(num.length() - 3, num.length());
                } else if (x >= 1000000 && x <= 999999999) {
                    long millon;
                    millon = x / 1000000;
                    x1 = "" + millon + "." + num.substring(num.length() - 6, num.length() - 3) + "." + num.substring(num.length() - 3, num.length());
                } else if (x >= 1000000000 && x <= 999999999999.0) {
                    long milmillon;
                    milmillon = x / 1000000000;
                    x1 = "" + milmillon + "." + num.substring(num.length() - 9, num.length() - 6) + "." + num.substring(num.length() - 6, num.length() - 3) + "." + num.substring(num.length() - 3, num.length());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR AL CONVERTIR A ENTERO 2" + e);
            }
        }
        if (neg == 1) {
            x1 = "-" + x1;
        }
        return x1;
    }

}
