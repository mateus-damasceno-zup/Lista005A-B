package L5A.exercicio01;

import java.util.Random;

public class Bola {
    double circunferência;
    String cor;
    String marca;
    String material;
    double velocidade;

    public Bola(double circunferência, String cor, String marca, String material, double velocidade) {
        this.circunferência = circunferência;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

    public void trocarCor(){
        Random random = new Random();
        String[] rCor = {"azul","verde","vermelho","amarelo","rosa","roxo","preto","branco"};
        int indiceCorAleatoria=random.nextInt(rCor.length);
        cor = rCor[indiceCorAleatoria];

    }
    public String mostrarCor (){
        System.out.println("trocando a cor de forma aleatoria");
        return cor;
    }
}
