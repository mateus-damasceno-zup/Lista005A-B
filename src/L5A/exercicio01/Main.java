package L5A.exercicio01;

public class Main {
    public static void main(String[] args) {

        Bola bola1 = new Bola(10,"azul","wilson","borracha",8000);
        Bola bola2 = new Bola(100,"vermelho","wilton","latex",5000);

        System.out.println(bola1.mostrarCor());
        bola1.trocarCor();
        System.out.println(bola1.mostrarCor());

        System.out.println(bola2.mostrarCor());
        bola2.trocarCor();
        System.out.println(bola2.mostrarCor());

    }
}
