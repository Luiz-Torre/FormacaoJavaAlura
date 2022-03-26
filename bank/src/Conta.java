public class Conta {
    double saldo;
    int agencia;
    int numero; //A conta é apenas com número nesse escopo
    String titular;

    void deposita(double valor){
        this.saldo += valor;
    }
    void saca(double valor){
        this.saldo -= valor;
    }
}
