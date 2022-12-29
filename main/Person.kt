open class Person(age : Int, protected val firstName : String, protected val lastName : String){
    init{
        check(age >= 0){
            "Person age can not be negative"
        }
    }
    val age : Int = age

    open fun printName() = println(firstName + lastName)
}