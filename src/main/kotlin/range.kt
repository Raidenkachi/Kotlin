fun main(){
    for (letter in 'a'..'f'){
        println(letter)}

    for (number in 10..15){
        if (number==12)
            continue
        println(number)
    }

    for (myletter in 'a'..'f'){
        if(myletter =='c'){
            continue
        }
        println(myletter)}


}