fun main(){
    print("enter your age")
    val age = readLine()?.toInt()

    if(age in 0..5){
        print("you are a kid")
    }else if (age in 6..17){
        print("you are a teenager")
    }else if (age == 18){
        print("Finally you are 18")
    }else if (age ==19 || age == 20){
        print("you are a young adult")
    }else if (age in 21..65){
        println("u ar e and adult")
    }else {
        println("you are really old")
    }
}