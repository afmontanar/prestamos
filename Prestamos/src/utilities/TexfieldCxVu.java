/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JDialog;
import javax.swing.JTextField;


/**
 *
 * @author afmontanar
 */
public class TexfieldCxVu extends JTextField {

    private boolean salto;
    private final JDialog r;

    public TexfieldCxVu(JDialog r) {
        super();
        this.r=r;
        this.addCaretListener((javax.swing.event.CaretEvent evt) -> {
            //NumeroIdCaretUpdate(evt);
        });
    }

    
    
     
      
}
