 open class Animal{

    var age=12
    var gender="female"

    fun isMammal(){
        println("Animal is a mammal")
    }
}
class Duck:Animal(){
    var color="white"
    fun swim(){
        println("swimming")
    }
}
class Fish:Animal(){
    var canEat=true
    fun swim(){
        println("swimming")
    }
}
class Horse:Animal(){
    var isWild=false
    fun run(){
        println("running")
    }
}
 fun main(){
     var d=Duck()
     println(d.color)
     var f=Fish()
     f.swim()
     var h=Horse()
 }