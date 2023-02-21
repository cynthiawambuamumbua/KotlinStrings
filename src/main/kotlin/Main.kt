fun main(){
    school()
    var stmt = (nameCarol("Carol", 62))
    println(stmt)
    println(number("713504579"))
    myname("Purity")

}
fun school(){
    var school = "Akirachix"
    println(school[0]+""+school[2]+""+school[3])
}
fun nameCarol(name: String, Age:Int): String{
    var stmt = "Hi, my name is $name and i am $Age years old"
    return(stmt)
}
fun number(number: String){
    number.length
    println(number)
}
fun myname(name: String){
        if (name.equals("Eric")) {
            println("That's me")
        }else
            println("i don't know who that is")
}


