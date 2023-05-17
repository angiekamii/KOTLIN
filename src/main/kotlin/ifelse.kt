import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter temperature:")
    var temp=read.nextInt()
    
   

    if (temp<37){
        println("Too cold")
    }
    else if (temp>37){
        println("Too hot")
    }
    else{
        println("Moderate temp ")
    }

}