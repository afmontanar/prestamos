/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;


import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
    private final ValidarCamposVacios objectv;
    private boolean desactivar;
    private Object idCliente;
    private String idChofer;
    private utilities.ModelosTabla modelotS;
    
  

    public HacerPrestamo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Component[] componentsall = {cantidadFormateada,dueno,FechaInicioPago,FechaLimitePago,Apodo,nombre1,fecha1,Cantidad1,Intereses1,pagoDiario,ordenruta,detalles,pagoDiario,pagoDiarioConIntereses,cuotas};
        
        Component[] components = {dueno,cantidadFormateada,nombre1,fecha1,Cantidad1,Intereses1,cantidadFormateada,pagoDiario,ordenruta};
        this.objectv = new utilities.ValidarCamposVacios(components,componentsall);
//        this.objectr = new utilities.ValidarCamposVacios(components);
        setLocationRelativeTo(null); 
        String i = ((JTextField)fecha1.getDateEditor().getUiComponent()).getText();
        desactivar=false;
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
        cantidadFormateada = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        FechaInicioPago = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        Totaldes = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JTextField();
        Intereses1 = new javax.swing.JTextField();
        fecha1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTextArea();
        ordenruta = new javax.swing.JTextField();
        dueno = new javax.swing.JLabel();
        cantidadCobrar = new javax.swing.JLabel();
        FechaLimitePago = new com.toedter.calendar.JDateChooser();
        pagoDiario = new javax.swing.JLabel();
        cuotas = new javax.swing.JTextField();
        pagoDiarioConIntereses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hacer prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        Apodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Apodo"));
        Apodo.setName("Apodo");
        jPanel1.add(Apodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 180, 40));

        cantidadFormateada.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad formateada"));
        jPanel1.add(cantidadFormateada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 180, 50));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30, 40));

        FechaInicioPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha inicio pago"));
        FechaInicioPago.setDateFormatString("yyyy/MM/dd");
        FechaInicioPago.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaInicioPagoPropertyChange(evt);
            }
        });
        jPanel1.add(FechaInicioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 40));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

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
        Cantidad1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Cantidad1CaretUpdate(evt);
            }
        });
        Cantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad1KeyTyped(evt);
            }
        });
        jPanel1.add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, 40));

        Intereses1.setBorder(javax.swing.BorderFactory.createTitledBorder("Interes"));
        Intereses1.setName("Intereses"); // NOI18N
        Intereses1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Intereses1CaretUpdate(evt);
            }
        });
        Intereses1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Intereses1KeyTyped(evt);
            }
        });
        jPanel1.add(Intereses1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 180, 40));

        fecha1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha prestamo"));
        fecha1.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 180, 40));

        detalles.setColumns(20);
        detalles.setRows(5);
        detalles.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));
        detalles.setName("Detalles"); // NOI18N
        jScrollPane1.setViewportView(detalles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 90));

        ordenruta.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden de ruta"));
        ordenruta.setName("Orden de ruta");
        jPanel1.add(ordenruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 180, 40));

        dueno.setBorder(javax.swing.BorderFactory.createTitledBorder("IdCliente"));
        jPanel1.add(dueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 50));

        cantidadCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad a cobrar"));
        jPanel1.add(cantidadCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 50));

        FechaLimitePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha limite pago"));
        FechaLimitePago.setDateFormatString("yyyy/MM/dd");
        FechaLimitePago.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaLimitePagoPropertyChange(evt);
            }
        });
        jPanel1.add(FechaLimitePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 180, 40));

        pagoDiario.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago Diario"));
        jPanel1.add(pagoDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 180, 50));

        cuotas.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Cuotas"));
        cuotas.setName("Intereses"); // NOI18N
        cuotas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cuotasCaretUpdate(evt);
            }
        });
        cuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuotasKeyTyped(evt);
            }
        });
        jPanel1.add(cuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 180, 40));

        pagoDiarioConIntereses.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago Diario Intereses"));
        jPanel1.add(pagoDiarioConIntereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
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
        this.desactivar=true; 
        if(this.validarG()){
            this.guardar();
            this.limpiar();
            JOptionPane.showMessageDialog(this, "Se a guardado con exito");
        }
        this.desactivar=false;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Intereses1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Intereses1KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
        
    }//GEN-LAST:event_Intereses1KeyTyped

    private void Cantidad1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Cantidad1CaretUpdate
        // TODO add your handling code here:  
        if(!desactivar){
            String darFormatoALaCantidad = this.darFormatoALaCantidad(this.Cantidad1.getText());            
            this.cantidadFormateada.setText(darFormatoALaCantidad);       
            if(!Intereses1.getText().equals("")){
                this.cantidadConIntereses();
            }}
    }//GEN-LAST:event_Cantidad1CaretUpdate

    private void Cantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_Cantidad1KeyTyped

    private void Intereses1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_Intereses1CaretUpdate
        // TODO add your handling code here:
        if(!desactivar){
        this.cantidadConIntereses();
        }
    }//GEN-LAST:event_Intereses1CaretUpdate

    private void FechaInicioPagoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaInicioPagoPropertyChange
        // TODO add your handling code here:
       
     
              if(!this.obtenerFechaFormatString().equals("")){
                try{
                    
                    String[] obtenerFechaFormatStringB = this.obtenerFechaFormatStringB();
                    
                    if(this.compararfechas(obtenerFechaFormatStringB[0], obtenerFechaFormatStringB[1])){
                        System.out.println(this.diasHabiles());
                    } 
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("ocurrio un error");
                    return;}
                }
        
    }//GEN-LAST:event_FechaInicioPagoPropertyChange

    private void FechaLimitePagoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaLimitePagoPropertyChange
        // TODO add your handling code here:
       
            
            if(!this.obtenerFechaFormatString().equals("")){
                try{
                    System.out.println("hola1");
                    String[] obtenerFechaFormatStringB = this.obtenerFechaFormatStringB();
                    System.out.println("hola2");
                    if(this.compararfechas(obtenerFechaFormatStringB[0], obtenerFechaFormatStringB[1])){
                        System.out.println(this.diasHabiles());
                    } 
                }catch(NullPointerException e){
                    
                    System.out.println("no se puede calcular por falt de datos");
                    return;}
                }
       
    }//GEN-LAST:event_FechaLimitePagoPropertyChange

    private void cuotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuotasKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_cuotasKeyTyped

    private void cuotasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cuotasCaretUpdate
        // TODO add your handling code here:
        
        String cantidad = this.Cantidad1.getText(); 
        String text = this.cuotas.getText();
        try{
        int valorCuotas = Integer.parseInt(cantidad)/Integer.parseInt(text);
        String darFormatoALaCantidadDePagoCuotas = this.darFormatoALaCantidad(valorCuotas+"");
        
        this.pagoDiario.setText(darFormatoALaCantidadDePagoCuotas+"");
        
        String text1 = this.cantidadCobrar.getText();        
        String replaceAll = text1.replaceAll("[.]", "");
        int valorCuotasInt = Integer.parseInt(replaceAll)/Integer.parseInt(text);
        
        String darFormatoALaCantidadDePago = this.darFormatoALaCantidad(valorCuotasInt+"");
        this.pagoDiarioConIntereses.setText(darFormatoALaCantidadDePago);
         
        }catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_cuotasCaretUpdate
    
    public String obtenerFechaFormatString(){
        String i = ((JTextField)FechaInicioPago.getDateEditor().getUiComponent()).getText();
        return i;
    }
    
    public String[] obtenerFechaFormatStringB(){
         String z[]= new String[2];
         z[0] = ((JTextField)FechaInicioPago.getDateEditor().getUiComponent()).getText();
         z[1] = ((JTextField)FechaLimitePago.getDateEditor().getUiComponent()).getText();       
        return z;
    }
    
    public boolean compararfechas(String fecha11, String fecha12) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechai = sdf.parse(fecha11, new ParsePosition(0));
        java.util.Date fecha2 = sdf.parse(fecha12, new ParsePosition(0));
        try{
        boolean before = fechai.before(fecha2);
        return before;
        }catch(NullPointerException e){ System.out.println("no existe un dato");}
        return false;
    }
    
    public int diasHabiles() {
        String[] obtenerFechaFormatStringB = this.obtenerFechaFormatStringB();
        
        int mes1, dia1, año1;
        int mes2, dia2, año2;
        if(this.compararfechas(obtenerFechaFormatStringB[0], obtenerFechaFormatStringB[1])){
            año1 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(0, 4));
            mes1 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(5, 7));
            dia1 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(8, 10));
            mes1 -= 1;
            año2 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(0, 4));
            mes2 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(5, 7));
            dia2 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(8, 10));
            mes2 -= 1;
        }else{
            año1 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(0, 4));
            mes1 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(5, 7));
            dia1 = Integer.parseInt((obtenerFechaFormatStringB[1]).substring(8, 10));
            mes1 -= 1;
            año2 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(0, 4));
            mes2 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(5, 7));
            dia2 = Integer.parseInt((obtenerFechaFormatStringB[0]).substring(8, 10));
            mes2 -= 1;  
        }

        Calendar fechaInicio = new GregorianCalendar();
        fechaInicio.set(año1, mes1, dia1);
        Calendar fechaFin = new GregorianCalendar();
        fechaFin.set(año2, mes2, dia2);
        String ff = "" + fechaFin.getTime();

        int diashabiles = 0;
        int añoc = fechaInicio.get(Calendar.YEAR);
        while (true) {
            if (fechaInicio.get(Calendar.YEAR) > añoc) {
                añoc += 1;
            }
            String fechai = "" + fechaInicio.getTime();
            if (ff.equals(fechai)) {
                break;
            }
            fechaInicio.add(Calendar.DAY_OF_YEAR, 1);
            diashabiles++;
        }
        return (diashabiles);
    }
    
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
        this.cantidadFormateada.setText(nombre + "");
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
    private com.toedter.calendar.JDateChooser FechaInicioPago;
    private com.toedter.calendar.JDateChooser FechaLimitePago;
    private javax.swing.JTextField Intereses1;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Totaldes;
    private javax.swing.JLabel cantidadCobrar;
    private javax.swing.JLabel cantidadFormateada;
    private javax.swing.JTextField cuotas;
    private javax.swing.JTextArea detalles;
    private javax.swing.JLabel dueno;
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField ordenruta;
    private javax.swing.JLabel pagoDiario;
    private javax.swing.JLabel pagoDiarioConIntereses;
    // End of variables declaration//GEN-END:variables

    private boolean tienePrestamosVigentes() {
        try {
            ResultSet MysqlConsulta = Prestamos.o.MysqlConsulta("SELECT * FROM `prestamo` WHERE `idcliente`='"+cantidadFormateada.getText()+"' and `cancelado`=1");
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
            OperacionesFechas f = new OperacionesFechas(fecha1, FechaLimitePago, FechaInicioPago, null);
            int cantidadconintereses=(((Integer.parseInt(Cantidad1.getText()))*(Integer.parseInt(Intereses1.getText())))/100)+Integer.parseInt(Cantidad1.getText());
            int montopagodiario=cantidadconintereses/Integer.parseInt(this.cuotas.getText());
            String d[]=f.obtenerFechaFormatStringC();
//            System.out.println("INSERT INTO `prestamo`(`idcliente`, `nombre`, `apodo`, `fecha`, `cantidad`, `interes`, `cantidadcobrar`, `montodiariodepago`, `fechalimetepago`, `detalles`, `numeroprestamo`, `cancelado`, `numeroCuotas`,`fechainiciopago`) VALUES ('"+Cantidad1.getText()+"','"+nombre1.getText()+"','"+Apodo.getText()+"','"+d[0]+"','"+Cantidad1.getText()+"','"+Intereses1.getText()+"','"+cantidadconintereses+"','"+montopagodiario+"','"+d[1]+"','"+detalles.getText()+"','','false','"+this.cuotas.getText()+"','"+d[2]+"')");
            Prestamos.o.EjecutarMysql("INSERT INTO `prestamo`(`idcliente`, `nombre`, `apodo`, `fecha`, `cantidad`, `interes`, `cantidadcobrar`, `montodiariodepago`, `fechalimetepago`, `detalles`, `cancelado`, `numeroCuotas`,`fechainiciopago`) VALUES ('"+dueno.getText()+"','"+nombre1.getText()+"','"+Apodo.getText()+"','"+d[0]+"','"+Cantidad1.getText()+"','"+Intereses1.getText()+"','"+cantidadconintereses+"','"+montopagodiario+"','"+d[1]+"','"+detalles.getText()+"','0','"+this.cuotas.getText()+"','"+d[2]+"')");            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiar() {
        this.objectv.reiniciarFormularior();
        }

    void getGrillaCliente(Object identificacion, Object nombre, Object apodo) {
        this.dueno.setText((String) identificacion);
        this.nombre1.setText((String) nombre);
        this.Apodo.setText((String) apodo);    
    }

    private String darFormatoALaCantidad(String text) {
        int length = text.length();       
        String cantidad="";
        if(length>3){
            int incrementar=length;
            do {                
                cantidad="."+text.substring(incrementar-3, incrementar)+cantidad;
                incrementar-=3;
                if(incrementar<=3){
                    cantidad=text.substring(0, incrementar)+cantidad;
                    break;
                }
            } while (incrementar!=0);        
        } 
      return cantidad;
    }
    
    private void cantidadConIntereses(){
        int cantidad=0;
        try {
            cantidad=Integer.parseInt(this.Cantidad1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No ha digitado la cantidad");
            return;
        }
        int intereses=0; 
        try {
            if(!this.Intereses1.getText().equals("")){
                intereses=Integer.parseInt(Intereses1.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No esta disponible el interes");
            return;
        }
        int calculo=(cantidad*intereses)/100;
        int cantidadAcobrar=calculo+cantidad;      
        this.cantidadCobrar.setText(this.darFormatoALaCantidad(""+cantidadAcobrar));
   
    }


   
}
