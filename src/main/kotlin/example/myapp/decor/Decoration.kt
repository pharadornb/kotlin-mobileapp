package example.myapp.decor

//data class Decoration(val rocks: String) {
//
//}
//
//fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println (decoration1.equals(decoration2))
//    println (decoration3.equals(decoration2))
//}

//data class Decoration2(val rocks: String, val wood: String, val diver: String){
//}
//
//fun makeDecorations() {
//    val d5 = Decoration2("crystal", "wood", "diver")
//    println(d5)
//
//// Assign all properties to variables.
//    val (rock, wood, diver) = d5
//    println(rock)
//    println(wood)
//    println(diver)
//}

//Create a Companion Object
class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}