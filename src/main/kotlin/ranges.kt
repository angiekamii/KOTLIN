fun main(){
    for (number in 10..15)
        println(number)
    for (letters in 'c'..'f')
        println(letters)

    for (num in 1..10){
        if(num==6)
            break
        println(num)
    }
    for (alphabets in 'a'..'t'){
        if (alphabets=='c')
            continue
        println(alphabets)
    }


}