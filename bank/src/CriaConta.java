public class CriaConta {
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.deposita(50.0);
        System.out.println(conta.saldo);
        boolean verificaSaque = conta.saca(80.0);
        if(verificaSaque){
            System.out.println("Saque feito com sucesso.\n" +
                    "Seu novo saldo eh: " + conta.saldo);
        }
        else{
            System.out.println("Nao foi possivel fazer o saque");
        }

        Conta outraConta = new Conta();
        boolean verificaTansferencia = conta.transfere(10,outraConta);

        if(verificaTansferencia){
            System.out.println("Transferencia feita com sucesso.\n" +
                    "Seu novo saldo eh: " + conta.saldo + "\nO novo saldo da conta que recebeu o dinheiro eh: " + outraConta.saldo);
        }
        else{
            System.out.println("Nao foi possivel fazer a transferencia");
        }
    }
}
