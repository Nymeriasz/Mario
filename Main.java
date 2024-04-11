package Mario;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        EstadoMario estadoMario = new MarioPequeno();


        // Mario Pequeno pega cogumelo
        estadoMario.pegarCogumelo(mario);
        mario.exibir();

        // Alterando para Mario Grande
        estadoMario = new MarioGrande();

        // Mario Grande pega cogumelo
        estadoMario.pegarCogumelo(mario);
        mario.exibir();
        estadoMario.levarDano(mario);
        mario.exibir();
        estadoMario.pegarPena(mario);
        mario.exibir();

        // Alterando para Mario Pena
        estadoMario = new MarioPena();

        // Mario Pena leva dano
        estadoMario.pegarPena(mario);
        mario.exibir();
        estadoMario.levarDano(mario);
        mario.exibir();
        estadoMario.pegarPena(mario);
        mario.exibir();
        estadoMario.levarDano(mario);
        mario.exibir();
        estadoMario.levarDano(mario);
        mario.exibir();
    }
}
