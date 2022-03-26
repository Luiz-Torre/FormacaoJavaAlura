public class CriaConta {
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.deposita(50.0);
        System.out.println(conta.saldo);
        conta.saca(20.0);
        System.out.println(conta.saldo);
    }
}
