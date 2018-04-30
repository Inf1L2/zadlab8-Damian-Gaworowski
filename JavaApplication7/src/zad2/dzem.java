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
public class dzem extends product {


    public dzem(double price, String nazwa, String opis) {
    super(price, nazwa, opis);
    
    }
    public void buy(){
        System.out.println("Dzem słodki");
    }
    public void pokazInfo(){
        System.out.println("Cena:"+getPrice() + "Nazwa" + getName() + "opis" + getDescribe());
    }
    
}