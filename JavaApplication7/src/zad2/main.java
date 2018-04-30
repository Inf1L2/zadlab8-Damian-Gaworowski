/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author HP
 */
public class main {
    

       
    
       public static void main(String[] args) {
        ksiazka ksiazkak = new ksiazka(203.45,"aaaa","bbb");
        ksiazkak.buy();
        ksiazkak.pokazInfo();
        
        dzem dzem = new dzem(30.23,"Nazwa","Opis");
        dzem.buy();
        dzem.pokazInfo();
        
        polopiryna polopiryna = new polopiryna(102.23,"Nazwa","Opis");
        polopiryna.buy();
        polopiryna.pokazInfo();
        
        dlugopis dlugopis = new dlugopis(224.34,"Nazwa","Opis");
        dlugopis.buy();
        dlugopis.pokazInfo();
        czekolada czekoladaaa = new czekolada(222.5,"Nazwa","Opis");
        czekoladaaa.buy();
        czekoladaaa.pokazInfo();
}
  
    
}

