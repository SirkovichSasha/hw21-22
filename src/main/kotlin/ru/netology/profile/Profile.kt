package ru.netology.profile

class Profile(
    val id:Int,
    login:String,
    val name:String,
    val lastname:String,
    var status:Status,
    avatar:String?=null
) {


    var login:String=login
        set(value) {
            if ('@' !in value) {
                println("Can't set/ Enter email adress")}
            else field=value
        }
        get() = field


    var avatar:String?=avatar
        set(value){}

    val fullname:String
    get()=name+" "+lastname

    override fun toString(): String {
        return "Profile(name='$name', lastname='$lastname', status=$status, avatar=$avatar, id=$id, login=$login)"
    }


}
 fun main() {
     val p1=Profile(305866830,"Eilat2020","Alexandra","Sirkovich",Status.HAPPY,"smile.jpg")
     val p2=Profile(305866835,"****","Somebody","Pretty",Status.MARRIED)
     p2.login="ffff"
     println(p1.fullname)
     println(p2.fullname)
 }