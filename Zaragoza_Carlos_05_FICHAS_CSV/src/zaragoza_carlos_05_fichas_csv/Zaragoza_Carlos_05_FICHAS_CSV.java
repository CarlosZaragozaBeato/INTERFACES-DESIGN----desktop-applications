/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zaragoza_carlos_05_fichas_csv;

import interfaz.PaginaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usumaniana
 */
public class Zaragoza_Carlos_05_FICHAS_CSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            PaginaPrincipal gui = new PaginaPrincipal();
            gui.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Zaragoza_Carlos_05_FICHAS_CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
