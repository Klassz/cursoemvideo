package atividade.praticas.classeelevador;
public class Appelevador{
    public static void main(String[] args) {

		Elevador elevador = new Elevador(1);
		
		System.out.printf("Código...............: %d\n", elevador.getCodigo());
		System.out.printf("Limite de pessoas....: %d\n", elevador.getLimitePessoas());
		System.out.printf("Pessoas transportadas: %d\n", elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());

		System.out.println("1ª operação:");
		elevador.registraEntrada(6);  
		System.out.println("Pessoas transportadas: " + elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
		
		System.out.println("2ª operação:");
        elevador.registraEntrada(2);
        elevador.registraSaida(4);  
		System.out.println("Pessoas transportadas: " + elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
			
		
		System.out.println("3ª operação:");
		elevador.registraSaida(2);    	
		elevador.registraEntrada(6);  
		System.out.println("Pessoas transportadas: " + elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
		
		System.out.println("4ª operação (saída):");
		elevador.registraSaida(3);   
		System.out.println("Pessoas transportadas: " + elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
		
		System.out.println("5ª operação (saída):");
		elevador.registraSaida(2);    // 7		
		System.out.println("Pessoas transportadas: " + elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
}
}