package pokemon.normal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.IAttack;
import pokemon.IPokemon;
import pokemon.fire.FireAttack;
import pokemon.fire.FirePokemon;
import pokemon.grass.GrassPokemon;
import pokemon.water.WaterPokemon;

/**
 * @author Ignacio Slater Muñoz
 * @version 1.1b14
 * @since 1.1b11
 */
public class NormalAttackTest {

  private IAttack normalAttack;
  private IPokemon
      charmander,
      treecko,
      totodile,
      audino;

  @BeforeEach
  public void setUp() {
    normalAttack = new NormalAttack("Pound", 40);
    charmander = new FirePokemon("Charmander", 100, new ArrayList<>());
    treecko = new GrassPokemon("Treecko", 100, new ArrayList<>());
    totodile = new WaterPokemon("Totodile", 100, new ArrayList<>());
    audino = new NormalPokemon("Audino", 100, new ArrayList<>());
  }

  @Test
  public void constructorTest() {
    assertEquals("Pound", normalAttack.getName());
    assertEquals(40, normalAttack.getBaseDamage());
  }

  @Test
  public void attackTest() {
    normalAttack.attack(charmander);
    normalAttack.attack(treecko);
    normalAttack.attack(totodile);
    normalAttack.attack(audino);

    assertEquals(60, charmander.getHP());
    assertEquals(60, treecko.getHP());
    assertEquals(60, totodile.getHP());
    assertEquals(60, audino.getHP());
  }

  @Test
  public void equalsTest() {
    assertEquals(normalAttack, new NormalAttack("Pound", 40));
    assertNotEquals(normalAttack, new NormalAttack("Pound", 30));
    assertNotEquals(normalAttack, new NormalAttack("Not Pound", 40));
    assertNotEquals(normalAttack, new FireAttack("Pound", 40));
  }
}