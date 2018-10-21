package cc3002.AoE;

/**
 * Representa un castillo en AoE, especificacion del abstracto {@link AbstractBuilding}.
 *
 * @author Clemente Paredes G.
 */
public class Castle extends AbstractBuilding implements Attacker {

    /**
     * Constructor de castillo.
     *
     * @param hp    puntos de vida iniciales.
     * @param ap    puntos de ataque.
     */
    public Castle(int hp, int ap) {
        super(hp, ap);
    }

    /**
     * Retorna los puntos de ataque del castillo.
     *
     * @return puntos de ataque del castillo.
     */
    @Override
    public int getAP() {
        return ap;
    }

    /**
     * Si no ha sido destruido, castillo ataca a una entidad atacable.
     *
     * @param attackable la entidad siendo atacada.
     */
    @Override
    public void ataque(Attackable attackable) {
        if(!muerto()) attackable.recibeAtaqueCastillo(this);
    }

    /**
     * Registra el danno recibido de una unidad de infanteria.
     *
     * @param infantryUnit el atacante.
     */
    @Override
    public void recibeAtaqueInfanteria(InfantryUnit infantryUnit) {
        recibeDanno(0.3 * infantryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de arqueria.
     *
     * @param archeryUnit el atacante.
     */
    @Override
    public void recibeAtaqueArqueria(ArcheryUnit archeryUnit) {
        recibeDanno(0.1 * archeryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de caballeria.
     *
     * @param cavalryUnit el atacante.
     */
    @Override
    public void recibeAtaqueCaballeria(CavalryUnit cavalryUnit) {
        recibeDanno(0.3 * cavalryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de asedio.
     *
     * @param siegeUnit el atacante.
     */
    @Override
    public void recibeAtaqueAsedio(SiegeUnit siegeUnit) {
        recibeDanno(2 * siegeUnit.getAP());
    }

    /**
     * Registra el danno reparado por un aldeano.
     *
     * @param villager el "atacante".
     */
    @Override
    public void recibeAtaqueAldeano(Villager villager) {
        recibeDanno(-0.3 * villager.getAP());
    }

    /**
     * El ataque de un monje no tiene efecto sobre un castillo.
     *
     * @param monk el atacante.
     */
    @Override
    public void recibeAtaqueMonje(Monk monk) {
        return;
    }

    /**
     * Registra el danno recibido de un castillo
     *
     * @param castle el atacante.
     */
    @Override
    public void recibeAtaqueCastillo(Castle castle) {
        recibeDanno(0.1 * castle.getAP());
    }
}
