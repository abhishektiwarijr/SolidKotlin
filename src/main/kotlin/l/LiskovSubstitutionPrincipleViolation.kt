package l

/**
 * I am JohnTheCoffeeMaker, I can make coffee easily.
 */
open class JohnTheCoffeeMaker {
    open fun makeCoffee() {
        println("I can make Coffee!")
        println("I am making one...")
        println("Here you go ☕")
    }
}

/**
 * Hi, I am Bob, Child of John
 */
class BobTheMilkMan : JohnTheCoffeeMaker() {
    override fun makeCoffee() {
        println("I am child of John but I can't make coffee.. Shame\uD83E\uDD72!")
        println("But here's a glass of milk \uD83E\uDD5B for you")
    }

    /**
     * I can only give milk
     */
    fun giveMilk() {
        println("Here's a glass of milk \uD83E\uDD5B for you")
    }
}

fun main() {
    //Hey John, make some coffee for me
    val johnTheCoffeeMaker = JohnTheCoffeeMaker()
    johnTheCoffeeMaker.makeCoffee()

    //Sorry...🥲, I can't make coffee even though I am son of John
    val bobTheMilkMan : JohnTheCoffeeMaker = BobTheMilkMan()
    bobTheMilkMan.makeCoffee()
}