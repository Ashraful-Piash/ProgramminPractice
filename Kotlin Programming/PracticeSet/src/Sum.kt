fun main () {
    val myArray = arrayOf(3,2,5,6,8)
    var sum = 0
    for (item in myArray){
        sum += item
    }
    println("the sum of the array is $sum")
}