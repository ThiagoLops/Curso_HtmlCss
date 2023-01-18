class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente Titular;
}

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
}

class teste {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.Titular = c;
    }
}

