package br.com.flavio;

public class Iphone implements Telefone, Navegador, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

}
