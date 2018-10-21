package cc3002.AoE;

/**
 * Representa el comportamiento de una entidad atacante en AoE.
 *
 * @author Clemente Paredes G.
 */
public interface Attacker extends Attackable {

    /**
     * Retorna los puntos de ataque de la entidad.
     *
     * @return puntos de ataque de la unidad.
     */
    int getAP();

    /**
     * Ataca a otra entidad.
     *
     * @param attackable la entidad siendo atacada.
     */
    void ataque(Attackable attackable);
}
