/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

/**
 *
 * @author HP
 */
public class main {
   public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(2);
        
        
        Prostokąt prostokat = new Prostokąt(2,3);
        
        Trójkąt trojkat = new Trójkąt(4,2);
        
        Trapez trapez = new Trapez(3,4,5,6,5);
       
        Równoległobok rownoleglobok = new Równoległobok(55,2,2);
        
        Romb romb = new Romb(2,4);
       
        koło kolo = new koło(3);
        
        Sześcian szescian = new Sześcian(4);
        
        Prostopadłościan prostopaloscian = new Prostopadłościan(2,3,4);
        
        kula kula = new kula(5);
        
        Walec walec = new Walec(2,1);
       
        Stożek stozek = new Stożek(22,1,5);
       
   System.out.println(prostokat.toString());
   System.out.println(kwadrat.toString());
   System.out.println(trojkat.toString());
   System.out.println(trapez.toString());
   System.out.println(rownoleglobok.toString());
   System.out.println(romb.toString());
   System.out.println(kolo.toString());
   System.out.println(szescian.toString());
   System.out.println(prostopaloscian.toString());
   System.out.println(kula.toString());
   System.out.println(walec.toString());
   System.out.println(stozek.toString());
   
   }
    
}
