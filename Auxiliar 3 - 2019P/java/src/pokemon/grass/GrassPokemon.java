package pokemon.grass;

import java.util.List;
import pokemon.AbstractPokemon;
import pokemon.IAttack;
import pokemon.fire.FireAttack;
import pokemon.water.WaterAttack;

/**
 * Class that represents a grass type Pokémon.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b9
 * @since 1.1b1
 */
public class GrassPokemon extends AbstractPokemon {

  /**
   * Creates a new grass Pokémon.
   *
   * @param name
   *     Pokémon's name.
   * @param hp
   *     Pokémon's hit points.
   * @param attackList
   *     Pokémon's attacks.
   */
  public GrassPokemon(String name, int hp, List<IAttack> attackList) {
    super(name, hp, attackList);
  }

  public void receiveWaterAttack(WaterAttack attack) {
    receiveResistantAttack(attack);
  }

  @Override
  public void receiveFireAttack(FireAttack attack) {
    receiveWeaknessAttack(attack);
  }

  @Override
  public void receiveGrassAttack(GrassAttack attack) {
    receiveResistantAttack(attack);
  }
}
