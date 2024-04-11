package Mario;

public class MarioPequeno implements EstadoMario {
    @Override
    public void pegarPena(Mario mario) {
        System.out.println("Mario está voando!");
    }

    @Override
    public void pegarCogumelo(Mario mario) {
        System.out.println("Mario ficou grande!");
    }

    @Override
    public void levarDano(Mario mario) {
        if (mario.vidas > 0) {
            mario.vidas -= 1;
            System.out.println("Mario perdeu 1 vida!");
        } else {
            System.out.println("Game Over");
        }
    }
}
