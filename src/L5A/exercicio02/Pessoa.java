package L5A.exercicio02;

public class Pessoa {
    String nome;
    int idade;
    double peso=0;
    double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void envelhecer(){
        idade = idade+1;
        if (idade <21){
            crescer(0.5);
        }

    }

    public void engordar(double gordura){
        System.out.println("engordou...");
        peso +=gordura;

    }
    public void emagrecer(double gordura){
        System.out.println("emagreceu");
        peso-=gordura;
    }
    public void crescer(double acrescimo){
        System.out.println("cresceu");
        altura+= acrescimo;

    }
}
