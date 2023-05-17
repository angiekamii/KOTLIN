class Person {
    //Variables/Properties/Attributes/Data members
    var name: String = "Angie"
    var age: Int = 25
    var location: String = "Nairobi"
    var YOB: Int = 1976

    fun eat() {
        println("Eating")
    }

    fun sleep() {
        println("sleeping")
    }


}
    fun main(){
        var teacher=Person()
        println(teacher.YOB)

        teacher.sleep()

        var mycar=Car()
        println(mycar.model +" "+ mycar.color +" "+ mycar.make +" "+ mycar.drivingspeed)

        mycar.turn()

}

class Car{
    var make="Nissan"
    var model="Nissan GT-R"
    var color="Black"
    var drivingspeed=330

    fun drive(){
        println("Turbo")

    }
    fun turn(){
        println(180)
    }
    fun stop(){
        println("Immediately")
    }

}

