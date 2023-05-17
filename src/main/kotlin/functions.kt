fun main(){
    var squareroot=Math.sqrt(25.0)
    println(squareroot)

    var round=Math.ceil(3.9)
    println(round)

    var reil=Math.round(3.65)
    println(reil)

    myfun()
    add()
    details("Angie", 21)
}


//user defined function

fun myfun(){
    println("Today is a good day and there is no sunshine")
}
fun add(){
    var num1=56
    var num2=23
    println(num1+num2)
}
fun details(name:String , age:Int){
    println("my name is $name I'm $age")
}