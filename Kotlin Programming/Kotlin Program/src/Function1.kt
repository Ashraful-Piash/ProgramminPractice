fun main(){
    sumUpToN(10)
    sumUpToN(5)
    

}

fun sumUpToN(n: Int) {
    var result = 0
    for (i in 1..n){
        result += i
    }
    println("The sum of the values from 1 to $n is $result")
}