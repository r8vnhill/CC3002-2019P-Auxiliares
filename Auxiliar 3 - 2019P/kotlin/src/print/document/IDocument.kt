package print.document

import print.printer.IPrinter

/**
 * Common interface for document classes.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0b1
 */
interface IDocument {

    var name: String

    fun printDuplex(printer: IPrinter)
}