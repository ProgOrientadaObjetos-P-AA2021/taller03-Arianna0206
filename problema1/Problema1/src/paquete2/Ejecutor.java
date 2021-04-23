/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Terreno;
/**
 *
 * @author macbookair
 */
public class Ejecutor {
    

    public static void main(String[] args){
        /* Un objeto de tipo Institución Educativa */
        
        Terreno t = new Terreno();
        
        
        t.establecerAncho(500);
        t.establecerLargo(600);
        t.establecerValorMetroCuadrado(100);
        t.establecerArea();
        t.establecerCosto();
        
        
        System.out.printf("Detalle del Terreno\nAncho: %.2f\nLargo: %.2f\n"
                + "Valor Metro Cuadrado: %.2f\nArea: %.2f\nCosto: %.2f\n" 
                ,t.obtenerAncho(),t.obtenerLargo(),
                t.obtenerValorMetroCuadrado(),t.obtenerArea(),t.obtenerCosto());
}
}
