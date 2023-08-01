enum class Months(val temperatureAverage: Int) { // конструктор - средняя температура
    JANUARY(4), FEBRUARY(6), MARCH(10), // обязательная передача параметра при объявленном конструкторе
    APRIL(14), MAY(15), JUNE(20),
    JULY(23), AUGUST(22), SEPTEMBER(19),
    OCTOBER(15), NOVEMBER(10), DECEMBER(6)
}