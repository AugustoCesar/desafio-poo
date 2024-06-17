import dispositivo.Iphone;

public class Smartphone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("\nReprodutor Musical");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nAparelho Telefonico");
        iphone.ligar("5550123");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nNavegador Internet");
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}