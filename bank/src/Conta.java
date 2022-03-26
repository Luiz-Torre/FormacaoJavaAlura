public class Conta {
    double saldo;
    int agencia;
    int numero; //A conta é apenas com número nesse escopo
    String titular;

    void deposita(double valor){
        this.saldo += valor;
    }
    boolean saca(double valor){
        if(this.saldo>= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
