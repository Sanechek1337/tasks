//Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

fun main() {
    val massIve = mutableListOf<Int>()
    var maxValue = 0
    var minValue = 100
    var sum = 0.0

    //Создание массива
    for (i in 0..99) {
        massIve.add((0..100).random())
    }

    //Вычисление максимального значения
    for (i in 1..99) {
        if (massIve[i-1] > massIve[i] && maxValue < massIve[i-1]) {
                maxValue = massIve[i-1]
            }
    }

    //Вычисление минимального значения
    for (i in 1..99) {
        if (massIve[i-1] < massIve[i] && minValue > massIve[i-1]) {
            minValue = massIve[i-1]
        }
    }

    //Вычисление суммы всех элементов массива
    for (i in massIve) {
        sum += i
    }

    println("list = $massIve")
    println("max = $maxValue")
    println("min = $minValue")
    println("avr = ${sum / massIve.size}")
}