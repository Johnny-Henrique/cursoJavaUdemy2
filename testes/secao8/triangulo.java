package testes.secao8;

public class triangulo {
    double a;
    double b;
    double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));

    } 


}