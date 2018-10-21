package cc3002.AoE;

/**
 * Representa una barraca en AoE, especificacion del abstracto {@link AbstractBuilding}.
 *
 * @author Clemente Paredes G.
 */
public class Barracks extends AbstractBuilding {

    /**
     * Constructor de barraca
     *
     * @param hp    Puntos de vida maximos
     */
    public Barracks(int hp) {
        super(hp);
    }

    /**
     * Registra el danno recibido de una unidad de infanteria.
     *
     * @param infantryUnit el atacante.
     */
    @Override
    public void recibeAtaqueInfanteria(InfantryUnit infantryUnit) {
        recibeDanno(0.7 * infantryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de arqueria.
     *
     * @param archeryUnit el atacante.
     */
    @Override
    public void recibeAtaqueArqueria(ArcheryUnit archeryUnit) {
        recibeDanno(0.7 * archeryUnit.getAP());
    }

    /**
     * Registra el danno recibido de una unidad de caballeria.
     *
     * @param cavalryUnit el atacante.
     */
    @Override
    public void recibeAtaqueCaballeria(CavalryUnit cavalryUnit) {
        recibeDanno(0.7 * cavalryUnit.getAP());
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
        recibeDanno(-0.7 * villager.getAP());
    }

    /**
     * El ataque de un monje no tiene efecto sobre una barraca.
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
        recibeDanno(0.7 * castle.getAP());
    }
}
