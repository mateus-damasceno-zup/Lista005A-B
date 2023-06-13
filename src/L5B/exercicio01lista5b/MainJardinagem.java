package L5B.exercicio01lista5b;

public class MainJardinagem {
    public static void main(String[] args) {
        Jardinagem j1 = new Jardinagem("Jardim das Camélias",100,30,40,5,2.0,50,100);
        j1.usarAdubo();
        j1.precoAdubo();
        j1.precoCorteGrama();
        System.out.println("peso em gramas do adubo utilizado "+ j1.usarAdubo());
        System.out.println("preço do adubo "+ j1.precoAdubo());
        System.out.println("preço do corte de grama: "+ j1.precoCorteGrama());
        System.out.println(j1.toString());
    }
}
