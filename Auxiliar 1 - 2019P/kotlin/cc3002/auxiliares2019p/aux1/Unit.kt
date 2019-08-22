package cc3002.auxiliares2019p.aux1

/**
 * Common interface for all units.
 *
 * @author Ignacio Slater Muñoz
 * @since 0.0.x01
 */
interface IUnit {
    var hitPoints: Int
    val strength: Int

    /**
     * Attacks another unit.
     *
     * @param enemy the target of the attack
     */
    fun attack(enemy: IUnit)
}

/**
 * This class represents a Unit from a generic game.
 *
 *
 * It's only used for teaching purposes
 *
 * @author Ignacio Slater Muñoz
 * @since 0.1.x01
 */
abstract class AbstractUnit(override var hitPoints: Int, override var strength: Int) : IUnit {

    protected fun attack(enemy: IUnit, damage: Int) {
        enemy.hitPoints -= damage
    }

}
