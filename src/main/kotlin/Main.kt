import java.util.*

fun main(){
    takes()
    cities()
    numero()
    container()


}
fun takes(){
    val things= arrayOf("name","identity","nationality","dignity")
    println(things.contentToString())
}
fun cities(){
    var namecity= arrayOf("harare","mumba","dodoma","jakarta")
    var sortedcities=namecity.sortedArray()
    println(Arrays.toString(sortedcities))


}
fun numero(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=4+43
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun container(){
    val names= arrayOf("annette","Lynette","Eunice")
    println(names.contentToString())
}