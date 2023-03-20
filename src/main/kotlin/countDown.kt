fun countDown(n:Int): List<Int>{
    return (0..n).reversed().toList()
   // return (n downTo 0).toList()
}

fun main(){
    println(countDown(5))
}