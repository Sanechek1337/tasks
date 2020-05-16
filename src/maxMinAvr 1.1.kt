//Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

fun main() {
    val massIve = mutableListOf<Int>()
    var maxValue = 0
    var minValue = 100
    var sum = 0.0

    //Создание массива
    for (i in 0..9) {
        massIve.add((0..100).random())
    }

    //Вычисление максимального, минимального, среднего значения
    for (i in 1..9) {
        if (massIve[i-1] > massIve[i] && maxValue < massIve[i-1]) { //Поиск максимального значения
            maxValue = massIve[i-1]
        }
        if (massIve[i-1] < massIve[i] && minValue > massIve[i-1]) { //Поиск минимального значения
            minValue = massIve[i-1]
        }
    }

    for (i in massIve) {
        sum += i //Суммирование всех элементов массива
    }

    println("list = $massIve")
    println("max = $maxValue")
    println("min = $minValue")
    println("avr = ${sum / massIve.size}")
}