fun main() {
    val massIve = mutableListOf<Int>()

    //Создание массива
    for (i in 0..9) {
        massIve.add((0..100).random())
    }
    println(massIve)

    for (i in 0..9) { //Проход по всем элементам массива
        for (j in (1..9-i)) { //Перебор элементов
            if (massIve [j-1] > massIve[j]) {
                var x = massIve[j-1]
                massIve [j-1] = massIve[j]
                massIve [j] = x
            }
        }
    }

    println(massIve)
}