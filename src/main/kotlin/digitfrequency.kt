fun digitFrequency(n:Int, i: Int): Boolean{
    var hasSameFrequency = false
    (n.toString()+ i.toString()).toList().groupBy { it }.forEach{
        hasSameFrequency = it.value.size % 2 == 0
    }
    return hasSameFrequency
}

fun main(){
    println(digitFrequency(234,898))
    println(digitFrequency(123,321))
}