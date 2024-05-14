package application;

import entities.Iphone;

public class Program {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();

		System.out.println();
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();

		System.out.println();
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
