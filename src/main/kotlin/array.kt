fun main(){
    var language= arrayOf("Python","Javascript","Kotlin")
    language[2]="c++"
    println(language)

    var lang=language.plus("laravel")
    for (x in lang){
        println(x)
    }

    println(language.size)
    println(lang.size)


}