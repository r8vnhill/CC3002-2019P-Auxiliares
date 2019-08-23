package print.document;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public abstract class AbstractDocument implements IDocument {

  private String name;

  @Override
  public String getName() {
    return name;
  }
}
