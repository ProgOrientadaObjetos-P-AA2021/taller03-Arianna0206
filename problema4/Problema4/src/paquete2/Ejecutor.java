/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.EquipoCelular;
/**
 *
 * @author macbookair
 */
public class Ejecutor {
    public static void main(String[] args){
        /* Un objeto de tipo Institución Educativa */
        
        EquipoCelular eq = new EquipoCelular();
        
        eq.establecerSistemaOperativo("Android");
        eq.establecerTamañoPantalla("1.440 x 2.560");
        eq.establecerCosto(345);
        eq.establecerDireccionMac("64:39:f1:5a:22:ab");
        eq.establecerInformacionIMEI("358817100532063");
        
        System.out.printf("Equipo Celular\nSistema Operativo: %s\n"
                + "Tamaño de Pantalla: %s\nCosto: %.2f\nDirección mac: %s\n"
                + "Información IMEI: %s\n", eq.obtenerSistemaOperativo(),
                eq.obtenerTamañoPantalla(),eq.obtenerCosto(),
                eq.obtenerDireccionMac(),eq.obtenerInformacionIMEI());
    }
}
