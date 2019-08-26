package pokemon.water;

import java.util.List;
import pokemon.AbstractPokemon;
import pokemon.IAttack;
import pokemon.fire.FireAttack;
import pokemon.grass.GrassAttack;

/**
 * Class that represents a water type Pokémon.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b5
 * @since 1.1b1
 */
public class WaterPokemon extends AbstractPokemon {

  /**
   * Creates a new water Pokémon.
   *
   * @param name
   *     Pokémon's name.
   * @param hp
   *     Pokémon's hit points.
   * @param attackList
   *     Pokémon's attacks.
   */
  public WaterPokemon(String name, int hp, List<IAttack> attackList) {
    super(name, hp, attackList);
  }

  @Override
  public void receiveWaterAttack(WaterAttack attack) {
    receiveResistantAttack(attack);
  }

  @Override
  public void receiveGrassAttack(GrassAttack attack) {
    receiveWeaknessAttack(attack);
  }

  @Override
  public void receiveFireAttack(FireAttack attack) {
    receiveResistantAttack(attack);
  }
}
