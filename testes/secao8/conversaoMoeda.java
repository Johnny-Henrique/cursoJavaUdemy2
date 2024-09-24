package testes.secao8;

public class conversaoMoeda {

    public static final double IOF = 0.06;

    public static void valorConvertido(double precoDollar, double valorConverter){
       double total = precoDollar * valorConverter;
       total += (total * IOF);
       System.out.println("O valor a ser pago em R$: " + total);
    }


}
