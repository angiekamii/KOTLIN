import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)


    println("Enter first number:")
    var num1=read.nextFloat()



    println("Enter second number:")
    var num2=read.nextFloat()

    println("Enter operator")
    var op= readLine()

    var answer=when(op){
        "+"-> num1+num2
        "-"-> num1+num2
        "/"-> num1+num2
        "*"-> num1+num2
        else->"invalid operator"
}
    println(answer)

}
