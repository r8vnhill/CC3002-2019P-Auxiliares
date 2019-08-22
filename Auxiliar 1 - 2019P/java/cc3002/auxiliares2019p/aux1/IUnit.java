package cc3002.auxiliares2019p.aux1;

/**
 * Common interface for all units.
 *
 * @author Ignacio Slater Muñoz
 * @since 0.0.x01
 */
public interface IUnit {

  /**
   * @return this unit's hit points
   */
  int getHitPoints();

  /**
   * @param hitPoints
   *     new hit points for this unit.
   */
  void setHitPoints(int hitPoints);

  /**
   * Attacks another unit.
   *
   * @param enemy
   *     the target of the attack
   */
  void attack(IUnit enemy);

}
