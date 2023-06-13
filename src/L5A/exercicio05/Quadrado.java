package L5A.exercicio05;

public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double mudarValorLado(double novoValor){
        System.out.println("mudando o valor do lado");
    return lado=novoValor;
    }
    public Double mostrarValorLado(){
        System.out.println("valor do lado " + lado);
        return lado;
    }

    public double calcularAreaQuadrado(){
        return lado * lado;
    }
}
