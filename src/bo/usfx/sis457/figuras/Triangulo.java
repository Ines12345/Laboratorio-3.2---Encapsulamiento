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
public class Triangulo {
    private double B;
    private double H;

    /**
     * Método constructor, crea el Rectangulo con las propiedades Base y Altura
     * @param b Valor tipo double
     * @param h Valor tipo double
     */
    public Triangulo(double b, double h) {
        this.B = b;
        this.H = h;
    }
    
    /**
     * Método constructor, crea el Rectangulo con valores por defecto
     */
    public Triangulo() {
        // Llama al método constructor anterior
        this(0, 0);
    }

    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getB() {
        return B;
    }

    /**
     * Método que modifica el valor de la Base
     * @param b Valor de tipo double
     */
    public void setBase(double b) {
        this.B= b;
    }

    /**
     * Método que retorna el valor de la H 
     * @return Retorna el valor de la H en tipo double
     */
    public double getH() {
        return H;
    }

    /**
     * Método que modifica el valor de la Altura
     * @param h Valor de tipo double
     */
    public void setH(double h) {
        this.H = h;
    }
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return this.B * this.H;
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        double hipotenusa=Math.sqrt(this.B*this.B+this.H*this.H);
		return this.B+this.H+hipotenusa;
    }
}
