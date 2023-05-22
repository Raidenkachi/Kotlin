class Dog(var name:String, var breed:String, var color:String,var age:Int,var weight:Int){
    fun speak(talk:String){
        println(talk)
    }
}
fun main(){
    var Dog1=Dog("Tito","kienyeji","black",4,12)

    var Dog2=Dog("Bruno","Pitbull","grey",4,20)

    println(Dog1.name)

    Dog1.speak("Crying")
}