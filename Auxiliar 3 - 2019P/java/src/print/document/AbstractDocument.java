package print.document;

/**
 * Abstract class containing the common behaviour of document objects.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.0b1
 * @since 1.0b1
 */
public abstract class AbstractDocument implements IDocument {

  private String name;

  @Override
  public String getName() {
    return name;
  }
}