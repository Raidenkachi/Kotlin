import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter firstnumber:")
    var firstnumber=read.nextFloat()

    println("Enter secondnumber:")
    var secondnumber=read.nextFloat()

    var quotient= firstnumber/secondnumber
    println("The quotient is $quotient")

    var remainder= firstnumber%secondnumber
    println("The remainder is $remainder")

}