package pokemon.grass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.IAttack;
import pokemon.IPokemon;
import pokemon.fire.FireAttack;
import pokemon.fire.FirePokemon;
import pokemon.normal.NormalPokemon;
import pokemon.water.WaterPokemon;

/**
 * Tests set for the GrassAttack class.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1rc1
 * @since 1.1b11
 */
public class GrassAttackTest {

  private IAttack grassAttack;
  private IPokemon
      charmander,
      treecko,
      totodile,
      audino;

  @BeforeEach
  public void setUp() {
    grassAttack = new GrassAttack("Vine Whip", 45);
    charmander = new FirePokemon("Charmander", 100, new ArrayList<>());
    treecko = new GrassPokemon("Treecko", 100, new ArrayList<>());
    totodile = new WaterPokemon("Totodile", 100, new ArrayList<>());
    audino = new NormalPokemon("Audino", 100, new ArrayList<>());
  }

  @Test
  public void constructorTest() {
    assertEquals("Vine Whip", grassAttack.getName());
    assertEquals(45, grassAttack.getBaseDamage());
  }

  @Test
  public void attackTest() {
    grassAttack.attack(charmander);
    grassAttack.attack(treecko);
    grassAttack.attack(totodile);
    grassAttack.attack(audino);

    assertEquals(75, charmander.getHP());
    assertEquals(75, treecko.getHP());
    assertEquals(32, totodile.getHP());
    assertEquals(55, audino.getHP());
  }

  @Test
  public void equalsTest() {
    assertEquals(grassAttack, new GrassAttack("Vine Whip", 45));
    assertNotEquals(grassAttack, new GrassAttack("Vine Whip", 30));
    assertNotEquals(grassAttack, new GrassAttack("Not Vine Whip", 45));
    assertNotEquals(grassAttack, new FireAttack("Vine Whip", 45));
  }
}