package main

import Person
interface StringProvider{
    val placeHolder: String
    fun getString(id : Int): String = id.toString()
}
interface ResourceProvider : StringProvider{
    fun getDimension(id: Int): Long = id.toLong()
}
class DefaultResourceProvider : StringProvider{
    override val placeHolder: String
        get() = "<placeholder>"
    override fun getString(id: Int): String {
        return "id: $id"
    }
    fun getDimension(id: Int): Long{
        return id.toLong()
    }
}

fun main(){
    val someVariable : Any ? = null
    if(someVariable is StringProvider){
        println("this is stringprovider")
    }
    val stringProvider : StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(5))
    println(stringProvider.placeHolder)
}