class Mbwa(var Breed:String,var size:String, var age:Int, var color:String){
    fun eat(){
        println("eating")
    }
    fun sleep() {
        println("sleeping")
    }

    fun sit() {
        println("Siting")
    }
    fun run() {
        println("running")
    }
}


fun main(){
    var dog=Mbwa("Neapolitan", "Large", 5 ,"Black")
    println(dog.Breed)
    dog.sleep()

    var dog1=Mbwa("Maltese", "Small", 2,"White")
    println(dog1.Breed)

    var dog2=Mbwa("Chow Chow", "Medium", 5 ,"Brown")
    println(dog2.Breed)
}