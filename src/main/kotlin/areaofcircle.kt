import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter Radius:")
    var radius=read.nextInt()


    val pi=3.142

    var area=pi*radius*radius
    println( "The area of the circle is $area")
    var y=area.toInt()
    println(y)




}
