package pokemon.normal;

import java.util.List;
import pokemon.AbstractPokemon;
import pokemon.IAttack;

/**
 * Class that represents a normal type Pokémon.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b7
 * @since 1.1b1
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
