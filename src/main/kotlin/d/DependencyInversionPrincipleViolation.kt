package d

/**
 * This is High-level module.
 * A Mobile Application Development service which has a dependency
 * on the concrete class FlutterTechnology.
 *
 * You can develop mobile apps only with Flutter Technology
 */
class MobileApplicationDevelopmentService(private val flutterTechnology : FlutterTechnology) {
    fun developMobileApps() {
        flutterTechnology.developMobileApps()
    }
}

/**
 * This is Low-level module
 */
class FlutterTechnology {
    fun developMobileApps() {
        println("developing with Flutter")
    }
}

/**
 * This is client
 */
fun main() {
    //MobileApplicationDevelopmentService has a dependency on the concrete class FlutterTechnology
    // as there is a HAS-A relationship between the two.
    val mobileApplicationDevelopmentService = MobileApplicationDevelopmentService(FlutterTechnology())
    mobileApplicationDevelopmentService.developMobileApps()
}
