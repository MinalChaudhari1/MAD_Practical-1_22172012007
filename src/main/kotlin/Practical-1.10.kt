class Student(var no:Int){
    var name : String =""
    constructor(n:Int,s:String):this(n){
        name = s
    }
    init {
        println("Init called")
    }

}
fun main(){
    var s1 = Student(111)

    println(s1.no)



}