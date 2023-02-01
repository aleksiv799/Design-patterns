package com.design.patterns.singleton

object Foo{
    fun doSomething() {
        println("Do Something!")
    }
}

class SingletonImpl {
    var message = "Into in singleton class"

    companion object {
        private var INSTANCE: SingletonImpl? = null

        val instance: SingletonImpl
        get() {
            if (INSTANCE == null) {
                INSTANCE = SingletonImpl()
            }
            return INSTANCE!!
        }

    }
}


fun main (args: Array<String>) {
    Foo.doSomething()
}