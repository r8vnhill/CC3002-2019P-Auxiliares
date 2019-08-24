package pokemon;

import java.util.ArrayList;
import java.util.List;
import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class GrassPokemon extends AbstractPokemon {

  private IAttack selectedAttack;
  public GrassPokemon(final String name, final int hp, final ArrayList<IAttack> attacks) {
    super(name, hp, attacks);
  }

  @Override
  public void attack(final IPokemon pokemon) {
    selectedAttack.attack(pokemon);
  }

  @Override
  public IAttack getSelectedAttack() {
    return null;
  }

  @Override
  public List<IAttack> getAttacks() {
    return null;
  }

  @Override
  public void receiveGrassAttack(final GrassAttack grassAttack) {
    hp -= grassAttack.getDamage() - 20;
  }
}
