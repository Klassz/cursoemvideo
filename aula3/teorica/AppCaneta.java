package aula3.teorica;

public class AppCaneta {
public static void main(String[] args) {
   Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.modelo = "Bic Cristal";
    c1.tampada = false;
    c1.carga = 80;

    c1.rabiscar();
    c1.escrever();

}
 

}
