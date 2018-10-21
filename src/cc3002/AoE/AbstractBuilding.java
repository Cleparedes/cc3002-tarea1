package cc3002.AoE;

/**
 * Representa el estado general de un edificio en AoE (determinada por {@link Attackable}).
 *
 * @author Clemente Paredes G.
 */
public abstract class AbstractBuilding implements Attackable{

    private final int hp;
    protected final int ap;
    private double contDanno;

    /**
     * Contructor para un edificio cualquiera.
     *
     * @param hp    puntos de vida maximos para el edificio.
     * @param ap    puntos de ataque del edificio.
     */
    protected AbstractBuilding(final int hp, final int ap){
        this.hp = hp;
        this.ap = ap;
        contDanno = 0;
    }

    /**
     * Constructor modificado para un edificio incapaz de atacar.
     *
     * @param hp    puntos de vida maximos para el edificio.
     */
    protected AbstractBuilding(final int hp){
        this(hp, 0);
    }

    /**
     * Calcula los puntos de vida actuales del edificio restando el danno registrado a su vida maxima.
     *
     * @return  puntos de vida restantes del edificio.
     */
    @Override
    public double getHP(){
        return Math.min(hp, hp - contDanno);
    }

    /**
     * Verifica si el edificio esta destruido.
     *
     * @return  true si el edificio esta destruido, false en caso contrario.
     */
    @Override
    public boolean muerto(){
        return getHP() <= 0;
    }

    /**
     * Registra el danno recibido por el edificio.
     *
     * @param d danno infligido sobre el edificio.
     */
    @Override
    public void recibeDanno(double d){
        if(!muerto()) contDanno += d;
        if(contDanno < 0) contDanno = 0;
    }
}
