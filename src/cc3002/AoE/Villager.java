package cc3002.AoE;

/**
 * Representa un aldeano en AoE, especificacion del abstracto {@link AbstractUnit}.
 *
 * @author Clemente Paredes G.
 */
public class Villager extends AbstractUnit{

    /**
     * Constructor de aldeano.
     *
     * @param hp    puntos de vida iniciales.
     * @param ap    puntos de ataque.
     */
    public Villager(final int hp, final int ap) {
        super(hp, ap);
    }

    /**
     * Si esta vivo, aldeano ataca a una entidad atacable.
     *
     * @param attackable la entidad siendo atacada.
     */
    @Override
    public void ataque(Attackable attackable) {
        if(!muerto()) attackable.recibeAtaqueAldeano(this);
    }

    /**
     * Registra el danno recibido de una unidad de infanteria.
     *
     * @param infantryUnit el atacante.
     */
    @Override
    public void recibeAtaqueInfanteria(InfantryUnit infantryUnit) {
        recibeDanno(1.5 * infantryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de arqueria.
     *
     * @param archeryUnit el atacante.
     */
    @Override
    public void recibeAtaqueArqueria(ArcheryUnit archeryUnit) {
        recibeDanno(1.5 * archeryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de caballeria.
     *
     * @param cavalryUnit el atacante.
     */
    @Override
    public void recibeAtaqueCaballeria(CavalryUnit cavalryUnit) {
        recibeDanno(1.5 * cavalryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de asedio.
     *
     * @param siegeUnit el atacante.
     */
    @Override
    public void recibeAtaqueAsedio(SiegeUnit siegeUnit) {
        recibeDanno(1.5 * siegeUnit.getAP());
    }

    /**
     * Registra el danno recibido de un aldeano.
     *
     * @param villager el atacante.
     */
    @Override
    public void recibeAtaqueAldeano(Villager villager) {
        recibeDanno(villager.getAP());
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
     * Registra el danno recibido de un castillo.
     *
     * @param castle el atacante.
     */
    @Override
    public void recibeAtaqueCastillo(Castle castle) {
        recibeDanno(1.2 * castle.getAP());
    }
}
