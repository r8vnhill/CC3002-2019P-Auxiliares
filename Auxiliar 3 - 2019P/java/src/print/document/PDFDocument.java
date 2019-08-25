package print.document;

import java.io.IOException;
import print.printer.IPrinter;

/**
 * This class represents a printable PDF document.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.0b1
 * @since 1.0b1
 */
public class PDFDocument extends AbstractDocument {

  @Override
  public void printDuplex(final IPrinter printer) throws IOException {
    printer.printDuplexPDF(this);
  }
}
