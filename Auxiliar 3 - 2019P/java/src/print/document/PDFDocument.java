package print.document;

import java.io.IOException;
import print.printer.IPrinter;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public class PDFDocument extends AbstractDocument {
  @Override
  public void printDuplex(final IPrinter printer) throws IOException {
    printer.printDuplexPDF(this);
  }
}
