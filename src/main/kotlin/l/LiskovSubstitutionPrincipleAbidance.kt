package l

/**
 * If S is a subtype of T, then objects of type T in a program may
 * be replaced with objects of type S without altering any of the
 * desirable properties of that program.
 * In other words:
 * Objects in a program should be replaceable with instances of their
 * subtypes without altering the correctness of that program.
 */

interface CoffeeMaker {
    fun makeCoffee()
}

open class JohnTheBetterCoffeeMaker : CoffeeMaker {
    override fun makeCoffee() {
        println("I can make better Coffee!")
        println("I am making one...")
        println("Here you go ☕")
    }
}

class BobTheBetterMilkManAndCoffeeMaker : JohnTheBetterCoffeeMaker() {
    override fun makeCoffee() {
        println("Now I can make better Coffee too!")
        println("I am making one...")
        println("Here's your cappuccino ☕")
    }

    fun giveMilk() {
        println("I specialize in milk distribution")
        println("Here's a glass of milk \uD83E\uDD5B for you")
    }
}

fun main() {
    //Hey John, can you make some coffee for me?
    val johnTheBetterCoffeeMaker : CoffeeMaker = JohnTheBetterCoffeeMaker()
    johnTheBetterCoffeeMaker.makeCoffee()

    //Hey Bob, can you make some coffee for me?
    val bobTheBetterMilkMan : CoffeeMaker = BobTheBetterMilkManAndCoffeeMaker()
    bobTheBetterMilkMan.makeCoffee()
    //Sure, Since I am
}