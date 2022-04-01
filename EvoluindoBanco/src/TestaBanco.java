public class TestaBanco {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.nome = "Luiz M";
        luiz.cpf = "222.222.222-22";
        luiz.profissao = "programador";

        Conta contaLuiz = new Conta();
        contaLuiz.deposita(100);
        contaLuiz.titular = luiz;

        System.out.println(contaLuiz.titular.nome);
    }
}