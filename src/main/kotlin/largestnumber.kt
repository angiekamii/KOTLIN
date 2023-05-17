import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var num = read.nextInt()



    println("Enter second number:")
    var num2 = read.nextInt()



    println("Enter third number:")
    var num3 = read.nextInt()


    if (num>num2 && num>num3){
        println("$num largest number")
    }
    else if (num2>num3 && num2>num){
        println("$num2 largest number")
    }
    else{
        println("$num3 largest number ")
    }


}