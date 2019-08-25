package print.document;

import java.io.IOException;
import print.printer.IPrinter;

/**
 * Common interface for document classes.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.0b1
 * @since 1.0b1
 */
public interface IDocument {

  /**
   * @return the name of the document
   */
  String getName();

  /**
   * Sends the document to a printer
   *
   * @param printer where the document is gonna be printed
   * @throws IOException if an error occurs while processing the document
   */
  void printDuplex(IPrinter printer) throws IOException;
}
