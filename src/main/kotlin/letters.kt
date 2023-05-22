import java.util.Scanner

fun main(args: Array<String>){
    var read=Scanner(System.`in`)
    
    println("Enter Char:")
    var letter= read.next()[0]
    when (letter){
        'a','e','i','o','u','A','E','I','O','U'  -> println("The character is a vowel")
        else -> println("The character is a consonant")
    }
    
}