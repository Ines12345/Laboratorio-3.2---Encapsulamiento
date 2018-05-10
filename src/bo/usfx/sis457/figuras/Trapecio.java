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
public class Trapecio {
   private double BaseMayor;
   private double BaseMenor;
   private double Alturaa;

    public Trapecio(double basemayor, double basemenor, double alturaa) {
        this.BaseMayor = basemayor;
        this.BaseMenor = basemenor;
        this.Alturaa = alturaa;
    }
    public Trapecio() {
        this.BaseMayor = 0;
        this.BaseMenor = 0;
        this.Alturaa = 0;
    }

    public double getBaseMayor() {
        return BaseMayor;
    }

    public void setBaseMayor(double basemayor) {
        this.BaseMayor = basemayor;
    }

    public double getBaseMenor() {
        return BaseMenor;
    }

    public void setBaseMenor(double basemenor) {
        this.BaseMenor = basemenor;
    }

    public double getAlturaa() {
        return Alturaa;
    }

    public void setAltura(double alturaa) {
        this.Alturaa = alturaa;
    }
    public double getArea(){
       return ((this.BaseMayor + this.BaseMenor)*Alturaa/2); 
    }
    public double getPerimetro(){
      double c = (double) (this.BaseMayor - this.BaseMenor)/2;
      double h = (double) Math.sqrt((c*c)+(this.Alturaa*this.Alturaa));
       return this.BaseMayor+this.BaseMenor+h+h;
    }
}
