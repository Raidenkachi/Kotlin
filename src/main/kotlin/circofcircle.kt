import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter diameter:")
    var diameter=read.nextInt()
    
    val pi=3.142

    var perimeter=pi*diameter
    println("The perimeter of this circle is $perimeter")

}