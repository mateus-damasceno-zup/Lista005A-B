package L5A.exercicio06;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(10,20);
        r1.mostrarValorAltura();
        r1.mostrarValorBase();
        double area = r1.calcularArea();
        double perimetro = r1.calcularPerimetro();
        System.out.println("area "+area + " perimetro "+ perimetro);

        r1.mudarValorAltura(22);
        r1.mudarValorBase(44);
        r1.mostrarValorBase();
        r1.mostrarValorAltura();
        double areaNova= r1.calcularArea();
        double perimetroNovo = r1.calcularPerimetro();
        System.out.println("area "+areaNova + " perimetro "+ perimetroNovo);
    }
}
