package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	private String model;
	private int storage;
	private int battery;

	@Override
	public void tocar() {
		System.out.println("Música está tocando");

	}

	@Override
	public void pausar() {
		System.out.println("Música está pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionado a Música");

	}

	@Override
	public void exibirPagina() {
		System.out.println("Página desejada está sendo exibida");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo uma nova aba");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página");

	}

	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação");

	}

	@Override
	public void atender() {
		System.out.println("atendendo uma ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de voz");
	}

}
