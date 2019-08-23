package print.document;

import java.io.IOException;
import print.printer.IPrinter;

/**
 * @author Ignacio Slater Muñoz
 * @since
 */
public interface IDocument {

  String getName();

  void printDuplex(IPrinter printer) throws IOException;
}
