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

public class kula extends FiguraPrzestrzenna{

    private double r;

    public kula(double r) 
    {
        this.r = r;
    }

    public double getR() 
    {
        return r;
    }

    public void setR(double r) 
    {
        this.r = r;
    }

    @Override
    public double obliczObjetosc() 
    {
        return (4*Math.PI*Math.pow(r,3))/3;
    }

    @Override
    public double obliczPole() 
    {
        return 4*Math.PI*Math.pow(r,2);
}
    public String toString() {
        return "Kula======> " + "Promień" + this.r + ", Objętość" + obliczObjetosc() + ", Pole" + obliczPole();
}
}
