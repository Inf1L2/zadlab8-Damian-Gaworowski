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


public class Prostokąt extends FiguraPłaska{

    private double a,b;
   

    public Prostokąt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double obliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*b;
}
    public String toString() {
   return "Prostokąt====> " + "Bok pierwszy" + this.a + ", Bok drugi" + this.b + ", Obwód" + obliczObwod() + " Pole" + obliczPole();
}
}