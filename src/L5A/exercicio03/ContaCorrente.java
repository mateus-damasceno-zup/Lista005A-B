package L5A.exercicio03;

public class ContaCorrente {
    int conta;
    String nome;
    double saldo=0;

    public ContaCorrente(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public double depositoConta(double valor){
        return saldo+=valor;
    }
    public double saqueConta(double valor){
        if(saldo >valor){
            return saldo-=valor;
        }else{
            System.out.println("saldo insuficiente");
            return saldo;
        }

    }

}
