package atividade.praticas.contabancariasimples;

public class Contabancaria {
    private String nomeUsuarioConta;
    private String idConta;
    private double saldo;
    private String tipoConta;
    private double limiteConta;

    public void cadastrar(String nameUsuario,String conta, String tpconta, double saldo){
        this.nomeUsuarioConta = nameUsuario;
        this.idConta = conta;
        this.tipoConta = tpconta;
        this.saldo = saldo;
        this.limiteConta = 0;
    }
    public void mostrarDados(){
        System.out.println("Nome Usuario: "+ this.nomeUsuarioConta);
        System.out.println("Id conta: "+ this.idConta);
        System.out.println("Tipo da conta: "+ this.tipoConta);
        System.out.println("Saldo: "+ this.saldo);
    }

    public void deposito(int valor){
        this.saldo += valor;
    }
    public void saque(int valor){
        if(valor < limiteConta){
            System.out.println("Limite atingido");
        }
        else{
            this.saldo -= valor;
        }
    }
}
