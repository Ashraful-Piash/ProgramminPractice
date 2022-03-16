fun main(){
//    val myArray = arrayOf(3,4,5,6,7,8)
//    var sum = 0
//    for (item in myArray){
//        sum += item
//    }
//    println("the sum of the array is $sum")
   println("enter 5 numbers")

    var avg = 0.0
    for(i in 1..5){
        var input = readLine()?.toInt()
        if(input !=null){
            avg += input/ 5.0
        }
    }
    println("the average of the value jis $avg")

}