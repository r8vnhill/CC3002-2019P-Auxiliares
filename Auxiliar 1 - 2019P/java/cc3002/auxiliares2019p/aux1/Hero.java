package cc3002.auxiliares2019p.aux1;

/**
 * This class represents a Hero.
 * A Hero is a particular type of unit.
 *
 * @author Ignacio Slater Muñoz
 * @since 0.0.x01
 */
public class Hero extends AbstractUnit {

  private final String name;

  public Hero(final String name) {
    super(16, 4);
    this.name = name;
  }

  /**
   * Attacks another unit.
   *
   * @param enemy
   *     the target of the attack
   */
  @Override
  public void attack(final IUnit enemy) {
    attack(enemy, strength);
  }

  public String getName() {
    return name;
  }
}
