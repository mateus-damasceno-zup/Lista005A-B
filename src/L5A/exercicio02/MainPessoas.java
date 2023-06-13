package L5A.exercicio02;

public class MainPessoas {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Mateus",33,1.70);
        pessoa1.peso=110;
        System.out.println(pessoa1.nome + " "+pessoa1.idade + " " +pessoa1.altura + " "+pessoa1.peso);
        pessoa1.crescer(1);
        pessoa1.emagrecer(10);
        pessoa1.engordar(20);
        pessoa1.envelhecer();
        System.out.println(pessoa1.nome + " "+pessoa1.idade + " " +pessoa1.altura + " "+pessoa1.peso);
        System.out.println("================");
        Pessoa pessoa2 = new Pessoa("Mateus",10,1.10);
        pessoa2.peso=100;
        System.out.println(pessoa2.nome + " "+pessoa2.idade + " " +pessoa2.altura + " "+pessoa2.peso);
        pessoa2.envelhecer();
        pessoa2.crescer(3);
        pessoa2.emagrecer(40);
        pessoa2.engordar(20);
        System.out.println(pessoa2.nome + " "+pessoa2.idade + " " +pessoa2.altura + " "+pessoa2.peso);
    }
}
