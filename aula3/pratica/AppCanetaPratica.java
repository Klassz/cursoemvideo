package aula3.pratica;

public class AppCanetaPratica {
    public static void main(String[] args) {
        CanetaPratica c1 = new CanetaPratica();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.tampada = false;
        c1.carga = 80;
        // c1.ponta = 0.5f;

        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.tampar();
        c1.status();
        
    }
}
