fun main(){
    //Predefined functions
    println("Hello Loko")

    var squareroot=Math.sqrt(256.0)
    println(squareroot)

    var roundoff=Math.round(34.56)
    println(roundoff)

    var number =Math.ceil(23.45)
    println(number)

    myFun()
    tudum()
    details("Loko",100)
    details("Dexter",70)
}

//User-defined Functions

fun myFun(){
    println("Furahiday")
}

fun tudum(){
    var num1=2
    var num2=3
    println(num1+num2)
}

fun details(name:String, age:Int){
    println("$name is $age years old")
}