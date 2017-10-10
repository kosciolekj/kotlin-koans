package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            year != other.year -> return year - other.year
            month != other.month -> return month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {



    operator fun contains(d: MyDate): Boolean {
        val dCal: Calendar = Calendar.getInstance()
        dCal.set(d.year, d.month, d.dayOfMonth)

        val startCal: Calendar = Calendar.getInstance()
        startCal.set(start.year, start.month, start.dayOfMonth)

        val endCal: Calendar = Calendar.getInstance()
        endCal.set(endInclusive.year, endInclusive.month, endInclusive.dayOfMonth)

        return dCal.timeInMillis >= startCal.timeInMillis && dCal.timeInMillis <= endCal.timeInMillis
    }


}

