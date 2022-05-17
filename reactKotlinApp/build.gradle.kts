plugins {
    kotlin("js")
}

group = "me.savcheg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}

dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.0.0-pre.331-kotlin-1.6.20")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.0.0-pre.331-kotlin-1.6.20")
    implementation(npm("react", "17.0.2"))
    implementation(npm("react-dom", "17.0.2"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-css:18.0.0-pre.331-kotlin-1.6.20")
    implementation(project(mapOf("path" to ":shared")))
}

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().nodeVersion =
        "16.0.0"
}
