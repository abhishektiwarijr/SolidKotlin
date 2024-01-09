package d

/**
 * - High-level modules should not depend on low-level modules.
 *   Both should depend on the abstraction.
 * - Abstractions should not depend on details.
 *   Details should depend on abstractions.
 *
 * This principle focuses at reducing the dependency of
 * a high-level Class on the low-level Class by introducing an interface.
 *
 *
 * High-level Module(or Class): Class that executes an action with a technology.
 *
 * Low-level Module (or Class): The technology that is needed to execute the action
 *
 * Abstraction: Represents an interface that connects the two Classes.
 *
 * Details: How the technology works
 */



/**
 * This is High-level module.
 */
class BetterMobileApplicationDevelopmentService(
    private val technology: MobileDevelopmentTechnology
) {
    /**
     * We could do that, but the High-level module are designed in this way
     * Flexible, but not changing so frequently.
     *
     * When you develop an app using a technology, you don't change
     * the technology in the middle of the development.
     *
     * Even if you change, the full development will be with new technology
     * So that's why I've passed technology inside the constructor.
     * I hope I was able to explain.
     */
    fun developMobileApps() {
        technology.developMobileApps()
    }
}

interface MobileDevelopmentTechnology {
    fun developMobileApps()
}

class FlutterDevelopmentTechnology : MobileDevelopmentTechnology {
    override fun developMobileApps() {
        println("developing with Flutter")
    }
}

class ReactNativeDevelopmentTechnology : MobileDevelopmentTechnology {
    override fun developMobileApps() {
        println("developing with React Native")
    }
}

class KotlinMultiplatformDevelopmentTechnology : MobileDevelopmentTechnology {
    override fun developMobileApps() {
        println("developing with Kotlin Multiplatform Mobile")
    }

}

class IonicDevelopmentTechnology : MobileDevelopmentTechnology {
    override fun developMobileApps() {
        println("developing with Ionic")
    }
}

fun main() {
    //Now you can change Technologies easily in your service
    val betterMobileAppDevService = BetterMobileApplicationDevelopmentService(
        FlutterDevelopmentTechnology()
    )
    /**
     * You must be thinking that,
     * couldn't we pass the technology inside the method below directly
     *
     * To get clarity, Go inside the method and read comment
     */
    betterMobileAppDevService.developMobileApps()
}

