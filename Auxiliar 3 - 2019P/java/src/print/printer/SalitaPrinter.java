package print.printer;

import java.io.IOException;
import print.document.PDFDocument;
import print.document.PSDocument;

/**
 * This class represents the HP335 printer that's outside the <i>Salita</i>.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b1
 * @since 1.1b1
 */
public class SalitaPrinter implements IPrinter {

  @Override
  public void printDuplexPS(final PSDocument document) throws IOException {
    execute("duplex " + document.getName() + "|lpr –P hp-335");
  }

  @Override
  public void printDuplexPDF(final PDFDocument document) throws IOException {
    execute("pdf2ps " + document.getName() + " out.ps");
    execute("duplex out.ps | lpr –P hp-335");
  }
}