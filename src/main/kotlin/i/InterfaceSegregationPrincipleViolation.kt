package i

/**
 * I am an AllRounder interface, any client who implements me will
 * have to do everything that I have contracts of...😈😏
 * Isn't that frustrating?
 */
interface AllRounder {
    fun cut()
    fun drive()
    fun cook()
    fun paint()
    fun jump()
}

/**
 * I just want to cut, nothing else.
 * But I am required to perform actions that are not useful,
 * It is wasteful and may produce unexpected bugs
 * I don't have the ability to perform those actions other than cutting.
 */
class JustACutterNothingElse : AllRounder {
    override fun cut() {
        println("I can cut")
        println("I am cutting")
        println("I am happy")
    }

    override fun drive() {
        println("\uD83E\uDD72 \uD83E\uDD79 \uD83D\uDE35\u200D\uD83D\uDCAB")
    }

    override fun cook() {
        println("\uD83E\uDD72 \uD83E\uDD79 \uD83D\uDE35\u200D\uD83D\uDCAB")
    }

    override fun paint() {
        println("\uD83E\uDD72 \uD83E\uDD79 \uD83D\uDE35\u200D\uD83D\uDCAB")
    }

    override fun jump() {
        println("\uD83E\uDD72 \uD83E\uDD79 \uD83D\uDE35\u200D\uD83D\uDCAB")
    }
}