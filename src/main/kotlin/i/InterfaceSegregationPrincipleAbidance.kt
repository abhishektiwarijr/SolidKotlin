package i

/**
 * Clients should not be forced to depend on methods that they do not use.
 * When a Class is required to perform actions that are not useful,
 * it is wasteful and may produce unexpected bugs
 * if the Class does not have the ability to perform those actions.
 *
 * A Class should perform only actions that are needed to fulfil its role.
 * Any other action should be removed completely or moved somewhere else
 * if it might be used by another Class in the future.
 *
 * This principle says that splitting a set of actions into smaller sets
 * so that a Class executes ONLY the set of actions it requires.
 */


interface Cutterable {
    fun cut()
}

interface Drivable {
    fun drive()
}

interface Cookable {
    fun cook()
}

interface Paintable {
    fun paint()
}

interface Jumpable {
    fun jump()
}

class JustAHappyCutter : Cutterable {
    override fun cut() {
        println("I can cut")
        println("I am cutting")
        println("I am happy")
    }
}

class JustAHappyDriver : Drivable {
    override fun drive() {
        println("I can drive")
        println("I am driving")
        println("I am happy")
    }
}

class JustAHappyChef : Cookable {
    override fun cook() {
        println("I can cook")
        println("I am cooking")
        println("I am happy")
    }
}

class JustAHappyPainter : Paintable {
    override fun paint() {
        println("I can paint")
        println("I am painting")
        println("I am happy")
    }
}

class Jumper : Jumpable {
    override fun jump() {
        println("I can time-jump \uD83D\uDE0E")
    }
}