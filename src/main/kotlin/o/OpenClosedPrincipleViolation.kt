package o

/**
 * I am a FixedWorkingGuy, I can do 2 things only.
 * That's all I know.
 * you can't tell me anything else to do.😙
 */
class FixedWorkingGuy {

    fun doJob(operation: String) {
        when (operation) {
            "cut" -> {
                cut()
            }

            "cook" -> {
                cook()
            }

            else -> throw IllegalArgumentException("Not in my pay grade")
        }
    }

    private fun cut() {
        println("I am cutting")
    }

    private fun cook() {
        println("I am cooking")
    }

}

fun main() {
    val fixedWorkingGuy = FixedWorkingGuy()
    fixedWorkingGuy.doJob("cut")
    fixedWorkingGuy.doJob("cook")

    //This I can not do
    fixedWorkingGuy.doJob("drive")
}