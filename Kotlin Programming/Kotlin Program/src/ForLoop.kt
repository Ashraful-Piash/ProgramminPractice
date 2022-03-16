fun main(){
//    for (i in 1..10){
//        println(i)
//    }
//    for (i in 10 downTo 5){
//        println(i)
//    }
//    for (i in 20 downTo 5 step 2)
//        println(i)
//    for (i in 'a' .. 'z'){
//        print(i+" " )
//    }
    val myArray = arrayOf(4,5,6,6,9,2,3)
    var max = myArray[0]
    for(item in myArray){
        if(item> max){
            max = item
        }
    }
    println(max)

}