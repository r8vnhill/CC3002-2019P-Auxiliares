package pokemon;

import java.util.ArrayList;
import pokemon.attack.IAttack;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public abstract class AbstractPokemon implements IPokemon {
  private String name;
  private int hp;
  private int damage;

  public AbstractPokemon(final String name, final int hp, final ArrayList<IAttack> attacks) {
    this.name = name;
    this.hp = hp;
    this.damage = attacks;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getHP() {
    return hp;
  }

  @Override
  public int getDamage() {
    return damage;
  }

  @Override
  public void selectAttack(int index) {

  }
}
