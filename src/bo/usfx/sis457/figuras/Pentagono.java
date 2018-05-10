/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author Ines Gonzales
 */
public class Pentagono {
    private double Lado ;

    public Pentagono(double lado) {
        this.Lado = lado;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        this.Lado = lado;
    }
    public double getArea(){
        double Apotema=(double)this.Lado/(2*Math.tan(360/(2*5)));
        double Perimetro=(double) this.Lado*5;
        return (Perimetro*Apotema)/2;
   }
    public double getPerimetro(){
        return 5*this.Lado;
  }

}
