package cc3002.AoE;

/**
 * Representa un monje en AoE, especificacion del abstracto {@link AbstractUnit}.
 *
 * @author Clemente Paredes G.
 */
public class Monk extends AbstractUnit {

    /**
     * Constructor de monje.
     *
     * @param hp    puntos de vida iniciales.
     * @param ap    puntos de ataque.
     */
    public Monk(int hp, int ap) {
        super(hp, ap);
    }

    /**
     * Si esta vivo, monje ataca a una entidad atacable.
     *
     * @param attackable la entidad siendo atacada.
     */
    @Override
    public void ataque(Attackable attackable) {
        if(!muerto()) attackable.recibeAtaqueMonje(this);
    }

    /**
     * Un ataque de infanteria es letal para un monje.
     *
     * @param infantryUnit el atacante.
     */
    @Override
    public void recibeAtaqueInfanteria(InfantryUnit infantryUnit) {
        recibeDanno(this.getHP());
    }

    /**
     * Un ataque de arqueria es letal para un monje.
     *
     * @param archeryUnit el atacante.
     */
    @Override
    public void recibeAtaqueArqueria(ArcheryUnit archeryUnit) {
        recibeDanno(this.getHP());
    }

    /**
     * Un ataque de caballeria es letal para un monje.
     *
     * @param cavalryUnit el atacante.
     */
    @Override
    public void recibeAtaqueCaballeria(CavalryUnit cavalryUnit) {
        recibeDanno(this.getHP());
    }

    /**
     * Un ataque de asedio es letal para un monje.
     *
     * @param siegeUnit el atacante.
     */
    @Override
    public void recibeAtaqueAsedio(SiegeUnit siegeUnit) {
        recibeDanno(this.getHP());
    }

    /**
     * El ataque de un aldeano no tiene efecto sobre un monje.
     *
     * @param villager el atacante.
     */
    @Override
    public void recibeAtaqueAldeano(Villager villager) {
        return;
    }

    /**
     * Registra el danno curado por un monje.
     *
     * @param monk el "atacante".
     */
    @Override
    public void recibeAtaqueMonje(Monk monk) {
        recibeDanno(-0.5 * monk.getAP());
    }

    /**
     * Un ataque de castillo es letal para un monje.
     *
     * @param castle el atacante.
     */
    @Override
    public void recibeAtaqueCastillo(Castle castle) {
        recibeDanno(this.getHP());
    }
}
