package pokemon.water;

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
import pokemon.normal.NormalPokemon;

/**
 * Tests set for the FireAttack class.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b15
 * @since 1.1b11
 */
public class WaterAttackTest {

  private IAttack waterAttack;
  private IPokemon
      charmander,
      treecko,
      totodile,
      audino;

  @BeforeEach
  public void setUp() {
    waterAttack = new WaterAttack("Bubble", 40);
    charmander = new FirePokemon("Charmander", 100, new ArrayList<>());
    treecko = new GrassPokemon("Treecko", 100, new ArrayList<>());
    totodile = new WaterPokemon("Totodile", 100, new ArrayList<>());
    audino = new NormalPokemon("Audino", 100, new ArrayList<>());
  }

  @Test
  public void constructorTest() {
    assertEquals("Bubble", waterAttack.getName());
    assertEquals(40, waterAttack.getBaseDamage());
  }

  @Test
  public void attackTest() {
    waterAttack.attack(charmander);
    waterAttack.attack(treecko);
    waterAttack.attack(totodile);
    waterAttack.attack(audino);

    assertEquals(20, charmander.getHP());
    assertEquals(80, treecko.getHP());
    assertEquals(80, totodile.getHP());
    assertEquals(60, audino.getHP());
  }

  @Test
  public void equalsTest() {
    assertEquals(waterAttack, new WaterAttack("Bubble", 40));
    assertNotEquals(waterAttack, new WaterAttack("Bubble", 30));
    assertNotEquals(waterAttack, new WaterAttack("Not Bubble", 40));
    assertNotEquals(waterAttack, new FireAttack("Bubble", 40));
  }
}