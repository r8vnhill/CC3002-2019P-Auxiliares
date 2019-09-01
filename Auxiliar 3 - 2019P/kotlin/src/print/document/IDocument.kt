package print.document

import print.printer.IPrinter

/**
 * Common interface for document classes.
 *
 * @author Ignacio Slater Muñoz
 * @version 1.2b1
 * @since 1.2b1
 */
interface IDocument {

    var name: String

    fun printDuplex(printer: IPrinter)
}