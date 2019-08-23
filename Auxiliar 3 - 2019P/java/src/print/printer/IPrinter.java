package print.printer;

import java.io.IOException;
import print.document.IDocument;
import print.document.PDFDocument;
import print.document.PSDocument;

public interface IPrinter {

  default void execute(String instruction) throws IOException {
    Runtime.getRuntime().exec(instruction);
  }

  void printDuplexPS(PSDocument document) throws IOException;

  void printDuplexPDF(PDFDocument document) throws IOException;
}