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
public class Stożek extends FiguraPrzestrzenna{

    private double r,h,l;
    

    public Stożek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
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

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double obliczObjetosc() {
        return (Math.PI*Math.pow(r,2)*h)/3;
    }

    @Override
    public double obliczPole() {
        return Math.PI*r*(r+l);
}
}