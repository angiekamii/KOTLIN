//Parent class
open class Animal{
    var age:Int=12
    var gender:String="Female"

    fun isMammal(){
        println("Mammalian")
    }
}
//Child classes
class Duck:Animal() {
    var color:String="white"

    fun swim(){
        println("Swimming")
    }
}

class Fish:Animal(){
    var isWild:Boolean=true
    fun swim(){
        println("Swimming")
    }
}

class Horse:Animal(){
    var boolean:Boolean=false
    fun run(){
        println("Running")
    }
}
fun main(){
    var d=Duck()
    println(d.isMammal())
    var f=Fish()
    println(f.swim())
    var h=Horse()
    println(h.boolean)
}

