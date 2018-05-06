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
public class Walec extends FiguraPrzestrzenna{

    private double r,h;


    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObjetosc() {
        return Math.PI*Math.pow(r,2)*h;
    }

    @Override
    public double obliczPole() {
        return 2*Math.PI*r*(r+h);
    }
    public String toString() {
        return "Walec=========> " + "Promień" + this.r + ", Wys" + this.h + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}

}
