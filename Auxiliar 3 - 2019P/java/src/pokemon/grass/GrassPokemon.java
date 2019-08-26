package pokemon.grass;

import cc3002.pokemon.AbstractPokemon;
import cc3002.pokemon.IAttack;
import cc3002.pokemon.fire.FireAttack;
import cc3002.pokemon.water.WaterAttack;
import java.util.List;

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
