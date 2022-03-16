fun main(){
    val myArray = arrayOf(2,3,4,4,9,1,0)
    var min = myArray[0]
    for(item in myArray){
        if(item < min){
            min = item
        }
    }
    println(min)
}