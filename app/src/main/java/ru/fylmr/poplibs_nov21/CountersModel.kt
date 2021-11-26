package ru.fylmr.poplibs_nov21

import androidx.annotation.IntRange

class CountersModel {

    private val counters = Counters(0, 0, 0)

    fun increment1(): Int {
        counters.counter1 += 1
        return counters.counter1
    }

    fun increment2(): Int {
        counters.counter2 += 1
        return counters.counter2
    }

    fun increment3(): Int {
        counters.counter3 += 1
        return counters.counter3
    }

    fun set(@IntRange(from = 0, to = 2) index: Int, value: Int) = when (index) {
        0 -> counters.counter1 = value
        1 -> counters.counter2 = value
        2 -> counters.counter3 = value
        else -> error("Неверный индекс")
    }
}

data class Counters(
    var counter1: Int,
    var counter2: Int,
    var counter3: Int
)