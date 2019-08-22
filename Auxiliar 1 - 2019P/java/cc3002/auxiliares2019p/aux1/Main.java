package cc3002.auxiliares2019p.aux1;

/**
 * Simple example of using this package classes.
 */
public class Main {

  public static void main(String[] args) {
    Hero lyn = new Hero("Lyn"),
        eliwood = new Hero("Eliwood");
    System.out.println(lyn.getName() + " has " + lyn.getHitPoints() + " hit points.");
    System.out.println(eliwood.getName() + " has " + eliwood.getHitPoints() + " hit points.");
    lyn.attack(eliwood);
    System.out.println(lyn.getName() + " attacked " + eliwood.getName());
    System.out.println(eliwood.getName() + " has " + eliwood.getHitPoints() + " hit points.");
  }
}
