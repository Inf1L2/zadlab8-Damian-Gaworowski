/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author HP
 */
public class tab {
    
    private static void tab(){
       product[] product = new product[10];
       
       product[0] = new ksiazka(20.2,"nazwaaaa","ppp");
       product[1] = new dzem(20.2,"nazwaaaa","ppp");
       product[2] = new czekolada(20.2,"nazwaaaa","ppp");
       product[3] = new dlugopis(20.2,"nazwaaaa","ppp");
       product[0] = new narzedzia(20.2,"nazwaaaa","ppp");
       product[0] = new polopiryna(20.2,"nazwaaaa","ppp");
       product[0] = new ubrania(20.2,"nazwaaaa","ppp");

      
       for (int i=0; i<10; i++){
           product[i].buy();
           product[i].pokazInfo();
       }
    }
       public static void main(String[] args) {
        tab();
     
       }

   
        

    
}

