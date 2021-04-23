/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author macbookair
 */
public class Ejecutor {
  
    public static void main(String[] args){
        /* Un objeto de tipo Institución Educativa */
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        i1.establecerNombre("Antonio Peña Celi");
        i1.establecerTipoInstitucion("Educación Regular");
        i1.establecerNumeroAlumnos(800);
        i1.establecerNumeroDocentes(64);
        i1.establecerNumeroSedes(2);
        
        System.out.printf("%s - %s - %d - %d - %d\n", i1.obtenerNombre(),
                i1.obtenerTipoInstitucion(), i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(), i1.obtenerNumeroSedes());
    }
            
    
}
