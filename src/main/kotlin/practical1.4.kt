fun main(){
    println("Enter number:")
    var number = readLine()!!.toInt()

    if (number % 2==0)
        println("$number is even")
    else
        println("$number is odd")
}