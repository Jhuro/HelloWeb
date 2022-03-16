/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.hello;
import java.util.Calendar;

/**
 *
 * @author jupbc
 */
public class NameHandler {
    
    private String name;
    private Calendar fechaDeNacimiento;
    
    public NameHandler(){
        
        name = null;
        fechaDeNacimiento = Calendar.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {

        String[] fdn = fechaDeNacimiento.split("-");
        this.fechaDeNacimiento.set(Integer.parseInt(fdn[0]), Integer.parseInt(fdn[1])-1, Integer.parseInt(fdn[2]));
    }

    
    public String getEdad() {
        
        Calendar fechaActual = Calendar.getInstance();
        int edad;
        
        edad = (int) ((fechaActual.getTimeInMillis() - fechaDeNacimiento.getTimeInMillis())/1000/60/60/24/365);
        return edad + "";
    }
}