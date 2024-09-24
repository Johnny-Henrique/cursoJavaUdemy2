package testes.secao8;

public class mediaAluno {
    String nome;
    double primeiraNota;
    double segundaNota;
    double terceiraNota;

    public double somaNota(){
        return primeiraNota + segundaNota + terceiraNota;
    }

    public void verificacao(){
        somaNota();

        if(somaNota()>60){
            System.out.println("Nota final: " + somaNota());
            System.out.println("Aprovado.");
        }
        else{
            double soma = 60 - somaNota();
            System.out.println("Nota final: " + somaNota());
            System.out.println("Pontos faltantes: " + soma);
            System.out.println("Reprovado.");

        }
    }



}
