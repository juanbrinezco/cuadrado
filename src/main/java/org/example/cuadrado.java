package org.example;

public class cuadrado {
    private double lado1;
    private double lado2;

    public cuadrado() {
        this.lado1 = 5.3;
        this.lado2 = 5.3;
    }

    public double area () {
        return lado1 * lado2;
    }
    public double perimetro() {
        return 2 * (lado1 + lado2); }

}
