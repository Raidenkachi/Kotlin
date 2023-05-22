import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter firstnumber:")
    var firstnumber =read.nextFloat()

    println("Enter secondnumber:")
    var secondnumber =read.nextFloat()

    println("Enter Sign(+ - * /)")
    var ok=read.next()[0]

    var result = when(ok) {
        '+' -> firstnumber + secondnumber
        '-' -> firstnumber - secondnumber
        '*' -> firstnumber * secondnumber
        '/' -> firstnumber / secondnumber
        else -> "Invalid input"
    }
    println(result)






}