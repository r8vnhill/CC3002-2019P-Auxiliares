package print.printer;

import java.io.IOException;
import print.document.IDocument;
import print.document.PDFDocument;
import print.document.PSDocument;

public class SalitaPrinter implements IPrinter {

  public void printDuplex(IDocument document) throws IOException {
    execute("duplex " + document.getName() + "|lpr –P hp-335");
  }

  @Override
  public void printDuplexPS(final PSDocument document) throws IOException {
    //  TODO
  }

  @Override
  public void printDuplexPDF(final PDFDocument document) throws IOException {
    //  TODO
  }
}