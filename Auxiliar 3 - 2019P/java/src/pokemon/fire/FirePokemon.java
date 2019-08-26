package pokemon.fire;

import java.util.List;
import pokemon.AbstractPokemon;
import pokemon.IAttack;
import pokemon.grass.GrassAttack;
import pokemon.water.WaterAttack;

/**
 * Class that represents a fire type Pokémon.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b10
 * @since 1.1b1
 */
public class FirePokemon extends AbstractPokemon {

  public FirePokemon(String name, int hp, List<IAttack> attackList) {
    super(name, hp, attackList);
  }

  @Override
  public void receiveWaterAttack(WaterAttack attack) {
    receiveWeaknessAttack(attack);
  }

  @Override
  public void receiveGrassAttack(GrassAttack attack) {
    receiveResistantAttack(attack);
  }

  @Override
  public void receiveFireAttack(FireAttack attack) {
    receiveResistantAttack(attack);
  }
}
