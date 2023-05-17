fun main(){
    var name:String="Hello World"
    println(name)
    println(name[1])


    var fullname="Angie" +" Mukami"
    println(fullname)

    var fname="Stephanie"
    var lname="Mburugu"
    println(fname.plus(lname))
    println(fname.toUpperCase())
    println(fname.length)

    println("Hey" + fullname)
    println("Hey $fname")//string intapolation
    println(name.indexOf("World"))
}