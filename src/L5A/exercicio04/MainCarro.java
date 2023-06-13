package L5A.exercicio04;

public class MainCarro {
    public static void main(String[] args) {
        Carro classic = new Carro(4,"classic","chevrolet");
        classic.potencia=1.0;
        System.out.println(classic.qtdePortas+" "+ classic.modelo+" "+ classic.marca+" "+ classic.potencia);
        classic.ligarCarro();

    }
}
