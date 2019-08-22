package cc3002.auxiliares2019p.aux1


/**
 * Simple example of using this package classes.
 */
fun main() {
    val lyn = Hero("Lyn")
    val eliwood = Hero("Eliwood")
    println("${lyn.name} has ${lyn.hitPoints} hit points.")
    println("${eliwood.name} has ${eliwood.hitPoints} hit points.")
    lyn.attack(eliwood)
    println("${lyn.name} attacked ${eliwood.name}")
    println("${eliwood.name} has ${eliwood.hitPoints} hit points.")
}
