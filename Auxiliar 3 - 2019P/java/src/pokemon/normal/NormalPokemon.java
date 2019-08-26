package pokemon.normal;

import cc3002.pokemon.AbstractPokemon;
import cc3002.pokemon.IAttack;
import java.util.List;

/**
 * Class that represents a normal type Pokémon.
 *
 * @author Ignacio Slater Muñoz
 */
public class NormalPokemon extends AbstractPokemon {

  /**
   * Creates a new normal Pokémon.
   *
   * @param name
   *     Pokémon's name.
   * @param hp
   *     Pokémon's hit points.
   * @param attackList
   *     Pokémon's attacks.
   */
  public NormalPokemon(String name, int hp, List<IAttack> attackList) {
    super(name, hp, attackList);
  }
}
