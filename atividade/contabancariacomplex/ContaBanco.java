package atividade.contabancariacomplex;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Dono: "+this.getDonoConta());
        System.out.println("Tipo conta: "+this.getTipoConta());
        System.out.println("numero da conta: "+this.getNumconta());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status conta: "+ getStatus());
    }

    public void abrirConta(String t) {

        this.setTipoConta(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50.0);
        } else if (t == "CP") {
            this.setSaldo(150.0);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Ainda tem dinheiro na conta, impossivel realizar ação.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Saldo negativo, realize os pagamentos necessarios para fechar a conta");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(Double valor) {
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado na conta de" + getDonoConta());
        } else {
            System.out.println("Impossivel realizar deposito em uma conta fechada.");
        }

    }

    public void saque(double valor) {
        if (this.getStatus() == true) {
            if(getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de "+ getDonoConta());
            }
            else{
                System.out.println("Saldo insuficiente para o saque");
            }
        }else{
            System.out.println("Impossivel realizar saque em uma conta inativa");
        }
    }

    

    public void pagarMensalidade() {
        int v = 0;
        if(getTipoConta() == "CC"){
            v = 12;
        } else if(getTipoConta() == "CP"){
            v = 20;
        }
        if(getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
            System.out.println("Impossivel pagar conta inativa");
        }

    }
    public void espacoEntreLinhas(){
        System.out.println(" ");
    }
    // Metodos especiais

    public void ContaBanco() {
        this.setSaldo(0.0);
        this.setStatus(true);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumconta() {
        return this.numConta;
    }

    public void setTipoConta(String tpc) {
        this.tipoConta = tpc;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setDonoConta(String dnc) {
        this.donoConta = dnc;
    }

    public String getDonoConta() {
        return this.donoConta;
    }

    public void setSaldo(Double sld) {
        this.saldo = sld;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean stts) {
        this.status = stts;
    }

    public boolean getStatus() {
        return this.status;
    }

}
