package atividade.contabancariasimples;

public class AppContaBancaria {
    public static void main(String[] args) {
        Contabancaria conta1 = new Contabancaria();

        conta1.cadastrar("Mario", "001", "Corrente", 0);
        conta1.deposito(300);
        conta1.mostrarDados();


        Contabancaria conta2 = new Contabancaria();
        
        conta2.cadastrar("Leanndra", "002", "Poupança", 0);
        conta2.deposito(500);
        conta2.saque(400);
        conta2.mostrarDados();
        
    }
}
