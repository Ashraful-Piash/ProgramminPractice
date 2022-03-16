fun main(){
    println("enter number 1")
    var x = readLine()?.toInt()
    println("enter number 2")
    var y = readLine()?.toInt()

    var result = 1
    var i = 0

    while (x != null && y !=null && i <y){
        result *= x
        i++

    }
    println("$x to the power of $y is $result")
}