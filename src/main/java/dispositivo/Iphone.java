package dispositivo;

import apps.internet.NavegadorInternet;
import apps.musica.ReprodutorMusical;
import apps.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página de endereço: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz");
    }
}