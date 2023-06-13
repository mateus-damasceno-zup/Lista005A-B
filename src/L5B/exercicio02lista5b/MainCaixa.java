package L5B.exercicio02lista5b;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caixa pdv = new Caixa();
        pdv.creditar(1000);
        System.out.println("novo pdv aberto saldo "+ pdv.saldo);
        System.out.println(pdv.saldo);
        System.out.println("digite quantas operaçoes irá fazer");
        int operacoes = sc.nextInt();
        int opcao;
        while (operacoes>0){
            System.out.println("digite 1 para credito \n e 2 para debito");
            opcao=sc.nextInt();
            System.out.println("digite o valor: ");
            double valor = sc.nextDouble();
            if(opcao==1){
                System.out.println("===creditar=====");
                pdv.creditar(valor);
                System.out.println("saldo atualizado "+ pdv.saldo);
            }
            if(opcao==2){
                System.out.println("====debitar=====");
                pdv.debitar(valor);
                System.out.println("saldo atualizado "+pdv.saldo);
            }
            operacoes--;
        }
        System.out.println("saldo final apos as operaçoes "+ pdv.saldo);
    }
}
