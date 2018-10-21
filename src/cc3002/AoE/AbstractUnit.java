package cc3002.AoE;

/**
 * Representa el estado general de una unidad en AoE (determinada por {@link Attacker}).
 *
 * @author Clemente Paredes G.
 */
public abstract class AbstractUnit implements Attacker{

    private final int hp;
    private final int ap;
    private double contDanno;

    /**
     * Contructor para una unidad cualquiera:
     * Como las unidades puede alcanzar el doble de sus HP maximos se inicializa hp con el doble de lo requerido y se
     * corrige con el contador de danno.
     *
     * @param hp        puntos de vida totales de una unidad.
     * @param ap        puntos de ataque de la unidad.
     */
    protected AbstractUnit(final int hp, final int ap){
        this.hp = 2*hp;
        this.ap = ap;
        contDanno = hp;
    }

    /**
     * Calcula los puntos de vida actuales de la unidad restando el danno registrado a su vida maxima.
     *
     * @return puntos de vida restantes de la unidad.
     */
    @Override
    public double getHP(){
        return Math.min(hp, hp - contDanno);
    }

    /**
     * Retorna los puntos de ataque de la unidad.
     *
     * @return puntos de ataque de la unidad.
     */
    @Override
    public int getAP(){
        return ap;
    }

    /**
     * Verifica si la unidad esta muerta (ha alcanzado los 0 HP).
     *
     * @return true si la unidad esta muerta, false si sique viva.
     */
    @Override
    public boolean muerto(){
        return getHP() <= 0;
    }

    /**
     * Registra el daño recibido por la unidad, si esta sigue viva y evita que el contador de daño llegue a ser negativo.
     *
     * @param d danno infligido sobre la unidad.
     */
    @Override
    public void recibeDanno(double d){
        if(!muerto()) contDanno += d;
        if(contDanno < 0) contDanno = 0;
    }
}
