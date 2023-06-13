package L5A.exercicio05;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(10);
        quadrado1.mostrarValorLado();
        quadrado1.calcularAreaQuadrado();
        System.out.println(quadrado1.calcularAreaQuadrado());
        quadrado1.mudarValorLado(22);
        quadrado1.mostrarValorLado();
        System.out.println(quadrado1.calcularAreaQuadrado());


    }
}
