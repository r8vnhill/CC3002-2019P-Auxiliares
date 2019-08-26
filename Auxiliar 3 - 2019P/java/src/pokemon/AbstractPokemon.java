package pokemon;

import java.util.List;
import pokemon.fire.FireAttack;
import pokemon.grass.GrassAttack;
import pokemon.normal.NormalAttack;
import pokemon.water.WaterAttack;

/**
 * Abstract class that represents a generic Pokémon. This class contains the necessary methods to
 * attack and receive damage, and definitions to get the properties of each Pokémon, like its name
 * and hp.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1rc1
 * @since 1.1b1
 */
public abstract class AbstractPokemon implements IPokemon {

  private String name;
  private int hp;
  private List<IAttack> attackList;
  private IAttack selectedAttack;

  /**
   * Creates a new Pokémon.
   *
   * @param name
   *     Pokémon's name.
   * @param hp
   *     Pokémon's hit points.
   * @param attackList
   *     Pokémon's attacks.
   */
  protected AbstractPokemon(String name, int hp, List<IAttack> attackList) {
    this.name = name;
    this.hp = hp;
    this.attackList = attackList;
  }

  @Override
  public void selectAttack(int index) {
    selectedAttack = attackList.get(index);
  }

  @Override
  public void attack(IPokemon other) {
    selectedAttack.attack(other);
  }

  @Override
  public void receiveWaterAttack(WaterAttack attack) {
    receiveAttack(attack);
  }

  /**
   * Receives an attack.
   *
   * @param attack
   *     Received attack.
   */
  protected void receiveAttack(IAttack attack) {
    this.hp -= attack.getBaseDamage();
  }

  @Override
  public void receiveGrassAttack(GrassAttack attack) {
    receiveAttack(attack);
  }

  @Override
  public void receiveFireAttack(FireAttack attack) {
    receiveAttack(attack);
  }

  @Override
  public void receiveNormalAttack(NormalAttack attack) {
    receiveAttack(attack);
  }

  /**
   * Receives an attack to which this Pokémon is weak.
   *
   * @param attack
   *     Received attack.
   */
  protected void receiveWeaknessAttack(IAttack attack) {
    this.hp -= attack.getBaseDamage() * 1.5;
  }

  /**
   * Receives an attack to which this Pokémon is resistant.
   *
   * @param attack
   *     Received attack.
   */
  protected void receiveResistantAttack(IAttack attack) {
    this.hp -= attack.getBaseDamage() - 20;
  }

  //region Properties
  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getHP() {
    return hp;
  }

  @Override
  public List<IAttack> getAttacks() {
    return attackList;
  }

  @Override
  public IAttack getSelectedAttack() {
    return selectedAttack;
  }
  //endregion
}