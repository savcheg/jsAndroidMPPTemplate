package me.savcheg.testofkmmformpp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}