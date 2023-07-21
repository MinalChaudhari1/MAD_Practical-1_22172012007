fun main() {
    val number = readNumber("Enter number: ")
    val factorial = calculateFactorial(number)
    println("Factorial $number = $factorial")
    println("By TailRec keyword, factorial of 5 = $factorial")
}

fun readNumber(message: String): Int {
    print(message)
    return readLine()?.toIntOrNull() ?: run {
        println("Invalid input, using default value 5.")
        5
    }
}

fun calculateFactorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1 // Base case: factorial of 0 and 1 is 1
    } else {
        n * calculateFactorial(n - 1) // Recursive call to calculate factorial
    }
}
