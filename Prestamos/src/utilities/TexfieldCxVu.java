/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import prestamos.HacerPrestamo;

/**
 *
 * @author afmontanar
 */
public class TexfieldCxVu extends JTextField {

    private boolean salto;
    private HacerPrestamo r;

    public TexfieldCxVu(HacerPrestamo r) {
        super();
        this.r=r;
        this.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                //NumeroIdCaretUpdate(evt);
            }
        });
    }

    
    
     
      
}
