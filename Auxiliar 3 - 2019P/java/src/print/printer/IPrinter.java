package print.printer;

import java.io.IOException;
import print.document.PDFDocument;
import print.document.PSDocument;

/**
 * Definitions of the common behaviours between multiple printers.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.0b2
 * @since 1.0b1
 */
public interface IPrinter {

  /**
   * Runs an instruction in the command line
   *
   * @param instruction
   *     the command to be executed
   * @throws IOException
   *     if the command throws an error
   */
  default void execute(String instruction) throws IOException {
    Runtime.getRuntime().exec(instruction);
  }

  /**
   * Sends a PS document to the printer
   *
   * @param document
   *     the document to be printed
   * @throws IOException
   *     if an error occurs while processing the file
   */
  void printDuplexPS(PSDocument document) throws IOException;

  /**
   * Sends a PDF document to the printer
   *
   * @param document
   *     the document to be printed
   * @throws IOException
   *     if an error occurs while processing the file
   */
  void printDuplexPDF(PDFDocument document) throws IOException;
}