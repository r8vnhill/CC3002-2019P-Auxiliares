package pokemon.attack;

import pokemon.IPokemon;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class GrassAttack extends AbstractAttack {

  public GrassAttack(final String name, final int damage) {
    super(name, damage);
  }

  @Override
  public void attack(final IPokemon pokemon) {
    pokemon.receiveGrassAttack(this);
  }
}
