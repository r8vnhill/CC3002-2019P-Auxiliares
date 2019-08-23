package print.document;

import java.io.IOException;
import print.printer.IPrinter;

public class PSDocument extends AbstractDocument {
  
  /**
   * Sends a .ps document to a printer via command line.
   */
  @Override
  public void printDuplex(IPrinter printer) throws IOException {
    printer.printDuplexPS(this);
  }
}