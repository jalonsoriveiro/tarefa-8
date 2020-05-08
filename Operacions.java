/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jose
 */
public class Operacions <T>{
          List<Integer> lista = new ArrayList<Integer>();

      public static <T> void amosar2(List<Integer> lista){
       lista.add(14);
         lista.add(2);
         lista.add(73);
         System.out.println("Min : " + Collections.min(lista));
         System.out.println("Max : " + Collections.max(lista));
         
         for(Integer ele : lista){
             
             if (ele == 1) {
              System.out.println(lista.indexOf(1));       
             }else
             {
                 System.out.println("-1");
             }
             if (ele == 1) {
              System.out.println(lista.remove(1));       
             }else
             {
                 System.out.println("null");
             }
             
             
    }
   
    
   // •	 Calcular o elemento mínimo dun  array; 
//•	 Calcular o elemento máximo dun  array; 
//•	 Buscar un Obxecto nun array, devolvendo a posición da primeira aparición do Obxecto no array ou -1 se non existe. 

}
  }
