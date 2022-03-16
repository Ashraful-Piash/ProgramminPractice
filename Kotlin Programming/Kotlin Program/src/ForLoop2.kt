fun main(){
//    for (i in 10 downTo 1 step 2){
//        println(i)
////    }
//    for (i in 'a'..'z'){
//        print(i +" ")
//    }
    val myArray = arrayOf(4,5,6,9,999,2,1)
    var max = myArray[0]
    for(item in myArray){
        if(item > max){
            max = item
        }
    }
    println(max)
}