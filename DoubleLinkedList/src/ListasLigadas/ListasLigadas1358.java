/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasLigadas;

import doublelinkedlist.DoubleLinkedList;
import ico.fes.modelo.Empleado;

/**
 *
 * @author leona
 */
public class ListasLigadas1358 {
    public static void main(String[] args){
        
        DoubleLinkedList ldl = new DoubleLinkedList();
        
        ldl.append("Leo");
        ldl.append("Karla");
        ldl.append("Juan");
        ldl.append(new Integer(50));
        
        ldl.transversal();
        
        DoubleLinkedList ldl2 = new DoubleLinkedList();
        
        ldl2.append(new Empleado(12,"Juan","Perex","Garcia",40.0f,4,2006));
        
        ldl2.transversal();

    }
}
