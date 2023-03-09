package aula3.teorica;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public void escrever(){
         
    }

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Erro, a caneta está tampada ");
        } else {
            System.out.println("Rabiscando o papel");
        }

       
    }
}
