fun countUpAndDown(n:Int): List<Int>{
    return (0..n)+ (n-1 downTo 0)
}

fun main(){
    println(countUpAndDown(1))
    println(countUpAndDown(2))
}