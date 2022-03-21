fun main() {
    printPow(3, 5)
    printPow(5,3)
    printPow(7,8)

}

fun printPow (base : Int, exponent: Int){
    var result = 1
    for( i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
}