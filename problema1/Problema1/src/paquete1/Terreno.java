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
public class Terreno {

    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerCosto(){
        costo = valorMetroCuadrado * area;   
    }
    
    public void establecerAncho(double n){
        ancho = n;
    }
    
    public void establecerLargo(double n){
        largo = n;
    }
    
    public void establecerArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double n){
        valorMetroCuadrado = n;
    }
    
    public double obtenerCosto(){
        return costo;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
}
