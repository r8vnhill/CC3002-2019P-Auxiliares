package cc3002.auxiliares2019p.aux1

/**
 * This class represents a Hero.
 * A Hero is a particular type of unit.
 *
 * @author Ignacio Slater Muñoz
 * @since 0.0.x01
 */
class Hero(val name: String) : AbstractUnit(16, 4) {

    /**
     * Attacks another unit.
     *
     * @param enemy
     * the target of the attack
     */
    override fun attack(enemy: IUnit) {
        attack(enemy, strength)
    }
}
