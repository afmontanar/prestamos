/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;

/**
 *
 * @author andres
 */
public class Prestamos {
    static utilities.Connetion o = new utilities.Connetion("localhost", "prestamos", "root", "admin");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Principal().setVisible(true);
        
    }
}
