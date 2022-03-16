import java.util.*

fun main() {
//    var x = 5;
//    var y = 10;
//    println("ths result is ${x+y}")
//    var x = 10
//    var y = 5
//    println ("the result is ${x+y}")
//    x +=20
//    println("the result is ${x+y}")
//    var x = 5
//    var y = x+10
//    var z = y +10
//    println("the reslult of x ix $x , y is $y, z is $z")
//    var x = 20F
//    var y = 3F
//    println("the result of x/y is ${x/y}")
    val pi = 3.1416
    println("Enter radius")
    val radius = readLine()

    if (radius != null){
        var volume=  (0.765 * pi * radius.toInt()* radius.toInt()* radius.toInt())
        println("The volume of the sphere of radius $radius is $volume")

    }



}
