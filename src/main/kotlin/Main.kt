fun main() {
    // enum-класс

    when (readln()) {
        "декабрь", "январь", "февраль" -> println("зима")
        "март", "апрель", "май" -> println("весна")
        "июнь", "июль", "август" -> println("лето")
        "сентябрь", "октябрь", "ноябрь" -> println("осень")
        else -> println("не найдено")
    }

    // какие проблемы с таким подходом?
    // 1) перевод на английский - лезть в код
    // 2) легко ошибиться, повторив похожую логику несколько раз
    // 3) есть возможность ввести несуществующий месяц (else)

    // для решения проблемы создаем enum class
    val month =
        Months.AUGUST // в классе Months есть всего 12 различных значений -> переменная не может содержать других значений
    val season = when (month) {
        Months.DECEMBER, Months.JANUARY, Months.FEBRUARY -> Seasons.WINTER
        Months.MARCH, Months.APRIL, Months.MAY -> Seasons.SPRING
        Months.JUNE, Months.JULY, Months.AUGUST -> Seasons.SUMMER
        Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER -> Seasons.AUTUMN
    }

    // также можно получить параметр объекта enum class'а
    println(month.temperatureAverage)

    // использовать константы или перечисления? константы - +производительность(меньший объем памяти), перечисления - удобнее
}