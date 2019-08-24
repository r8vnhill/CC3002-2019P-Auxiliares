package pokemon;

import java.util.List;
import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public interface IPokemon {

  String getName();

  int getHP();

  int getDamage();

  void attack(IPokemon pokemon);

  void selectAttack(int index);

  IAttack getSelectedAttack();

  List<IAttack> getAttacks();

  void receiveGrassAttack(GrassAttack grassAttack);
}
