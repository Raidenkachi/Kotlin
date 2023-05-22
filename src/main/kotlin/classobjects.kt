class  Person{
    //Properties/Variables/Data members/Attributes
    var name:String="Loko"
    var age:Int=100
    var location:String="Timbuktu"
    var height:Double=6.5

    //Methods/Functions
    fun eat(){
        println("eating")
    }
    fun walk(){
        println("walking")
    }
}
fun main(){
    var teacher=Person()
    teacher.eat()
    println(teacher.name+ ' '+teacher.age.toString()+ ' '+teacher.location+' '+teacher.height.toString())

    var gari=Car1()
    gari.drive()
    println(gari.color+ ' '+gari.make+' '+gari.model+' '+gari.drivingSpeed)

}

class  Car1{
    var make:String="BMW"
    var model:String="Beast"
    var color:String="Black"
    var drivingSpeed:Int=180

    fun drive(){
        println("driving")
    }
    fun turn(){
        println("turning")
    }
    fun stop(){
        println("stopping")
    }
}