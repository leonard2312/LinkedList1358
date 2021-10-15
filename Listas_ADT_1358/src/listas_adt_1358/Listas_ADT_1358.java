/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_adt_1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author leona
 */
public class Listas_ADT_1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("LEO"));
        lsl.append("JULIO");
        lsl.append("PEDRO");
        lsl.append("OCTAVIO");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        
        lsl2.append(new Empleado(1,"Jose","Perez","Garcia",1850.5f,2015,4));
        lsl2.append(new Empleado(2,"Enrique","Antonio","Garcia",750.5f,2014,2));
        lsl2.append(new Empleado(3,"Antonieta","Torres","Garcia",6750.5f,2013,8));
        
        lsl2.transversal();
    }
    
}
