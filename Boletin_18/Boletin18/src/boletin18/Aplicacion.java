/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;
import paquete_1.*;
import paquete_2.*;
/**
 *
 * @author finfanterodal
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Academia academica=new Academia();
        academica.setAlum("finfanterodal@gmail.com", "65443454343");
        academica.setNome("Francisco");
        
        System.out.println(academica.toString());
        
        Academia academica1=new Academia();
        academica1.setAlum("finfanterodal@danielcastelao.org", "6543465343");
        academica1.setNome("Paco");
        
        System.out.println(academica.toString());
        
    }
    
}
