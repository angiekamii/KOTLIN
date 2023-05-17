import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    var num=read.nextFloat()


   if (num<0){
       println("$num number is negative")
   }
    else if (num>0) {
       println("$num number is positive")
   }
    else{
        println("$num is 0")
   }

}