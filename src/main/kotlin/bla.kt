import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    add(1.2,2.3)
    subtraction(3.4,3.4)
    multiplication(23.3,46.5)
    division(45.5,55.4)
}
fun add(num1:Double, num2:Double) {
    println(num1+num2)
}

fun subtraction(num3:Double,num4:Double) {

    println(num3-num4)
}

fun multiplication(num5:Double,num6:Double) {
    println(num5*num6)
}

fun division(num7:Double,num8:Double) {
    println(num7/num8)
}
