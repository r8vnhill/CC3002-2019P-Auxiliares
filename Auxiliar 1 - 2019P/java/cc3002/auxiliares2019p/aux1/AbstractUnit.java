package cc3002.auxiliares2019p.aux1;

/**
 * This class represents a Unit from a generic game.
 * <p>
 * It's only used for teaching purposes
 *
 * @author Ignacio Slater Muñoz
 * @since 0.1.x01
 */
public abstract class AbstractUnit implements IUnit {

  private int hitPoints;
  protected int strength;

  public AbstractUnit(final int hitPoints, final int strength) {
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  protected void attack(IUnit enemy, int damage) {
    enemy.setHitPoints(enemy.getHitPoints() - damage);
  }

  @Override
  public int getHitPoints() {
    return hitPoints;
  }

  @Override
  public void setHitPoints(final int hitPoints) {
    this.hitPoints = hitPoints;
  }

}
