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
public class Sześcian extends FiguraPrzestrzenna {

    private double a;

    public Sześcian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(a, 3);
    }

    @Override
    public double obliczPole() {
        return 6 * Math.pow(a, 2);
    }
}