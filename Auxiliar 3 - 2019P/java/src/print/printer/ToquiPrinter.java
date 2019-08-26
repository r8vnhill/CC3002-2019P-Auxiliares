package print.printer;

import java.io.IOException;
import print.document.PDFDocument;
import print.document.PSDocument;

/**
 * This class represents the printers in Toqui.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.1b1
 * @since 1.1b1
 */
public class ToquiPrinter implements IPrinter {

  @Override
  public void printDuplexPS(PSDocument document) throws IOException {
    execute("duplex " + document.getName() + "|lpr");
  }

  @Override
  public void printDuplexPDF(PDFDocument document) throws IOException {
    execute("pdf2ps " + document.getName() + " out.ps");
    execute("duplex " + document.getName() + "|lpr");
  }
}