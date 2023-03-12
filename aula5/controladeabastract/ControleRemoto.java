package aula5.controladeabastract;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU-------");
       System.out.println("Está ligado ? " + this.getLigado());
       System.out.println("Está tocando? " + this.getTocando());
       System.out.print("Volume: " + this.getVolume()+ " ");
       for(int i = 0; i < getVolume(); i+=10){
            System.out.print("|");
       }
       System.out.println("\n------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
       if(this.getLigado()){
            this.setVolume(getVolume() - 5);
       }
       else{
        System.out.println("Impossivel Diminuir volume");
       }
    }

    @Override
    public void ligarMudo() {
    if(this.getLigado() && this.getVolume() > 0){
        this.setVolume(0);
    }
    else{
        System.out.println("Não consegui reproduzir");
    }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() <= 0){
            this.setVolume(30);
        }
        else{
        System.out.println("Não consegui reproduzir");

        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && ! this.getTocando() ){
            this.setTocando(true);
        }
        else{
        System.out.println("Não consegui reproduzir");

        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else{
        System.out.println("Não consegui reproduzir");

        }
    }

    
    
}
