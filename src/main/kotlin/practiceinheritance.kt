open class Figure{
    var start:Int=5

    fun Area(){
        println("The area is $start ")
    }
    fun Perimeter(){
        println("The Perimeter is $start ")
    }

}

class Circle: Figure() {
    var Radius:Int=49

    fun Areaa(){
        println("The area is ")
    }
    fun Perimeteer(){
        println("The perimeter is $Radius ")
    }

}

open class Rectangle: Figure() {
    var Width:Int=12
    var Height:Int=6

    fun Arrea(){
        println("The area is $Width ")
    }
    fun Perimeeter(){
        println("The perimeter is $Height")
    }


}

class square: Rectangle() {

}

fun main(){
    var c=Circle()
    c.Perimeteer()

    var r=Rectangle()
    r.Area()

    var s=square()
    println(s.Height)
}