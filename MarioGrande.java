package Mario;

public class MarioGrande implements EstadoMario{
    @Override
    public void pegarPena(Mario mario){
        System.out.println("Mario está voando!");
    }
    @Override
    public void pegarCogumelo(Mario mario){
        mario.pontos += 100;
        System.out.println("Mario ganhou 100 pontos!");
    }
    @Override
    public void levarDano(Mario mario){
        if (mario.vidas > 0) {
            mario.vidas -= 1;
            System.out.println("Mario ficou pequeno!");
        } else {
            System.out.println("Game Over");
        }
    }
}
