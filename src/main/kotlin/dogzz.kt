class dog(var Breed:String,var Size:String,var Age:String,var Color:String){

}
fun main(){
    var dog1=dog("Neopolitan Mastiff","Large","5 years","Black")

    var dog2=dog(" Maltese","Small","2 years","white")

    var dog3=dog("Chow Chow","Medium","3 years","Brown")


    fun Eat(){
        println("eating")
    }
    fun Sleep(){
        println("sleeping")
    }
    fun Sit(){
        println("sitting")
    }
    fun Run(){
        println("running")
    }

    println(dog1.Breed)
    println(dog2.Breed)
    println(dog3.Breed)
}