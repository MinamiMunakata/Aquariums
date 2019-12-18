import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
    swim(50, "slow")
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
) {
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day)
    shouldChangeWater(day, 20, 30)
    shouldChangeWater(day, dirty = 50)
}

fun randomDay(): String {
    val week = listOf(
        "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    )
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "flakes"
        "Monday" -> "red worms"
        "Tuesday" -> "granules"
        "Wednesday" -> "mosquitoes"
        "Thursday" -> "plankton"
        else -> "fasting"
    }
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}