import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    val zero=0
    var number=read.nextFloat()

    if (number>zero){
        println("The number is positive")
    }
    else if(number<zero){
        println("The number is negative")
    }
    else{
        println("The number is zero")
    }


}