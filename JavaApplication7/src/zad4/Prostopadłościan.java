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
public class Prostopadłościan extends FiguraPrzestrzenna {

    private double a,b,c;
   

    public Prostopadłościan(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double obliczObjetosc() {
        return a * b * c;
    }

    @Override
    public double obliczPole() {
        return 2 * (a * b + a * c + b * c);
}
}