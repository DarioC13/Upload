/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;

/**
 *
 * @author Dario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    
    private String nombre;
    
    public HolaMundo(){
        
    }
    
    public String getNombre(){
        return nombre = "Darío Quichimbo";
    }
    
    public String Edad(int edad){
        edad = 2000;
        String resultado = "";
        Calendar calendar = Calendar.getInstance();
        calendar.getWeekYear();
        return resultado;
    }
    
    public static void main(String[] args) {
        HolaMundo HM = new HolaMundo();
        System.out.println("Mi nombre es: "+HM.getNombre());
    }
    
}
