package pokemon.fire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.IPokemon;
import pokemon.grass.GrassAttack;
import pokemon.normal.NormalAttack;
import pokemon.normal.NormalPokemon;
import pokemon.water.WaterAttack;

/**
 * @author Ignacio Slater Muñoz
 * @version 1.1rc1
 * @since 1.1b12
 */
public class FirePokemonTest {

  private IPokemon
      audino,
      charmander;
  private FireAttack fireAttack;
  private GrassAttack grassAttack;
  private NormalAttack normalAttack;
  private WaterAttack waterAttack;

  @BeforeEach
  public void setUp() {
    fireAttack = new FireAttack("Ember", 40);
    grassAttack = new GrassAttack("Vine Whip", 45);
    normalAttack = new NormalAttack("Pound", 40);
    waterAttack = new WaterAttack("Bubble", 40);

    audino = new NormalPokemon("Audino", 100, new ArrayList<>());
    charmander = new FirePokemon("Charmander", 100,
        new ArrayList<>(Arrays.asList(fireAttack, normalAttack)));
  }

  @Test
  public void constructorTest() {
    assertEquals("Charmander", charmander.getName());
    assertEquals(100, charmander.getHP());
    assertEquals(2, charmander.getAttacks().size());
    assertEquals(fireAttack, charmander.getAttacks().get(0));
    assertEquals(normalAttack, charmander.getAttacks().get(1));
    assertNull(charmander.getSelectedAttack());
  }

  @Test
  public void selectAttackTest() {
    charmander.selectAttack(0);
    assertEquals(fireAttack, charmander.getSelectedAttack());
    charmander.selectAttack(1);
    assertEquals(normalAttack, charmander.getSelectedAttack());
  }

  @Test
  public void attackTest() {
    charmander.selectAttack(0);
    charmander.attack(audino);
    assertEquals(60, audino.getHP());
  }

  @Test
  public void receiveWaterAttack() {
    assertEquals(100, charmander.getHP());
    charmander.receiveWaterAttack(waterAttack);
    assertEquals(40, charmander.getHP());
  }

  @Test
  public void receiveGrassAttack() {
    assertEquals(100, charmander.getHP());
    charmander.receiveGrassAttack(grassAttack);
    assertEquals(75, charmander.getHP());
  }

  @Test
  public void receiveFireAttack() {
    assertEquals(100, charmander.getHP());
    charmander.receiveFireAttack(fireAttack);
    assertEquals(80, charmander.getHP());
  }

  @Test
  public void receiveNormalAttack() {
    assertEquals(100, charmander.getHP());
    charmander.receiveNormalAttack(normalAttack);
    assertEquals(60, charmander.getHP());
  }
}