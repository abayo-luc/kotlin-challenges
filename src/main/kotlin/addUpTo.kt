fun addUpTo(n:Int):Int{
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    return sum
  //  return (1..n).sum()
}

fun main(){
    println(addUpTo(1) == 1)
    println(addUpTo(3) == 6)
    println(addUpTo(10) == 55)
}