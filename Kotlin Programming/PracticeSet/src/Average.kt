fun main(){
    println("enter 5 numbers")

    var avg = 0.0
    for (i in 1..5){
        var input = readLine()?.toInt()
        if (input != null){
            avg += input/5.0
        }
    }
    println("The average value is $avg")

}
