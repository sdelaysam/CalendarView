package com.kizitonwose.calendarviewsample

import org.joda.time.LocalTime
import org.joda.time.YearMonth


private typealias Airport = Flight.Airport

fun generateFlights(): List<Flight> {
    val list = mutableListOf<Flight>()
    val currentMonth = YearMonth.now()

    val currentMonth17 = currentMonth.toLocalDate(17)
    currentMonth17.toLocalDateTime(LocalTime(14, 0))
    list.add(Flight(currentMonth17.toLocalDateTime(LocalTime(14, 0)), Airport("Lagos", "LOS"), Airport("Abuja", "ABV"), R.color.brown_700))
    list.add(Flight(currentMonth17.toLocalDateTime(LocalTime(21, 30)), Airport("Enugu", "ENU"), Airport("Owerri", "QOW"), R.color.blue_grey_700))

    val currentMonth22 = currentMonth.toLocalDate(22)
    list.add(Flight(currentMonth22.toLocalDateTime(LocalTime(13, 20)), Airport("Ibadan", "IBA"), Airport("Benin", "BNI"), R.color.blue_800))
    list.add(Flight(currentMonth22.toLocalDateTime(LocalTime(17, 40)), Airport("Sokoto", "SKO"), Airport("Ilorin", "ILR"), R.color.red_800))

    list.add(
        Flight(
            currentMonth.toLocalDate(3).toLocalDateTime(LocalTime(20, 0)),
            Airport("Makurdi", "MDI"),
            Airport("Calabar", "CBQ"),
            R.color.teal_700
        )
    )

    list.add(
        Flight(
            currentMonth.toLocalDate(12).toLocalDateTime(LocalTime(18, 15)),
            Airport("Kaduna", "KAD"),
            Airport("Jos", "JOS"),
            R.color.cyan_700
        )
    )

    val nextMonth13 = currentMonth.plusMonths(1).toLocalDate(13)
    list.add(Flight(nextMonth13.toLocalDateTime(LocalTime(7, 30)), Airport("Kano", "KAN"), Airport("Akure", "AKR"), R.color.pink_700))
    list.add(Flight(nextMonth13.toLocalDateTime(LocalTime(10, 50)), Airport("Minna", "MXJ"), Airport("Zaria", "ZAR"), R.color.green_700))

    list.add(
        Flight(
            currentMonth.minusMonths(1).toLocalDate(9).toLocalDateTime(LocalTime(20, 15)),
            Airport("Asaba", "ABB"),
            Airport("Port Harcourt", "PHC"),
            R.color.orange_800
        )
    )

    return list
}
