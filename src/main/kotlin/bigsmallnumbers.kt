import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter firstnumber:")
    var firstnumber =read.nextInt()

    println("Enter secondnumber:")
    var secondnumber =read.nextInt()

    println("Enter thirdnumber:")
    var thirdnumber =read.nextInt()

    if (firstnumber>secondnumber && firstnumber>thirdnumber){
        println("Biggest number is $firstnumber")}
    else if (firstnumber<secondnumber && secondnumber>thirdnumber){
        println("Biggest number is $secondnumber")}
    else {
        println("Biggest number is $thirdnumber")
        }
    
}