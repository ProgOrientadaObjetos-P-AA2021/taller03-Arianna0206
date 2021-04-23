/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author macbookair
 */
public class EquivalenteHora {

    private double horas;
    private double minuto;
    private double segundos;
    private double dias;
    
    public void establecerHoras(int n){
        horas = n;
    }
    
    public void establecerMinuto(){
        minuto = horas * 60;
    }
    
    public void establecerSegundos(){
        segundos = horas * 3600;
    }
    
    public void establecerDias(){
        dias = horas / 24;
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinuto(){
        return minuto;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
}
