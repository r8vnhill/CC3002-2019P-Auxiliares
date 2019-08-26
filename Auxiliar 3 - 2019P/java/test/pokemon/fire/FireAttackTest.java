package pokemon.fire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.IAttack;
import pokemon.IPokemon;
import pokemon.grass.GrassPokemon;
import pokemon.normal.NormalPokemon;
import pokemon.water.WaterAttack;
import pokemon.water.WaterPokemon;

/**
 * Tests set for the FireAttack class.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1rc1
 * @since 1.1b12
 */
public class FireAttackTest {

  private IAttack fireAttack;
  private IPokemon
      charmander,
      treecko,
      totodile,
      audino;

  @BeforeEach
  public void setUp() {
    fireAttack = new FireAttack("Ember", 40);
    charmander = new FirePokemon("Charmander", 100, new ArrayList<>());
    treecko = new GrassPokemon("Treecko", 100, new ArrayList<>());
    totodile = new WaterPokemon("Totodile", 100, new ArrayList<>());
    audino = new NormalPokemon("Audino", 100, new ArrayList<>());
  }

  @Test
  public void constructorTest() {
    assertEquals("Ember", fireAttack.getName());
    assertEquals(40, fireAttack.getBaseDamage());
  }

  @Test
  public void attackTest() {
    fireAttack.attack(charmander);
    fireAttack.attack(treecko);
    fireAttack.attack(totodile);
    fireAttack.attack(audino);

    assertEquals(80, charmander.getHP());
    assertEquals(40, treecko.getHP());
    assertEquals(80, totodile.getHP());
    assertEquals(60, audino.getHP());
  }

  @Test
  public void equalsTest() {
    assertEquals(fireAttack, new FireAttack("Ember", 40));
    assertNotEquals(fireAttack, new FireAttack("Ember", 30));
    assertNotEquals(fireAttack, new FireAttack("Not Ember", 40));
    assertNotEquals(fireAttack, new WaterAttack("Ember", 40));
  }
}