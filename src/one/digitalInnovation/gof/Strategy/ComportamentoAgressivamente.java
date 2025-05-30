package one.digitalInnovation.gof.Strategy;

public class ComportamentoAgressivamente implements Comportamento{


    @Override
    public void mover() {
        System.out.println("Movendo-se Agresseivamente...");
    }
}
