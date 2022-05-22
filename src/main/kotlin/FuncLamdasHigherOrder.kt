
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

//Learn about lambdas
fun main() {
//    var dirtyLevel = 20
//    val waterFilter = { dirty: Int -> dirty / 2 }
//    println(waterFilter(dirtyLevel))

//    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

//    Create a higher-order function
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1
    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}