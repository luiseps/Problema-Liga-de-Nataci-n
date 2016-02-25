/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadador;



public class Nadador {

    private String nombre;
    private double id;
    private String rama;
    private double yearBorn;
    private String categoria;
    private String prueba;
    private int cod;
    public Nadador(String nombre,double id,String rama,double yearBorn,String categoria,String prueba,int cod){
        
        this.nombre = nombre;
        this.id = id;
        this.rama =  rama;
        this.yearBorn = yearBorn;
        this.categoria = categoria;
        this.prueba = prueba;
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public double getId() {
        return id;
    }

    public String getRama() {
        return rama;
    }

    public int getCod() {
        return cod;
    }

    public double getYearBorn() {
        return yearBorn;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrueba() {
        return prueba;
    }
    
   
    
}
