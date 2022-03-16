fun main() {
    val list = mutableListOf<Int>()
    println("please enter 5 numbers")
    for (i in 1..5) {
        val x = readLine()?.toInt()
        if (x != null) {
            list.add(x)
        }
    }
    println("the 5 numbers in reverse order are: ")
    for ( i in list.size - 1 downTo 0) {
        println(list [i])
    }
}