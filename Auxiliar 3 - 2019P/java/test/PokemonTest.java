import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.GrassPokemon;
import pokemon.IPokemon;
import pokemon.WaterPokemon;
import pokemon.attack.GrassAttack;
import pokemon.attack.IAttack;
import pokemon.attack.WaterAttack;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class PokemonTest {
  IPokemon totodile;
  IPokemon chikorita;

  @BeforeEach
  public void setUp() {
    totodile = new WaterPokemon("Totodile", 30, new ArrayList<>(
        Collections.singletonList(new WaterAttack("Bubble", 10))));
    chikorita = new GrassPokemon("Chikorita", 25, new ArrayList<>(
        Collections.singletonList(new GrassAttack("RazorLeaf", 8))));
  }

  @Test
  public void testConstructor() {
    assertEquals("Totodile", totodile.getName());
    assertEquals("Chikorita", chikorita.getName());
    assertEquals(30, totodile.getHP());
    assertEquals(25, chikorita.getHP());
    assertArrayEquals(new IAttack[] {new WaterAttack("Bubble", 10)},
        new List[]{totodile.getAttacks()});
    assertEquals(10, totodile.getDamage());
    assertEquals(8, chikorita.getDamage());
  }

  @Test
  public void testCombat() {
    assertEquals(30, totodile.getHP());
    assertEquals(25, chikorita.getHP());

    totodile.selectAttack(0);
    chikorita.selectAttack(0);

    totodile.attack(chikorita);
    assertEquals(30, totodile.getHP());
    assertEquals(25, chikorita.getHP());

    chikorita.attack(totodile);
    assertEquals(30 - 8 * 1.5, totodile.getHP());
    assertEquals(25, chikorita.getHP());
  }

  @Test
  public void testSelectAttack() {
    assertNull(totodile.getSelectedAttack());
    assertNull(chikorita.getSelectedAttack());

    totodile.selectAttack(0);
    chikorita.selectAttack(0);

    assertEquals(new WaterAttack("Bubble", 10), totodile.getSelectedAttack());
    assertEquals(new GrassAttack("Razor leaf", 8), chikorita.getSelectedAttack());
  }
}
