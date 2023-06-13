package L5A.exercicio06;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorBase( double novaBase){
        System.out.println("novo Valor " + novaBase);
        base = novaBase;
    }

    public void mudarValorAltura( double novaAltura){
        System.out.println("novo Valor " + novaAltura);
        altura = novaAltura;
    }

    public double mostrarValorBase(){
        System.out.println("valor da base "+ base);
        return base;
    }
    public double mostrarValorAltura(){
        System.out.println("valor da altura "+ altura);
        return altura;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro = altura *2 + base*2;
        return perimetro;
    }
    public double calcularArea(){
        double area;
        area = base * altura;
        return area;
    }


}
