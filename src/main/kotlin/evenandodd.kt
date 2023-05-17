import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    var num1=read.nextInt()
    println()

    if (num1%2==0)
        println("Even number")

    else{
        println("odd number")
    }
}