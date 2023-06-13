package L5B.exercicio02lista5b;

public class Caixa {
    double saldo;



    public double creditar(double valor){

        return saldo+=valor;
    }
    public double debitar(double valor){

        return saldo -=valor;
    }
}
