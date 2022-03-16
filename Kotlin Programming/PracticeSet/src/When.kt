fun main(){
    val age = readLine()?.toInt()

    when (age ){
        in 0..5 -> print("u are a kid")
        in 6.. 17 -> print("u are teenager")
        18 -> println("u are 18")
        in 21 .. 65 -> println("u are adult")
        else -> print("old")
    }

}