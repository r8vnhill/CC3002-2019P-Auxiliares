package pokemon;

import java.util.ArrayList;
import pokemon.attack.IAttack;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class WaterPokemon extends AbstractPokemon {

  public WaterPokemon(final String name, final int hp, final ArrayList<IAttack> attacks) {
    super(name, hp, attacks);
  }

  public void attack(IPokemon enemy) {

  }

  @Override
  public IAttack getSelectedAttack() {
    return null;
  }
}
