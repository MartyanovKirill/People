package ru.netology

fun main() {

    println("Введите кол-во лайков: ")
    var likes = readln().toInt()    // Ввод количества лайков
    var people: String = "человеку"

    if (likes%10 == 1 && likes%100!=11) {
        people = "человеку"
    }

    else if (likes >= 2 && likes <= 5) {
        people = "человекам"
    }

    else {
        people = "людям"
    }

    println("Понравилось: $likes $people")
}