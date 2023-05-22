import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter a:")
    var a=read.nextInt()

    println("Enter b:")
    var b=read.nextInt()

    println("Enter height:")
    var height=read.nextInt()

    var area=0.5*(a+b)*height
    println("The area of the trapezium is $area")

}