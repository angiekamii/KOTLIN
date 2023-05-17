fun main(){
    var languages= arrayOf("Python","Kotlin", "Java")
    println(languages[0])//accessing an element


    languages[0]="Javascript"
    println(languages[0])//changing an element

    for(c in languages){
        println(c)//using for loop
    }
    var language=languages.plus("Python")//adding elements
    for (lang in language)
        println(lang)

    println(languages.size)//finding the length
}

