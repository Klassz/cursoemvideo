package aula5.controladeabastract;

public class AppControleRemoto {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
