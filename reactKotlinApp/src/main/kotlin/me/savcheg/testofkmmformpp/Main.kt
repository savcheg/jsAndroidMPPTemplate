package me.savcheg.testofkmmformpp

import kotlinx.browser.document

fun main() {
    document.bgColor = "red"
    val div = document.getElementById("root")
    div!!.innerHTML += "<p>${greet()}</p>"
}

fun greet(): String {
    return Greeting().greeting()
}