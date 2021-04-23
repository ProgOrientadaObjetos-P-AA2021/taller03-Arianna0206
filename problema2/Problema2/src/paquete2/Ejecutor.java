/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.EquivalenteHora;
/**
 *
 * @author macbookair
 */
public class Ejecutor {
    

    public static void main(String[] args){
        /* Un objeto de tipo Institución Educativa */
        
        EquivalenteHora eh = new EquivalenteHora();
        
        eh.establecerHoras(6);
        eh.establecerMinuto();
        eh.establecerSegundos();
        eh.establecerDias();
        
        System.out.printf("Equivalente Hora\nHora: %.2f\nMinuto: %.2f\n"
                + "Segundos: %.2f\nDias: %.2f\n",eh.obtenerHoras(),
                eh.obtenerMinuto(),eh.obtenerSegundos(),
                eh.obtenerDias());
        
}
}
