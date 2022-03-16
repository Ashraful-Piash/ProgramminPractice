    fun main(){
//        print("enter a number")
//        val userInput = readLine()
//        println(userInput?.toInt())
//        val userInput1 = readLine()
//        println(userInput1?.toUpperCase())
        println("enter your age ")
        val age = readLine()?.toInt()
        if (age!=null){
            if(age >=0 && age <18){
                println("Your age is $age and you are not an adult yet")
            }else if (age >=18 && age <60){
                println("Your age is $age and you are an adult")
            }else{
                println("Your age is $age and you are too old")
            }
        }

    }

