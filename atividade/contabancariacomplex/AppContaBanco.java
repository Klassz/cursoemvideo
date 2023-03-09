package atividade.contabancariacomplex;

public class AppContaBanco {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();

        conta1.setDonoConta("Roseane Arraes silva");
        conta1.abrirConta("CC");
        conta1.setNumConta(001);
        conta1.pagarMensalidade();
        conta1.estadoAtual();
        

        ContaBanco conta2 = new ContaBanco();

        conta2.setDonoConta("Kayo Leanndro Pereira Santana");
        conta2.abrirConta("CP");
        conta2.setNumConta(002);
        conta2.pagarMensalidade();
        conta2.estadoAtual();


        conta1.depositar(2.000);
    }
}
