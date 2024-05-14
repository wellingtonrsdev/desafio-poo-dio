# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Resolução

## Diagrama de Classes(UML) do projeto

![diagrama](https://github.com/wellingtonrsdev/desafio-poo-dio/blob/main/assets/diagramaUml.png)

## Código Java da Classe

``` package entities;

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
		System.out.println("Selecionando a Música");

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
```

## Código Java das Interfaces 
``` package interfaces;

public interface AparelhoTelefonico {
	void ligar();

	void atender();

	void iniciarCorreioVoz();

}
```
``` package interfaces;

public interface NavegadorInternet {
	void exibirPagina();

	void adicionarNovaAba();

	void atualizarPagina();

}

```
``` package interfaces;

public interface ReprodutorMusical {
	void tocar();

	void pausar();

	void selecionarMusica();

}
```
## Código Java do Programa principal 

```
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

```

## Resultado no Console
![diagrama](https://github.com/wellingtonrsdev/desafio-poo-dio/blob/main/assets/console.png)
