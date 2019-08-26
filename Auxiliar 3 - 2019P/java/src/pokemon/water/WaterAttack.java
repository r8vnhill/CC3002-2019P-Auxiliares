package pokemon.water;

import pokemon.AbstractAttack;
import pokemon.IPokemon;

/**
 * This class defines the logic of a water type attack.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b6
 * @since 1.1b1
 */
public class WaterAttack extends AbstractAttack {

  /**
   * Creates a new water type attack.
   * {@inheritDoc}
   *
   * @param name
   *     Attack's name.
   * @param baseDamage
   *     Attack's base damage.
   */
  public WaterAttack(String name, int baseDamage) {
    super(name, baseDamage);
  }

  @Override
  public void attack(IPokemon other) {
    other.receiveWaterAttack(this);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof WaterAttack && super.equals(obj);
  }
}