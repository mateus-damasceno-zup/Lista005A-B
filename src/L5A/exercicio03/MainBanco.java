package L5A.exercicio03;

public class MainBanco {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1,"mateus");
        cc1.saldo = 1000;
        System.out.println("saldo: "+ cc1.saldo);
        cc1.saqueConta(100);
        cc1.depositoConta(200);
        cc1.saqueConta(1200);
        System.out.println(cc1.conta+" "+cc1.nome+" "+cc1.saldo);
        System.out.println("==============");
        ContaCorrente cc2 = new ContaCorrente(2000,"suetam");
        cc2.saldo = 10000;
        System.out.println("saldo: "+ cc2.saldo);
        cc2.saqueConta(3);
        cc2.depositoConta(1000);
        cc2.saqueConta(200);
        System.out.println(cc2.conta+" "+cc2.nome+" "+cc2.saldo);


    }
}
