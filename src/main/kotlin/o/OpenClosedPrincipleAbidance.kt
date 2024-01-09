package o

/**
 * Classes, modules, functions, should be open for extension,
 * but closed for modification
 * Open: We can add new features to our classes. When new requirement comes,
 * we should be able to add new features to our class easily.
 * Close: The base features of the class should not be changed.
 * Means, you can't add multiple arms to real me.
 */

interface Job {
    fun doWork()
}

class Cutting : Job {
    override fun doWork() {
        /**
         * I can do cutting
         */
        println("I am cutting")
    }
}

class Painting : Job {
    override fun doWork() {
        /**
         * Now, I can do painting
         */
        println("I am painting")
    }
}

class Driving : Job {
    override fun doWork() {
        /**
         * Now, I can do driving
         */
        println("I am driving")
    }
}

class Cleaning : Job {
    override fun doWork() {
        /**
         * Now, I can do cleaning
         */
        println("I am cleaning")
    }
}

class Cooking : Job {
    override fun doWork() {
        /**
         * Now, I can do painting
         */
        println("I am painting")
    }
}

/**
 * I am SmartWorkingGuy, you can tell me anything to do.
 * Just pass me the specific job.😎
 */
class SmartWorkingGuy {
    fun doJob(job: Job) {
        job.doWork()
    }
}

fun main() {
    val smartWorkingGuy = SmartWorkingGuy()
    smartWorkingGuy.doJob(Cutting())
    smartWorkingGuy.doJob(Cooking())
    smartWorkingGuy.doJob(Painting())
    smartWorkingGuy.doJob(Cleaning())
    smartWorkingGuy.doJob(Driving())
}