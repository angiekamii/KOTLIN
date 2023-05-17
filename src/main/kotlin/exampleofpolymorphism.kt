open class shape{
    open fun area(){

    }
}
class circle: shape() {
    override fun area(){
        println("The area of the circle is 49.5")
    }
}
class triangle: shape() {
    override fun area(){
        println("the area of the triangle is 16")
    }
}
class trapezium: shape() {
    override fun area(){
        println("the area of the trapezium is 24")
    }
}

fun main(){
    var c=circle()
    c.area()

    var tri=triangle()
    tri.area()

    var trap=trapezium()
    trap.area()
}