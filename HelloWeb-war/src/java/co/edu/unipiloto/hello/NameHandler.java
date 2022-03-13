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
    private String day;
    private String month;
    private String year;
    
    public NameHandler(){
        
        name = null;
        day = null;
        month = null;
        year = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getEdad() {
        
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaDeNacimiento = Calendar.getInstance();
        int edad;
        
        fechaDeNacimiento.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        
        edad = (int) ((fechaActual.getTimeInMillis() - fechaDeNacimiento.getTimeInMillis())/1000/60/60/24/365);
        return edad + "";
    }
}