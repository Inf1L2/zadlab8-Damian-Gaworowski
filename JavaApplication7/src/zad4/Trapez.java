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
public class Trapez extends FiguraPłaska{

    private double a,b,c,d,h;


    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return a+b+c+d;
    }

    @Override
    public double obliczPole() {
        return ((a+b)*h)/2;
    }
    public String toString() {
        return "Trapez======> " + "Bok pierwszy" + this.a + ", Bok drugi" + this.b + ", Bok trzeci" + this.c + ", Bok czwarty" + this.d + ", Wys" + this.h + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
    }
}