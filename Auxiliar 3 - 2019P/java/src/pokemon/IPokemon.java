package pokemon;

import java.util.List;
import pokemon.fire.FireAttack;
import pokemon.grass.GrassAttack;
import pokemon.normal.NormalAttack;
import pokemon.water.WaterAttack;

/**
 * A representation of a Pokémon that can battle others.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.2b1
 * @since 1.2b1
 */
public interface IPokemon {

  //region Properties

  /**
   * @return Pokémon's name.
   */
  String getName();

  /**
   * @return Pokémon's hit points
   */
  int getHP();

  /**
   * @return List with all the Pokémon attacks.
   */
  List<cc3002.pokemon.IAttack> getAttacks();

  /**
   * @return The current selected attack.
   */
  cc3002.pokemon.IAttack getSelectedAttack();
  //endregion

  /**
   * Attacks another Pokémon.
   *
   * @param other
   *     Target of the attack.
   */
  void attack(IPokemon other);

  /**
   * Selects an attack.
   *
   * @param index
   *     Index of the attack to be selected.
   */
  void selectAttack(int index);

  /**
   * Receives damage from a water attack.
   *
   * @param attack
   *     Received attack.
   */
  void receiveWaterAttack(WaterAttack attack);

  /**
   * Receives damage from a grass attack.
   *
   * @param attack
   *     Received attack.
   */
  void receiveGrassAttack(GrassAttack attack);

  /**
   * Receives damage from a fire attack.
   *
   * @param attack
   *     Received attack.
   */
  void receiveFireAttack(FireAttack attack);

  /**
   * Receives damage from a normal attack.
   *
   * @param attack
   *     Received attack.
   */
  void receiveNormalAttack(NormalAttack attack);
}
