
fun getFactorial(n:Int):Int = (n downTo 1).fold(1){
        accumulate, current -> accumulate * current
}

fun main() {
    println(getFactorial(2)==2)
    println(getFactorial(3) ==6 )
    println(getFactorial(6) == 720)
}