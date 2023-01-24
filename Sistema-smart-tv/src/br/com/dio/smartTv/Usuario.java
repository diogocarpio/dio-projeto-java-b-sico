package br.com.dio.smartTv;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		SmartTv smartTv = new SmartTv(); 
	
		System.out.println("TV Ligada ?" + smartTv.ligada);
		System.out.println("Canal atual ?" + smartTv.canal);
		System.out.println("Volume atual ?" + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("TV Ligada ?" + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("TV Ligada ?" + smartTv.ligada);
		//
		smartTv.aumentarVolume();
		System.out.println("Volume atual ?" + smartTv.volume);;
		
		smartTv.diminuirVolume();
		System.out.println("Volume atual ?" + smartTv.volume);;
		//
		smartTv.aumentarCanal();
		System.out.println("O canal atual é " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("O canal atual é " + smartTv.canal);
	
		smartTv.mudarCanal(35);
		System.out.println("O novo canal é " + smartTv.canal);
		
	}
}
