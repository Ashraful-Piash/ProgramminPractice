fun main(){
    print("Enter your string: ")
    val userInput = readLine()

        val newInput = userInput?.reversed()
        if(userInput == newInput){
            println("the word $userInput is a palindrome")
        }else{
            println("the word $userInput is not a palindrome")
        }
    }
