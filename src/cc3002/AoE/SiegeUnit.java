package cc3002.AoE;

/**
 * Representa una unidad de asedio en AoE, especificacion del abstracto {@link AbstractUnit}.
 *
 * @author Clemente Paredes G.
 */
public class SiegeUnit extends AbstractUnit {

    /**
     * Constructor de asedio.
     *
     * @param hp    puntos de vida iniciales.
     * @param ap    puntos de ataque.
     */
    public SiegeUnit(final int hp, final int ap){
        super(hp, ap);
    }

    /**
     * Si no ha sido destruida, asedio ataca a una entidad atacable.
     *
     * @param attackable la entidad siendo atacada.
     */
    @Override
    public void ataque(Attackable attackable) {
        if(!muerto()) attackable.recibeAtaqueAsedio(this);
    }

    /**
     * Registra el danno recibido de una unidad de infanteria.
     *
     * @param infantryUnit el atacante.
     */
    @Override
    public void recibeAtaqueInfanteria(InfantryUnit infantryUnit) {
        recibeDanno(1.2 * infantryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de arqueria.
     *
     * @param archeryUnit el atacante.
     */
    @Override
    public void recibeAtaqueArqueria(ArcheryUnit archeryUnit) {
        recibeDanno(0.8 * archeryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de caballeria.
     *
     * @param cavalryUnit el atacante.
     */
    @Override
    public void recibeAtaqueCaballeria(CavalryUnit cavalryUnit) {
        recibeDanno(1.2 * cavalryUnit.getAP());
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
     * Registra el danno reparado por un aldeano.
     *
     * @param villager el "atacante".
     */
    @Override
    public void recibeAtaqueAldeano(Villager villager) {
        recibeDanno(-0.5 * villager.getAP());
    }

    /**
     * El ataque de un monje no tiene efecto sobre una unidad de asedio.
     *
     * @param monk el atacante.
     */
    @Override
    public void recibeAtaqueMonje(Monk monk) {
        return;
    }

    /**
     * Registra el danno recibido de un castillo.
     *
     * @param castle el atacante.
     */
    @Override
    public void recibeAtaqueCastillo(Castle castle) {
        recibeDanno(0.5 * castle.getAP());
    }
}
