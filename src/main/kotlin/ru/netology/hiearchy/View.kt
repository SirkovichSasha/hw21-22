package ru.netology.hiearchy

open class View() {
    open fun click() {
        println(this.javaClass.toString() + " clicked")
    }
}

