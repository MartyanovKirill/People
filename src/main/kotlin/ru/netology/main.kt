package ru.netology

fun main() {

    println("Введите кол-во лайков: ")
    var likes = readln().toInt()    // Ввод количества лайков
    var people: String = "человеку"

    if (likes%10 == 1) {
        people = "человеку"
    }

    else if (likes >= 2 && likes <= 5) {
        people = "человекам"
    }

    else if (likes%10 == 0 || likes%10 == 2 || likes%10 == 3 || likes%10 == 4 || likes%10 == 5
        || likes%10 == 6 || likes%10 == 7 || likes%10 == 8 || likes%10 == 9 || likes%100 == 11) {
        people = "людям"
    }

    println("Понравилось: $likes $people")
}