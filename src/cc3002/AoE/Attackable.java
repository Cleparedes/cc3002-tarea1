package cc3002.AoE;

/**
 * Representa el comportamiento de una entidad cualquiera en AoE.
 *
 * @author Clemente Paredes G.
 */
public interface Attackable {

    /**
     * Retorna los puntos de vida de la entidad.
     *
     * @return puntos de vida de la unidad.
     */
    double getHP();

    /**
     * Verifica si la entidad ha alcanzado los 0 puntos de vida.
     *
     * @return true si la entidad esta muerta, falso si no.
     */
    boolean muerto();

    /**
     * Aumenta el contador de daño de la entidad.
     *
     * @param d danno infligido sobre la entidad.
     */
    void recibeDanno(double d);

    /**
     * Recibe un ataque de infanteria.
     *
     * @param infantryUnit el atacante.
     */
    void recibeAtaqueInfanteria(InfantryUnit infantryUnit);

    /**
     * Recibe un ataque de arqueria.
     *
     * @param archeryUnit el atacante.
     */
    void recibeAtaqueArqueria(ArcheryUnit archeryUnit);

    /**
     * Recibe un ataque de caballeria.
     *
     * @param cavalryUnit el atacante.
     */
    void recibeAtaqueCaballeria(CavalryUnit cavalryUnit);

    /**
     * Recibe un ataque de asedio.
     *
     * @param siegeUnit el atacante.
     */
    void recibeAtaqueAsedio(SiegeUnit siegeUnit);

    /**
     * Recibe un ataque de aldeano.
     *
     * @param villager el atacante.
     */
    void recibeAtaqueAldeano(Villager villager);

    /**
     * Recibe un ataque de monje.
     *
     * @param monk el atacante.
     */
    void recibeAtaqueMonje(Monk monk);

    /**
     * Recibe un ataque de castillo.
     *
     * @param castle el atacante.
     */
    void recibeAtaqueCastillo(Castle castle);
}
