package aula4;


public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String model,String co,float pont){
        this.cor = co;
        this.modelo = model;
        this.ponta = pont;
        this.tampar();
        
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
         return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
            System.out.println("Sobre a caneta: ");
            System.out.println("Modelo da caneta: " + getModelo());
            System.out.println("Ponta da caneta " + getPonta() );
            System.out.println("Tampada: "+ this.tampada);
    }
    public void fazerEspacamento(){
        System.out.println(" ");
    }
    


}
