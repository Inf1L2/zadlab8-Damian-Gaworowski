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
public class czekolada extends product {


    public czekolada(double price, String nazwa, String opis) {
    super(price, nazwa, opis);
    
    }
    public void buy(){
        System.out.println("slodka czekolada");
    }
    public void pokazInfo(){
        System.out.println("Cena:"+getPrice() + "Nazwa" + getName() + "opis" + getDescribe());
    }
    
}