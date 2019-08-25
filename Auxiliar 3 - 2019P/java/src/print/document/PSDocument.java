package print.document;

import java.io.IOException;
import print.printer.IPrinter;

/**
 * This class represents a printable PS document.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.0b1
 * @since 1.0b1
 */
public class PSDocument extends AbstractDocument {

  @Override
  public void printDuplex(IPrinter printer) throws IOException {
    printer.printDuplexPS(this);
  }
}