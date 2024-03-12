import java.util.*

fun main(args: Array<String>) {
    // println("Hello, ${args[0]}")

    /*val isUnit = println("This is an expression")
    println(isUnit)*/

    /* val temperature = 10
    //val isHot = if (temperature > 50) true else false
    val message = "The water temperature is ${if(temperature>50) "too warm"
        else "OK"}."
    println(message)*/
    feedTheFish()

    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter

    val decorations = listOf ("rock", "pagoda",
        "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter {it[0] == 'p'}
    println("eager :$eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it}

        println("lazy: $lazyMap")
        println("-----")
        println("first: ${lazyMap.first()}")
        println("-----")
        println("all: ${lazyMap.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
    }



fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
}

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println ("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}");
    }

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun swim(speed: String ="fast"){
    println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
