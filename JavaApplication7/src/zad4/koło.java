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

public class koło extends FiguraPłaska{

    private double r;

    public koło(double r) 
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
    public double obliczObwod() 
    {
        return 2*Math.PI*r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }
public String toString() {
        return "Koło=========> " + "Promień" + this.r + ", Obwód" + obliczObwod() + ", Pole" + obliczPole();
}
    
}

