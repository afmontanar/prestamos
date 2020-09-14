/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.toedter.calendar.JDateChooser;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class OperacionesFechas {
    
    private final JDateChooser a;
    private final JDateChooser b;
    private final JDateChooser c;
    private final JDateChooser d[];

    public OperacionesFechas(JDateChooser a, JDateChooser b, JDateChooser c, JDateChooser[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //Metodo para obtener el String de una fecha escogida en un JDateChooser
    public String obtenerFechaFormatString(){
        String i = ((JTextField)a.getDateEditor().getUiComponent()).getText();
        return i;
    }
    
    public String[] obtenerFechaFormatStringB(){
         String z[]= new String[2];
         z[0] = ((JTextField)a.getDateEditor().getUiComponent()).getText();
         z[1] = ((JTextField)b.getDateEditor().getUiComponent()).getText();
        
        return z;
    }
    
//Metodo para saber cuantos dias hay de una fecha a otra...
//El metodo esta probado es infalible no como otros que buscas por hay... te fallan cuando les pones fechas de diferentes años
//el primer parametro que recibe debe ser la fecha menor
//Ejemplo del formato de fecha 2014/09/12
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
    
    //Metodo para saber si una fecha es mayor que otra
    //Explicacion: si el parametro fecha11 es menor que el parametro fecha12 devuelve true si no false 
  
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
  
}
