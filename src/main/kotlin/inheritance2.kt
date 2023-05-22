open class Figure{
    var Area:Int=500
    var Perimeter:Int=500
    var Draw:Int=500

    fun Start(){
        println("Starting")
    }
}
open class Rectangle:Figure(){
    var Width=345
    var Height=34
    }
class Circle:Figure(){
    var Radius:Int=234
}
class Square:Rectangle(){

}

fun main(){
    var r=Rectangle()
    println(r.Height)
    var c=Circle()
    println(c.Radius)
    var s=Square()
    println(s.Draw)
}
