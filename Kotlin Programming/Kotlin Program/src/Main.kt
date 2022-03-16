fun main() {
    var myAge: Int = 25
    println("My age is : $myAge")
    var myFavouriteNum : Int = 2000
    println("My favourite num is $myFavouriteNum")

    var x = 2F
    var y = 3F
    println(x/y)

    val string = "ALLAH , help me please"
    println("The string is: ${string.toUpperCase()}")

    print("Enter your name :")
    val myName = readLine()
    if(myName!=null)
    println("My name is ${myName.toUpperCase().reversed()}")


}