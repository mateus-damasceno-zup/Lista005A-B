package L5A.exercicio04;

public class Carro {
   int qtdePortas;
   String modelo;
    String marca;
    double potencia=2.0;

    public Carro(int qtdePortas, String modelo, String marca) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void ligarCarro(){
        System.out.println("carro ligado");

    }
}
