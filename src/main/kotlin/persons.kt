class Mtu(var name:String,var age:Int,var job_status:String,var gender:String){


}
fun main(){
    var Person1=Mtu("Rita",18, "unemployed","Female")
    println("My name is ${Person1.name} I'm ${Person1.age} ${Person1.job_status} ${Person1.gender}")

    var Person2=Mtu("David",43, "unemployed", "Male")
    println("My name is ${Person2.name} I'm ${Person2.age} ${Person2.job_status} ${Person2.gender}")





}