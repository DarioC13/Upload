/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author Dario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    
    private String nombre;
    
    public String getNombre(){
        return nombre = "Darío Quichimbo";
    }
    
    public static void main(String[] args) {
        System.out.println(new HolaMundo().getNombre());
    }
    
}
