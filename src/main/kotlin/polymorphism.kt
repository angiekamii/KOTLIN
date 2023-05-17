open class Shape{
    open fun draw(){
        println("drawing")
    }
}

class rectangle: Shape() {
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Square: Shape() {
    override fun draw(){
        println("drawing a square")
    }
}
fun main(){
    var rec=rectangle()
    rec.draw()
    var sq=Square()
    
}